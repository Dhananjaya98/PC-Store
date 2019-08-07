package com.example.pcstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class adminLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_log);
    }

    public void LogIN(View view){

        EditText t1 = findViewById(R.id.txt1);
        EditText t2 = findViewById(R.id.txt2);

        String str1 = t1.getText().toString();
        String str2 = t2.getText().toString();

        if(str1!="admin"){
            Intent intent = new Intent(adminLog.this , MainActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(adminLog.this , Refunds.class);
            startActivity(intent);
        }

    }
}
