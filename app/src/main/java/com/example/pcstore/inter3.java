package com.example.pcstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inter3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter3);
    }

    public void directToInter3(View view){
        Intent intent = new Intent(inter3.this, inter2.class);
        startActivity(intent);
    }
}
