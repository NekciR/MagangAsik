package com.example.finalproject.helper;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.finalproject.model.User;

public class SharedPref {
    public static final String SHARED_PREF_NAME = "SharedPref";
    private SharedPreferences sharedPreferences;

    public SharedPref(Context context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
    }


    public void saveLogin(String username, int privilege) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", username);
        editor.putInt("privilege", privilege);
        editor.commit();
    }

    public User load(){
        User user = new User(sharedPreferences.getString("username", ""),"",sharedPreferences.getInt("privilege", -1));
        return user;
    }
}
