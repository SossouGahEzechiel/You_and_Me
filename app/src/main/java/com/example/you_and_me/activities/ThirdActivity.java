package com.example.you_and_me.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.you_and_me.R;
import com.example.you_and_me.entities.Personne;

public class ThirdActivity extends AppCompatActivity {

    Personne personne;
    TextView nom,prenom,nationnalite,sexe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        initializer();
        personne = getIntentContent();


    }

    @Override
    protected void onStart() {
        super.onStart();
        setActivity();
    }

    public void initializer(){
        nom=findViewById(R.id.name);
        prenom=findViewById(R.id.first_name);
        sexe=findViewById(R.id.sex);
        nationnalite=findViewById(R.id.nationality);


    }

    private Personne getIntentContent(){
        Bundle myBundle = getIntent().getExtras();
        return myBundle.getParcelable("com.example.you_and_me.entities.Personne");
    }

    public void setActivity(){

        TextView last_name = new TextView(this);
        last_name.setTextSize(20);
        TextView first_name = new TextView(this);
        last_name.setTextSize(20);
        TextView sexe = new TextView(this);
        last_name.setTextSize(20);
        TextView nationalite = new TextView(this);
        last_name.setTextSize(20);


        last_name.setText(personne.getLast_name());
        first_name.setText(personne.getFirst_name());
        sexe.setText(personne.getSexe());
        nationalite.setText(personne.getNationalite().getLibelle());


        TextView libelle_last_name = new TextView(this);
        TextView libelle_first_name = new TextView(this);
        TextView libelle_sexe = new TextView(this);
        TextView libelle_nat = new TextView(this);







    }


}