package com.example.pcstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inter12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter12);
    }

    public void directToInter4(View view){
        Intent intent = new Intent(inter12.this, inter4.class);
        startActivity(intent);
    }

}
