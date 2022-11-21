package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtusername, txtpassword;
    TextView textView, txttry, timer;
    Button Btlogin;
    int count = 3;
    int countDown = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login();
    }
    void Login() {
        txtusername = (EditText) findViewById(R.id.txtusername);
        txtpassword = (EditText) findViewById(R.id.txtpassword);
        Btlogin = (Button) findViewById(R.id.Btlogin);
        txttry = (TextView) findViewById(R.id.txttry);
        txttry.setText(Integer.toString(count));
        timer = (TextView) findViewById(R.id.timer);
        Btlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (txtusername.getText().toString().equals("admin") &&
                        txtpassword.getText().toString().equals("12345")) {
                    Toast.makeText(MainActivity.this, "Username and Password is Correct",
                            Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Username and Password is Incorrect",
                            Toast.LENGTH_SHORT).show();
                    count--;
                    txttry.setText(Integer.toString(count));
                    if (count == 0)
                    {
                        Btlogin.setEnabled(false);
                    }

                }
            }
        });
    }
}









