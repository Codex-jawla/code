package com.example.collagelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_login);
    }

    public void loginCall(View view){
        Toast.makeText(this, "LOGIN SUCCESFULLY", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this, home.class);
        startActivity(intent);
    }
    public void open(View view){
        Toast.makeText(this, "Fill Details", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this, signup.class);
        startActivity(intent);
    }
}