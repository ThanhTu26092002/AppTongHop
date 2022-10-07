package com.example.baitaptuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edUserName, edPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        edUserName = findViewById(R.id.edUserName);
        edPassword = findViewById(R.id.edPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }
    public int isLogin(String u, String p)
    {
        if(u.equals("ad") && p.equals("111"))
        {
            return 1;
        }else
        {
            return 01;
        }
    }
    String strU, strP;
    public void checkLogin(View view)
    {
        strU = edUserName.getText().toString();
        strP = edPassword.getText().toString();
        if(strU.isEmpty() || strP.isEmpty())
        {
            Toast.makeText(getApplicationContext(), "U, P khong duoc de trong",
                    Toast.LENGTH_LONG).show();
        }
        else
        {
            if(isLogin(strU,strP)>0)
            {
                Toast.makeText(getApplicationContext(), "Login thanh cong",
                        Toast.LENGTH_LONG).show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(new Intent(MainActivity.this,Home.class));
                            }
                        },2000);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Sai UserName,Password",
                        Toast.LENGTH_LONG).show();
            }
        }
    }
    public void checkSignUp(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        },2000);
    }
    public void Register(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        }, 2000);
    }
    public void Back(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        }, 2000);

    }
    public void backToHome(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        }, 2000);

    }
}