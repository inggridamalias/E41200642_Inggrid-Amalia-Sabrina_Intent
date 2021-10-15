package com.example.expintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String imageIndex = bundle.getString("ImageIndex");
            setImage(imageIndex);
        }

    }
    //make a function
    private void setImage(String index){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);//define the image view

        switch (index){
            case "1":
                imageView.setImageResource(R.drawable.c);
                break;

            case "2":
                imageView.setImageResource(R.drawable.chash);
                break;

            case "3":
                imageView.setImageResource(R.drawable.cplus);
                break;

            case "4":
                imageView.setImageResource(R.drawable.java);
                break;

            case "5":
                imageView.setImageResource(R.drawable.javascript);
                break;

            case "6":
                imageView.setImageResource(R.drawable.objectivec);
                break;

            case "7":
                imageView.setImageResource(R.drawable.php);
                break;

            case "8":
                imageView.setImageResource(R.drawable.phyton);
                break;

            case "9":
                imageView.setImageResource(R.drawable.ruby);
                break;
        }
    }
}