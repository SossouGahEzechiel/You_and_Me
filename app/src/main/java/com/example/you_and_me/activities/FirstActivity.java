package com.example.you_and_me.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.you_and_me.R;
import com.example.you_and_me.entities.Nationalite;

public class FirstActivity extends AppCompatActivity {

    EditText last_name_input,first_name_input;
    RadioButton current_btn;
    RadioGroup radio_grp;
    Spinner nat_spinner;
    Button btn_submit;
    TextView rep_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializer();
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnlistner();

    }

    public void SetAsCurrent(View view){
        int current_btn_id = radio_grp.getCheckedRadioButtonId();
         current_btn= findViewById(current_btn_id);
    }

    public  void initializer(){

        last_name_input=findViewById(R.id.last_name_input);
        first_name_input=findViewById(R.id.first_name_input);
        radio_grp=findViewById(R.id.radio_grp);
        nat_spinner=findViewById(R.id.nat_spinner);
        btn_submit=findViewById(R.id.btn_submit);
        rep_output=findViewById(R.id.rep_output);
        current_btn=findViewById(radio_grp.getCheckedRadioButtonId());

        ArrayAdapter<Nationalite> nat_adapter = new ArrayAdapter<Nationalite>(
                this,
                android.R.layout.simple_list_item_1,
                Nationalite.getNationalite()
        );
        nat_spinner.setAdapter(nat_adapter);



    }

    public void btnlistner(){

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String genre = getGender();
                Nationalite nation = (Nationalite) nat_spinner.getSelectedItem();

              rep_output.setText(genre+" "+last_name_input.getText().toString()+" "+first_name_input.getText().toString()+

                        "\nVous résidez actuellement au/en "+ nation.getLibelle());


            }
        });

    }

    private String getGender(){
        if(radio_grp.getCheckedRadioButtonId() == findViewById(R.id.sexe_m).getId())
            return "Monsieur";
        return "Madame";
    }
}