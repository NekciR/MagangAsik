package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FormIntern extends AppCompatActivity {
    final String EmailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z]+\\.+[a-zA-Z]+";
    final String PhonePattern = "[0]+[1-9]+";
    String GenderValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_intern);

        final EditText EtEmail = findViewById(R.id.et_email);
        final EditText EtFullName = findViewById(R.id.et_fullname);
        final RadioGroup RgGender = findViewById(R.id.rg_gender);
        final EditText EtPhone = findViewById(R.id.et_phone);
        final EditText EtAddress = findViewById(R.id.et_address);
        final EditText EtEducation = findViewById(R.id.et_education);
        Button BtnSubmitIntern = findViewById(R.id.btn_submit_intern);

        BtnSubmitIntern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton RbSelectedGender = findViewById(RgGender.getCheckedRadioButtonId()) ;

                //Validation
                if(EtFullName.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please input your fullname",Toast.LENGTH_SHORT).show();

                }else if(EtEmail.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please input your email",Toast.LENGTH_SHORT).show();

                }else if (!EtEmail.getText().toString().trim().matches(EmailPattern)) {
                    Toast.makeText(getApplicationContext(),"Invalid email address",Toast.LENGTH_SHORT).show();

                }else if(EtPhone.getText().toString().isEmpty()){
                    Toast.makeText(FormIntern.this, "Please input your phone number", Toast.LENGTH_SHORT).show();

                }else if (!EtPhone.getText().toString().matches(PhonePattern)){
                    Toast.makeText(FormIntern.this, "Not a valid phone number", Toast.LENGTH_SHORT).show();

                }else if(EtAddress.getText().toString().isEmpty()){
                    Toast.makeText(FormIntern.this, "Please Input your address", Toast.LENGTH_SHORT).show();

                }else if(EtEducation.getText().toString().isEmpty()){
                    Toast.makeText(FormIntern.this, "Plase Input your last education", Toast.LENGTH_SHORT).show();

                }else{

                    //Insert to database and intent to main page

                }





            }

        });








        //Spinner Adapter
//        ArrayAdapter<String> SpAdapter = new ArrayAdapter<String>(FormIntern.this,
//                android.R.layout.simple_list_item_1,
//                getResources().getStringArray(R.array.gender));
//
//        SpAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        SpGender.setAdapter(SpAdapter);







    }
}
