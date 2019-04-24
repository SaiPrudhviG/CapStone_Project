package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OtpActivity extends AppCompatActivity implements View.OnClickListener {

    EditText OtpEditText;
    Button otpsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        OtpEditText =(EditText)findViewById(R.id.otp);
        otpsubmit =(Button)findViewById(R.id.otp_submit);

        otpsubmit.setOnClickListener(OtpActivity.this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(OtpActivity.this,HomeActivity.class);
        startActivity(intent);
    }
}
