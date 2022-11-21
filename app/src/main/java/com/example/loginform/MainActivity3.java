package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;


public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txtView1 = findViewById(R.id.txtView1);
        txtView2 = findViewById(R.id.txtView2);
        txtView3 = findViewById(R.id.txtView3);

        String Name1 = "View"  + getIntent().getExtras().getString("name");
        String Address1 = "Address" + getIntent().getExtras().getString("address");
        String Email1 = "Email" + getIntent().getExtras().getString("email");

        textView.setText(Name1);
        textView2.setText(Address1);
        textView3.setText(Email);



    }
}