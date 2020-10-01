package com.example.notesmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class SignUpPage extends AppCompatActivity {

    EditText edtTextName, edtTextUserName, edtTextEmailAddress, edtTextPhone, edtTextPassword;
    Button ButtonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        edtTextName = findViewById(R.id.edtTextName);
        edtTextUserName = findViewById(R.id.edtTextUserName);
        edtTextEmailAddress = findViewById(R.id.edtTextEmailAddress);
        edtTextPhone = findViewById(R.id.edtTextPhone);
        edtTextPassword = findViewById(R.id.edtTextPassword);
        ButtonSignUp = findViewById(R.id.ButtonSignUp);

        ButtonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), VerifyOTP.class);
                intent.putExtra("phoneNo", edtTextPhone.getText().toString());
                startActivity(intent);
            }
        });

    }
}