package com.example.finalproject.helper;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.finalproject.model.Company;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "MagangAsik.db";
    public static final String TABLE_USER = "user";
    public static final String COLUMN_USER_ID = "id";
    public static final String COLUMN_USER_USERNAME = "username";
    public static final String COLUMN_USER_PASSWORD = "password";
    public static final String COLUMN_USER_PRIVILEGE = "privilege";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_USER +" (id INTEGER PRIMARY KEY AUTOINCREMENT,username TEXT,password TEXT,privilege INTEGER )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_USER);
        onCreate(db);

    }

    public boolean registerUser(String username, String password, int privilege){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+TABLE_USER+" WHERE username=\'"+username+"\'",null);
        if(res.getCount() > 0){
            return false;
        }

            ContentValues ContentValues = new ContentValues();
            ContentValues.put(COLUMN_USER_USERNAME, username);
            ContentValues.put(COLUMN_USER_PASSWORD, password);
            ContentValues.put(COLUMN_USER_PRIVILEGE, privilege);
            long Result = db.insert(TABLE_USER, null, ContentValues);

        if(Result == -1){
            return false;
        }else{
            return true;
        }
    }

    public boolean loginUser(String username,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM "+TABLE_USER+" WHERE username=\'"+username+"\' AND password=\'"+password+"\'";
        Cursor res = db.rawQuery(query,null);
        if(res.getCount() > 0) {
            return true;
        }
        return false;

    }


}
