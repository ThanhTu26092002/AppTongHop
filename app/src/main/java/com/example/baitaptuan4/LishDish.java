package com.example.baitaptuan4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class LishDish extends AppCompatActivity {
    ListView lsvDish;
    ArrayList<Dish> arr;
    DishAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listdish);
        lsvDish = findViewById(R.id.lsvDish);
        lsvDish.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(LishDish.this,ChiTiet.class));
            }
        });
        arr = new ArrayList<>();

        Random r = new Random();

        arr.add(new Dish(R.drawable.img,10,"Pizza"));
        arr.add(new Dish(R.drawable.img_1,r.nextInt(10)*5,"Mỳ ý"));
        arr.add(new Dish(R.drawable.img_2,r.nextInt(10)*5,"Mỳ Ý"));
        arr.add(new Dish(R.drawable.img_3,r.nextInt(10)*5,"Buger"));
        arr.add(new Dish(R.drawable.img_4,r.nextInt(10)*5,"Combo 1"));
        arr.add(new Dish(R.drawable.img_5,r.nextInt(10)*5,"Gà Rán"));
        arr.add(new Dish(R.drawable.img_6,r.nextInt(10)*5,"Gà Rán 2"));
        arr.add(new Dish(R.drawable.img_7,r.nextInt(10)*5,"Khoai Tây"));
        arr.add(new Dish(R.drawable.img_8,r.nextInt(10)*5,"Khoai Tây2"));
        arr.add(new Dish(R.drawable.img_9,r.nextInt(10)*5,"Coca"));


        adapter = new DishAdapter(this,0,arr);
        lsvDish.setAdapter(adapter);
    }
    public void listMusic(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(LishDish.this, Home.class));
            }
        }, 2000);

    }

}