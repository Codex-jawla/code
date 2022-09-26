package com.example.collagelibrary;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class signup extends AppCompatActivity {
   public EditText txt_mail;
    public EditText txt_pass;
    public Button crt;
    public dbhelper dbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

        public void adduser(View view) {
            txt_mail.findViewById(R.id.email);
            txt_pass.findViewById(R.id.pass);
            crt.findViewById(R.id.button2);
            dbh=new dbhelper(this);
            String user=txt_mail.getText().toString();
            String pass=txt_pass.getText().toString();
            if (TextUtils.isEmpty(user)||TextUtils.isEmpty(pass)){
                Toast.makeText(signup.this, "Field Can't be empty", Toast.LENGTH_SHORT).show();
            }else if (pass.length()>6){
                Toast.makeText(signup.this, "Password is too short", Toast.LENGTH_SHORT).show();
            }else {
                boolean chekuser=dbh.checkUsername(user);
                if (chekuser==false){
                    boolean insert =dbh.insertData(user,pass);
                    if (insert==true){
                        Toast.makeText(signup.this, "Account Created Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), loginpage.class);
                        startActivity(intent);
                    }
                }
            }
        }

    public void open0(View view) {
        Toast.makeText(this, "LOGIN", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, loginpage.class);
        startActivity(intent);
    }
}