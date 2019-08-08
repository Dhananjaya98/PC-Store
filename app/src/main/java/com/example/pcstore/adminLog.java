package com.example.pcstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class adminLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_log);
    }

    public void LogIN(View view){

        EditText t1 = findViewById(R.id.txt1);
        EditText t2 = findViewById(R.id.txt2);
        TextView txt = findViewById(R.id.textView12);
        String str1 = t1.getText().toString();
        String str2 = t2.getText().toString();
        txt.setText(str1);
        if(t1.getText().toString() =="admin"){
            Intent intent = new Intent(adminLog.this , MainActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(adminLog.this , Refunds.class);
            startActivity(intent);
        }

    }
}
