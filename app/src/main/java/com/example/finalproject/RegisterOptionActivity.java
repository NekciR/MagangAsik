package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_option);

        Button BtnIntern = findViewById(R.id.btn_reg_intern);
        Button BtnCompany = findViewById(R.id.btn_reg_company);

        BtnIntern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterOptionActivity.this,RegisterInternActivity.class );
                startActivity(intent);
            }
        });

        BtnCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterOptionActivity.this,RegisterCompanyActivity.class);
                startActivity(intent);
            }
        });

    }
}
