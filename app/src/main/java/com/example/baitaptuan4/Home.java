package com.example.baitaptuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
    public void listMusic(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Home.this, Profile.class));
            }
        }, 2000);

    }
    public void chat(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Home.this, Chat.class));
            }
        }, 2000);

    }
    public void thongbao(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Home.this, LishDish.class));
            }
        }, 2000);

    }
    public void zingmp5(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Home.this, Music.class));
            }
        }, 2000);

    }
}