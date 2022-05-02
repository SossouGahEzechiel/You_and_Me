package com.example.you_and_me.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.you_and_me.R;
import com.example.you_and_me.entities.Personne;

import org.w3c.dom.Text;

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
        Log.i("text","Ok, c'est bon");
    }

    private void initializer(){
        tableLayout = findViewById(R.id.data_table);
    }

    private Personne getIntentContent(){
        Bundle myBundle = getIntent().getExtras();
        return myBundle.getParcelable("com.example.you_and_me.entities.Personne");
    }

    private void viewContentSetter(){

        /*Création des lignes du tableau*/
        TableRow first_name_row = new TableRow(this);
        TableRow last_name_row = new TableRow(this);
        TableRow sexe_row = new TableRow(this);
        TableRow nat_row = new TableRow(this);

        /*Cration des objets textView qui vont contenir les informations de la personne*/
        TextView first_name_tv = new TextView(this);
        first_name_tv.setTextSize(20);

        TextView last_name_tv = new TextView(this);
        last_name_tv.setTextSize(20);

        TextView nat_tv = new TextView(this);
        nat_tv.setTextSize(20);

        TextView sexe_tv = new TextView(this);
        sexe_tv.setTextSize(20);

        /*Affectation des valeur dans leur textView*/
        first_name_tv.setText(personne.getFirst_name());
        last_name_tv.setText(personne.getLast_name());
        sexe_tv.setText(personne.getSexe());
        nat_tv.setText(personne.getNationalite().getLibelle());

        /*Création d'un objet pour contenir le libellé de ligne*/
        TextView libelle_last_name = new TextView(this);
        TextView libelle_first_name = new TextView(this);
        TextView libelle_sexe = new TextView(this);
        TextView libelle_nat = new TextView(this);

        /*
        * Création de la ligne du nom
        * Injection des colones dans la ligne
        * */

        libelle_last_name.setText("Nom");
        libelle_last_name.setTextSize(20);
        last_name_row.addView(libelle_last_name);
        last_name_row.addView(last_name_tv);

        /*Création de la ligne du prénom*/
        libelle_first_name.setText("Prénom");
        libelle_first_name.setTextSize(20);
        first_name_row.addView(libelle_first_name);
        first_name_row.addView(first_name_tv);

        /*Création de la ligne du sexe*/
        libelle_sexe.setText("Sexe");
        libelle_sexe.setTextSize(20);
        sexe_row.addView(libelle_sexe);
        sexe_row.addView(sexe_tv);

        /*Création de la ligne de la nationnalité*/
        libelle_nat.setText("Nationnalité");
        libelle_nat.setTextSize(20);
        nat_row.addView(libelle_nat);
        nat_row.addView(nat_tv);

        /*Injection des ligne dans le tableau lui-même*/
        tableLayout.addView(last_name_row);
        tableLayout.addView(first_name_row);
        tableLayout.addView(sexe_row);
        tableLayout.addView(nat_row);
    }
}