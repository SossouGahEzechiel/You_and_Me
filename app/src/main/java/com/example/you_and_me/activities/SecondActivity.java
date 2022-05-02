package com.example.you_and_me.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.you_and_me.R;
import com.example.you_and_me.entities.Personne;

public class SecondActivity extends AppCompatActivity {

    TableLayout tableLayout;
    Personne personne;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initializer();
        personne = getIntentContent();
        Log.i("contenu de personne",personne.toString());
    }

    @Override
    protected void onStart() {
        super.onStart();
        viewContentSetter();
    }

    private void initializer(){
        tableLayout = findViewById(R.id.data_table);
    }

    private Personne getIntentContent(){
        Bundle myBundle = getIntent().getExtras();
        return myBundle.getParcelable("com.example.you_and_me.entities.Personne");
    }

    private void viewContentSetter(){
        
    }
}