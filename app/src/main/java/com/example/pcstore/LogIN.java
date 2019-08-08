package com.example.pcstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
    public void adminClick(View view){
        Intent intent = new Intent(LogIN.this , MainActivity.class);
        startActivity(intent);
    }
    public void userClick(View view){
        Intent intent = new Intent(LogIN.this , Refunds.class);
        startActivity(intent);
    }
}
