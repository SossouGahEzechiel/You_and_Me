package com.example.you_and_me.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.you_and_me.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent intent = getIntent();

        if (intent != null){
            String str = "";
            if (intent.hasExtra("edittext")){
                str = intent.getStringExtra("edittext");
            }

            TextView textView = (TextView) findViewById(R.id.valeur);

    }
    }
}