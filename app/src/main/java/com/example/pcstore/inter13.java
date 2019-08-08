package com.example.pcstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inter13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter13);
    }

    public void directToInter4(View view){
        Intent intent = new Intent(inter13.this, inter4.class);
        startActivity(intent);
    }

}
