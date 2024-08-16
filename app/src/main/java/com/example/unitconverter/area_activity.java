package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class area_activity extends AppCompatActivity {

    EditText sqinchtosqcm,sqcmtosqinch,  sqfoottosqm,sqmtosqfoot,  sqmtosqyards,sqyardstosqm,  sqkmtosqmile,sqmiletosqkm,  hectaretoacre,acretohectare;
    TextView sqcmfromsqinch,sqinchfromsqcm,  sqmfromsqfoot,sqfootfromsqm,  sqyardsfromsqm,sqmfromsqyards,  sqmilefromsqkm,sqkmfromsqmile,  acrefromhectare,hectarefromacre;
    ImageView sqinch1,sqcm1,  sqfoot1,sqm1,  sqm2,sqyards,  sqkm,sqmile,  hectare,acre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        sqinchtosqcm=(EditText) findViewById(R.id.sqinchtosqcm);
        sqcmtosqinch=(EditText) findViewById(R.id.sqcmtosqinch);

        sqfoottosqm=(EditText) findViewById(R.id.sqfoottosqm);
        sqmtosqfoot=(EditText) findViewById(R.id.sqmtosqfoot);

        sqmtosqyards=(EditText) findViewById(R.id.sqmtosqyards);
        sqyardstosqm=(EditText) findViewById(R.id.sqyardstosqm);

        sqkmtosqmile=(EditText) findViewById(R.id.sqkmtosqmile);
        sqmiletosqkm=(EditText) findViewById(R.id.sqmiletosqkm);

        hectaretoacre=(EditText) findViewById(R.id.hectaretoacre);
        acretohectare=(EditText) findViewById(R.id.acretohectare);



        sqcmfromsqinch=(TextView) findViewById(R.id.sqcmfromsqinch);
        sqinchfromsqcm=(TextView) findViewById(R.id.sqinchfromsqcm);

        sqmfromsqfoot=(TextView) findViewById(R.id.sqmfromsqfoot);
        sqfootfromsqm=(TextView) findViewById(R.id.sqfootfromsqm);

        sqyardsfromsqm=(TextView) findViewById(R.id.sqyardsfromsqm);
        sqmfromsqyards=(TextView) findViewById(R.id.sqmfromsqyards);

        sqmilefromsqkm=(TextView) findViewById(R.id.sqmilefromsqkm);
        sqkmfromsqmile=(TextView) findViewById(R.id.sqkmfromsqmile);

        acrefromhectare=(TextView) findViewById(R.id.acrefromhectare);
        hectarefromacre=(TextView) findViewById(R.id.hectarefromacre);



        sqinch1=(ImageView) findViewById(R.id.sqinchbtn);
        sqcm1=(ImageView) findViewById(R.id.sqcmbtn);

        sqfoot1=(ImageView) findViewById(R.id.sqfootbtn);
        sqm1=(ImageView) findViewById(R.id.sqmbtn1);

        sqm2=(ImageView) findViewById(R.id.sqmbtn2);
        sqyards=(ImageView) findViewById(R.id.sqyardsbtn);

        //firstchange

        sqkm=(ImageView) findViewById(R.id.sqkmbtn);
        sqmile=(ImageView) findViewById(R.id.sqmilebtn);

        hectare=(ImageView) findViewById(R.id.hectarebtn);
        acre=(ImageView) findViewById(R.id.acrebtn);


        sqinch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sqinchtosqcm.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter sq. inch value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(sqinchtosqcm.getText().toString());
                    sqcmfromsqinch.setText(""+(d*6.4516));

                }
            }
        });
        sqcm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sqcmtosqinch.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter sq. cm value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(sqcmtosqinch.getText().toString());
                    sqinchfromsqcm.setText(""+(d*0.1550));
                }
            }
        });



        sqfoot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sqfoottosqm.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter sq. foot value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(sqfoottosqm.getText().toString());
                    sqmfromsqfoot.setText(""+(d*0.092903));
                }
            }
        });
        sqm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sqmtosqfoot.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter sq. meter value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(sqmtosqfoot.getText().toString());
                    sqfootfromsqm.setText(""+(d*10.7639));
                }
            }
        });



        sqm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sqmtosqyards.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter sq meter value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d=Double.parseDouble(sqmtosqyards.getText().toString());
                    sqyardsfromsqm.setText(""+d*1.195986);
                }
            }
        });
        sqyards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sqyardstosqm.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter sq yards value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d=Double.parseDouble(sqyardstosqm.getText().toString());
                    sqmfromsqyards.setText(""+d*0.83613);
                }
            }
        });



        sqkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sqkmtosqmile.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter sq km value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d=Double.parseDouble(sqkmtosqmile.getText().toString());
                    sqmilefromsqkm.setText(""+d*0.386101);
                }
            }
        });
        sqmile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sqmiletosqkm.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter sq mile value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d=Double.parseDouble(sqmiletosqkm.getText().toString());
                    sqkmfromsqmile.setText(""+d*2.589999);
                }
            }
        });



        hectare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hectaretoacre.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter hectare value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d=Double.parseDouble(hectaretoacre.getText().toString());
                    acrefromhectare.setText(""+d*2.471044);
                }
            }
        });
        acre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (acretohectare.getText().toString().equals("")){
                    Toast.makeText(area_activity.this, "Enter acre value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d=Double.parseDouble(acretohectare.getText().toString());
                    hectarefromacre.setText(""+d*0.404687);
                }
            }
        });
    }
}