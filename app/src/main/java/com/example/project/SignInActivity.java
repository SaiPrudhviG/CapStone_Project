package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mobileno;
    Button Proceed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mobileno = (EditText)findViewById(R.id.signIn_mobile);
        Proceed =(Button)findViewById(R.id.signIn_proceed);

        Proceed.setOnClickListener(SignInActivity.this);
    }

    @Override
    public void onClick(View v) {
        String mobile = mobileno.getText().toString();
        if(mobile.isEmpty())
        {
            mobileno.setError("Enter Mobile No.");
            mobileno.requestFocus();
            return;
        }
        if (mobile.length()<10 || mobile.length()>10)
        {
            mobileno.setError("Enter Valid Mobile No.");
            mobileno.requestFocus();
            return;
        }
        Intent intent = new Intent(SignInActivity.this,OtpActivity.class);
        intent.putExtra("Mobile",mobile);
        startActivity(intent);
    }

}
