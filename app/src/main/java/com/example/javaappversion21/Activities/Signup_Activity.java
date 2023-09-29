package com.example.javaappversion21.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.javaappversion21.R;
import com.example.javaappversion21.databinding.ActivitySignupBinding;

public class Signup_Activity extends AppCompatActivity {

    ActivitySignupBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //when user created the account he will forwarded to login activity
       binding.signUpButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Signup_Activity.this , Login_Activity.class);
               startActivity(intent);
               finish();
           }
       });
    }
}