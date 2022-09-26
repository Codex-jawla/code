package com.example.collagelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void open1(View view){
        Toast.makeText(this, "Add Book Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , add_book.class);
        startActivity(intent);
    }
    public void open2(View view){
        Toast.makeText(this, "Add Student Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , add_student.class);
        startActivity(intent);
    }
    public void open3(View view){
        Toast.makeText(this, "Book Details Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , book_details.class);
        startActivity(intent);
    }
    public void open4(View view){
        Toast.makeText(this, "Student Details Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , student_details.class);
        startActivity(intent);
    }
    public void open5(View view){
        Toast.makeText(this, "Book Issue Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , book_issue.class);
        startActivity(intent);
    }
    public void open6(View view){
        Toast.makeText(this, "Book Return Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , book_return.class);
        startActivity(intent);
    }
    public void open7(View view){
        Toast.makeText(this, "Statics Clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , statitics.class);
        startActivity(intent);
    }
}