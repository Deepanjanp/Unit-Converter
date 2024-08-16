package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class length_activity extends AppCompatActivity {

    EditText inchtocm,cmtoinch,  mmtoinch,inchtomm,  foottocm,cmtofoot,  yardtom,mtoyard,  mtofeet,feettom,  miletokm,kmtomile;
    TextView cmfrominch,inchfromcm,  inchfrommm,mmfrominch,  cmfromfoot,footfromcm,  mfromyard,yardfromm,  feetfromm,mfromfeet,  kmfrommile,milefromkm;
    ImageView inch1,cm1,  mm,inch2,  foot,cm2,  yard,m1,  m2,feet,  km,mile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        inchtocm=(EditText) findViewById(R.id.inchtocm);
        cmtoinch=(EditText) findViewById(R.id.cmtoinch);

        mmtoinch=(EditText) findViewById(R.id.mmtoinch);
        inchtomm=(EditText) findViewById(R.id.inchtomm);

        foottocm=(EditText) findViewById(R.id.foottocm);
        cmtofoot=(EditText) findViewById(R.id.cmtofoot);

        yardtom=(EditText) findViewById(R.id.yardtom);
        mtoyard=(EditText) findViewById(R.id.mtoyard);

        mtofeet=(EditText) findViewById(R.id.mtofeet);
        feettom=(EditText) findViewById(R.id.feettom);

        miletokm=(EditText) findViewById(R.id.miletokm);
        kmtomile=(EditText) findViewById(R.id.kmtomile);



        cmfrominch=(TextView) findViewById(R.id.cmfrominch);
        inchfromcm=(TextView) findViewById(R.id.inchfromcm);

        inchfrommm=(TextView) findViewById(R.id.inchfrommm);
        mmfrominch=(TextView) findViewById(R.id.mmfrominch);

        cmfromfoot=(TextView) findViewById(R.id.cmfromfoot);
        footfromcm=(TextView) findViewById(R.id.footfromcm);

        mfromyard=(TextView) findViewById(R.id.mfromyard);
        yardfromm=(TextView) findViewById(R.id.yardfromm);

        feetfromm=(TextView) findViewById(R.id.feetfromm);
        mfromfeet=(TextView) findViewById(R.id.mfromfeet);

        kmfrommile=(TextView) findViewById(R.id.kmfrommile);
        milefromkm=(TextView) findViewById(R.id.milefromkm);



        inch1=(ImageView)findViewById(R.id.inchbtn1);
        cm1=(ImageView) findViewById(R.id.cmbtn1);

        mm=(ImageView) findViewById(R.id.mmbtn);
        inch2=(ImageView) findViewById(R.id.inchbtn2);

        foot=(ImageView) findViewById(R.id.footbtn);
        cm2=(ImageView) findViewById(R.id.cmbtn2);

        yard=(ImageView) findViewById(R.id.yardbtn);
        m1=(ImageView) findViewById(R.id.mbtn1);

        feet=(ImageView) findViewById(R.id.feetbtn);
        m2=(ImageView) findViewById(R.id.mbtn2);

        mile=(ImageView) findViewById(R.id.milebtn);
        km=(ImageView) findViewById(R.id.kmbtn);



        inch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inchtocm.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter inch value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d1=Double.parseDouble(inchtocm.getText().toString());
                    Double r1=d1*2.540;
                    cmfrominch.setText(""+r1);
                }
            }
        });
        cm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cmtoinch.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter centimeters value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d2=Double.parseDouble(cmtoinch.getText().toString());
                    Double r2=d2*0.393701;
                    inchfromcm.setText(""+r2);
                }
            }
        });



        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mmtoinch.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter mm value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d3=Double.parseDouble(mmtoinch.getText().toString());
                    Double r3=d3*0.03937;
                    inchfrommm.setText(""+r3);
                }
            }
        });
        inch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inchtomm.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter inch value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d4=Double.parseDouble(inchtomm.getText().toString());
                    Double r4=d4*25.4;
                    mmfrominch.setText(""+r4);
                }
            }
        });



        foot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foottocm.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter foot value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d5=Double.parseDouble(foottocm.getText().toString());
                    Double r5=d5*30.48;
                    cmfromfoot.setText(""+r5);
                }
            }
        });
        cm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cmtofoot.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter centimetre value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d6=Double.parseDouble(cmtofoot.getText().toString());
                    Double r6=d6*0.0328084;
                    footfromcm.setText(""+r6);
                }
            }
        });



        yard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yardtom.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter yard value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d7=Double.parseDouble(yardtom.getText().toString());
                    Double r7=d7*0.9144028;
                    mfromyard.setText(""+r7);
                }
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mtoyard.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter metre value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d8=Double.parseDouble(mtoyard.getText().toString());
                    Double r8=d8*1.094;
                    yardfromm.setText(""+r8);
                }
            }
        });



        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mtofeet.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter metre value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d9=Double.parseDouble(mtofeet.getText().toString());
                    Double r9=d9*3.281;
                    feetfromm.setText(""+r9);
                }
            }
        });
        feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (feettom.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter feet value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d10=Double.parseDouble(feettom.getText().toString());
                    Double r10=d10*0.3048;
                    mfromfeet.setText(""+r10);
                }
            }
        });



        mile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (miletokm.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter mile value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d11=Double.parseDouble(miletokm.getText().toString());
                    Double r11=d11*1.6093419;
                    kmfrommile.setText(""+r11);
                }
            }
        });
        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kmtomile.getText().toString().equals("")){
                    Toast.makeText(length_activity.this, "Enter km value", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double d12=Double.parseDouble(kmtomile.getText().toString());
                    Double r12=d12*0.621372;
                    milefromkm.setText(""+r12);
                }
            }
        });
    }
}