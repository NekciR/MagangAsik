package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FormCompany extends AppCompatActivity {
    final String EmailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z]+\\.+[a-zA-Z]+";
    final String PhonePattern = "[0]+[1-9]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_company);


        final EditText EtCompanyName = findViewById(R.id.et_companyname);
        final EditText EtCompanyField = findViewById(R.id.et_companyfield);
        final EditText EtCompanyEmail = findViewById(R.id.et_companyemail);
        final EditText EtCompanyPhone = findViewById(R.id.et_companyphone);
        final EditText EtCompanyAddress = findViewById(R.id.et_companyaddress);

        Button BtnSubmitCompany = findViewById(R.id.btn_submit_company);


        BtnSubmitCompany.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                //Validate Email
                if(EtCompanyName.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please input your company name", Toast.LENGTH_SHORT).show();

                }else if(EtCompanyField.getText().toString().isEmpty()){
                        Toast.makeText(FormCompany.this, "Plase Input your company field", Toast.LENGTH_SHORT).show();

                }else if(EtCompanyEmail.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please input your company email",Toast.LENGTH_SHORT).show();

                }else if (!EtCompanyEmail.getText().toString().trim().matches(EmailPattern)) {
                    Toast.makeText(getApplicationContext(),"Invalid company email address",Toast.LENGTH_SHORT).show();

                }else if(EtCompanyPhone.getText().toString().isEmpty()){
                    Toast.makeText(FormCompany.this, "Please input your company phone number", Toast.LENGTH_SHORT).show();

                }else if (!EtCompanyPhone.getText().toString().matches(PhonePattern)){
                    Toast.makeText(FormCompany.this, "Not a valid phone number", Toast.LENGTH_SHORT).show();

                }else if(EtCompanyAddress.getText().toString().isEmpty()){
                    Toast.makeText(FormCompany.this, "Please Input your company address", Toast.LENGTH_SHORT).show();

                }else{

                    //Insert to database and intent to main page

                }
            }
        });
    }
}
