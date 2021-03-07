package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView messageReceive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        messageReceive=findViewById(R.id.messageReceive);

        Intent intent =getIntent();
        String messageText = intent.getStringExtra("message");
        messageReceive.setText(messageText);


    }
}