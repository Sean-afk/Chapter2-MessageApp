package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText message;
    Button sendMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message=findViewById(R.id.message);
        sendMessage=findViewById(R.id.sendBtn);

    }
    public void onSendMessage(View view){
        String messageText = message.getText().toString();
        //Intent intent= new Intent(this,MainActivity2.class);
        //intent.putExtra(MainActivity2.EXTRA_MESSAGE,messageText);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chooseIntent = Intent.createChooser(intent,chooserTitle);
        //startActivity(intent);
        startActivity(chooseIntent);

    }
}