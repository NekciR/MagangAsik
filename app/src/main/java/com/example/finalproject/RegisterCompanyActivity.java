package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalproject.helper.DatabaseHelper;

public class RegisterCompanyActivity extends AppCompatActivity {
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_company);

        db = new DatabaseHelper(this);

        Button BtnRegisterCompany = findViewById(R.id.btn_register_company);
        BtnRegisterCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText EtUsername = findViewById(R.id.et_username);
                EditText EtPassword = findViewById(R.id.et_password);
                String Username = EtUsername.getText().toString().trim();
                String Password = EtPassword.getText().toString().trim();

                if(Username.isEmpty() && Password.isEmpty())
                {
                    Toast.makeText(RegisterCompanyActivity.this, "Please input Username and Password", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    boolean isInserted = db.registerUser(Username,Password,1);
                    if(isInserted){
                        Toast.makeText(RegisterCompanyActivity.this, "Register Successful", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(RegisterCompanyActivity.this, "Register Fail", Toast.LENGTH_SHORT).show();
                    }


                    Intent intent = new Intent(RegisterCompanyActivity.this, FormCompany.class);
                    startActivity(intent);
                    finish();
                }



            }
        });
    }
}
