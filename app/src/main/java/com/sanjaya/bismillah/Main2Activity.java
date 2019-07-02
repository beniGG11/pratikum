package com.sanjaya.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button ImageCircle;
    Button Daftarmakanan;

    SQLiteOpenHelper sqliteHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = new Intent(Main2Activity.this, Activity.class);
        Main2Activity.this.startActivity(intent);
        Main2Activity.this.finish();
            }
        };