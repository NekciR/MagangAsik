package com.example.finalproject;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.finalproject.helper.DatabaseHelper;


public class LoginActivity extends AppCompatActivity {
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = new DatabaseHelper(this);

        TextView TVRegister = findViewById(R.id.tv_register);
        Button BtnLogin = findViewById(R.id.btn_login);
        TVRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(LoginActivity.this  ,RegisterOptionActivity.class);
                    startActivity(intent);


            }
        });
        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            EditText EtUsername = findViewById(R.id.et_username);
            EditText EtPassword = findViewById(R.id.et_password);
            String Username = EtUsername.getText().toString().trim();
            String Password = EtPassword.getText().toString().trim();

            if(Username.isEmpty() || Password.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Please input Username and Password", Toast.LENGTH_SHORT).show();

            } else {
                if(db.loginUser(Username, Password)){
                    Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this, "No such account", Toast.LENGTH_SHORT).show();
                }
            }
        }});






//        TextView TVRegister = findViewById(R.id.tv_register);
//        String Register = "Don't have account? Register";
//        SpannableString SpanRegister = new SpannableString(Register);
//        ClickableSpan ClickRegis = new ClickableSpan() {
//            @Override
//            public void onClick(@NonNull View widget) {
//                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
//                startActivity(intent);
//            }
//        };


    }
}
