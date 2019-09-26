package com.example.pcstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main_payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_payment);
    }
    public void sendData(View view){
        Intent intent = new Intent(main_payment.this,add_pay.class);
        startActivity(intent);
    }
    public void sendData2(View view){
        Intent intent = new Intent(main_payment.this,all_pay.class);
        startActivity(intent);
    }
}
