package com.example.pcstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inter4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter4);
    }

    public void directToInter5(View view){
        Intent intent = new Intent(inter4.this, inter5.class);
        startActivity(intent);
    }

    public void directToInter6(View view){
        Intent intent = new Intent(inter4.this, inter6.class);
        startActivity(intent);
    }

    public void directToInter7(View view){
        Intent intent = new Intent(inter4.this, inter7.class);
        startActivity(intent);
    }


    public void directToInter9(View view){
        Intent intent = new Intent(inter4.this, inter9.class);
        startActivity(intent);
    }

    public void directToInter10(View view){
        Intent intent = new Intent(inter4.this, inter10.class);
        startActivity(intent);
    }

    public void directToInter11(View view){
        Intent intent = new Intent(inter4.this, inter11.class);
        startActivity(intent);
    }

    public void directToInter12(View view){
        Intent intent = new Intent(inter4.this, inter12.class);
        startActivity(intent);
    }

    public void directToInter13(View view){
        Intent intent = new Intent(inter4.this, inter13.class);
        startActivity(intent);
    }

}
