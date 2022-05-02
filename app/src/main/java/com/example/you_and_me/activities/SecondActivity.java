package com.example.you_and_me.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.you_and_me.R;
import com.example.you_and_me.entities.Personne;

public class SecondActivity extends AppCompatActivity {

    Personne personne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        personne = getIntentContent();
        Log.i("contenu de personne",personne.toString());
    }

    private Personne getIntentContent(){
        Bundle myBundle = getIntent().getExtras();
        return myBundle.getParcelable("com.example.you_and_me.entities.Personne");
    }
}