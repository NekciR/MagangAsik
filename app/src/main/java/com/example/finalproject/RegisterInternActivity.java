package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalproject.helper.DatabaseHelper;

public class RegisterInternActivity extends AppCompatActivity {
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_intern);

        db = new DatabaseHelper(this);

        Button BtnRegisterIntern = findViewById(R.id.btn_register_intern);
        BtnRegisterIntern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText EtUsername = findViewById(R.id.et_username);
                EditText EtPassword = findViewById(R.id.et_password);
                String Username = EtUsername.getText().toString().trim();
                String Password = EtPassword.getText().toString().trim();

                if(Username.isEmpty() && Password.isEmpty())
                {
                    Toast.makeText(RegisterInternActivity.this, "Please input Username and Password", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    boolean isInserted = db.registerUser(Username,Password,0);
                    if(isInserted){
                        Toast.makeText(RegisterInternActivity.this, "Register Successful", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(RegisterInternActivity.this, "Register Fail", Toast.LENGTH_SHORT).show();
                    }


                    Intent intent = new Intent(RegisterInternActivity.this, FormIntern.class);
                    startActivity(intent);
                    finish();
                }


            }
        });
    }
}
