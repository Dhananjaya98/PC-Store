package com.example.pcstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void deleteItem(View view) {
        Intent intent = new Intent(MainActivity.this , deleteItem.class);
        startActivity(intent);
    }

    public void AddItem(View view){
        Intent intent = new Intent(MainActivity.this , AddItem.class);
        startActivity(intent);
    }

    public void UpdateItem(View view){
        Intent intent = new Intent(MainActivity.this , UpdateItem.class);
        startActivity(intent);
    }

    public void Refunds(View view){
        Intent intent = new Intent(MainActivity.this , Refunds.class);
        startActivity(intent);
    }

    public void ManageUsers(View view){
        Intent intent = new Intent(MainActivity.this , ManageUsers.class);
        startActivity(intent);
    }

    public void Feedback(View view){
        Intent intent = new Intent(MainActivity.this , Feedback.class);
        startActivity(intent);
    }

}
