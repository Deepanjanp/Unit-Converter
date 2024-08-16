package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class mass_activity extends AppCompatActivity {

    EditText ouncetogram,gramtoounce,  poundtokg,kgtopound;
    TextView gramfronounce,ouncefromgram,  kgfrompound,poundfromkg;
    ImageView ounce,gram,  pound,kg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        ouncetogram=(EditText) findViewById(R.id.ouncetogram);
        gramtoounce=(EditText) findViewById(R.id.gramtoounce);

        poundtokg=(EditText) findViewById(R.id.poundtokg);
        kgtopound=(EditText) findViewById(R.id.kgtopound);




        gramfronounce=(TextView) findViewById(R.id.gramfromounce);
        ouncefromgram=(TextView) findViewById(R.id.ouncefromgram);

        kgfrompound=(TextView) findViewById(R.id.kgfrompound);
        poundfromkg=(TextView) findViewById(R.id.poundfromkg);





        ounce=(ImageView) findViewById(R.id.ouncebtn);
        gram=(ImageView) findViewById(R.id.grambtn);

        pound=(ImageView) findViewById(R.id.poundbtn);
        kg=(ImageView) findViewById(R.id.kgbtn);





        ounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ouncetogram.getText().toString().equals("")){
                    Toast.makeText(mass_activity.this, "Enter ounce value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(ouncetogram.getText().toString());
                    gramfronounce.setText(""+d*28.3495);
                }
            }
        });
        gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gramtoounce.getText().toString().equals("")){
                    Toast.makeText(mass_activity.this, "Enter gram value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(gramtoounce.getText().toString());
                    ouncefromgram.setText(""+d*0.03527369);
                }
            }
        });



        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (poundtokg.getText().toString().equals("")){
                    Toast.makeText(mass_activity.this, "Enter pound value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(poundtokg.getText().toString());
                    kgfrompound.setText(""+d*0.4535924);
                }
            }
        });
        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kgtopound.getText().toString().equals("")){
                    Toast.makeText(mass_activity.this, "Enter kilogram value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(kgtopound.getText().toString());
                    poundfromkg.setText(""+d*2.2046223);
                }
            }
        });

    }
}