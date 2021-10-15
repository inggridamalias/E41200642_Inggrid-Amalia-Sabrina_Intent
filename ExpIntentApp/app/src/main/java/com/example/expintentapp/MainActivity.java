package com.example.expintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // add onclick method
    public void onIndexSendButtonClicked(View v) {
        //write intent to launch second activity
        Intent intent = new Intent(this, SecondActivity.class); //define the intent
        EditText editText = (EditText) findViewById(R.id.editTextIndex); //write the index
        String index = editText.getText().toString();
        //put code index into the intent extra
        intent.putExtra("ImageIndex", index);
        startActivity(intent);

    }
}