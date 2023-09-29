package com.example.javaappversion21.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.javaappversion21.R;
import com.example.javaappversion21.databinding.ActivityLoginBinding;
import com.example.javaappversion21.databinding.ActivitySignupBinding;

public class Login_Activity extends AppCompatActivity {
//first activity when user opening the app for the first time
    private ActivityLoginBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //if user donot have a account
        binding.signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this , Signup_Activity.class);
                startActivity(intent);
                finish();
            }
        });

        //when user already have a account
        binding.logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this , MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}