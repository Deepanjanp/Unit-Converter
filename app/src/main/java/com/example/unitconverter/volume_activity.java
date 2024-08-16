package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class volume_activity extends AppCompatActivity {

    EditText cmtocy,cytocm,  ltog,gtol,  fotomm,mmtofo,  ltop,ptol;
    TextView cyfromcm,cmfromcy,  gfroml,lfromg,  mmfromfo,fofrommm,  pfroml,lfromp;
    ImageView cy,cm,  l,g,  fo,mm,  l1,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        cmtocy=(EditText) findViewById(R.id.cmtocy);
        cytocm=(EditText) findViewById(R.id.cytocm);

        cyfromcm=(TextView) findViewById(R.id.cyfromcm);
        cmfromcy=(TextView) findViewById(R.id.cmfromcy);

        cy=(ImageView) findViewById(R.id.cybtn);
        cm=(ImageView) findViewById(R.id.cmbtn);

        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cmtocy.getText().toString().equals("")){
                    Toast.makeText(volume_activity.this, "Enter cubic meter value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(cmtocy.getText().toString());
                    cyfromcm.setText(""+d*1.30794);
                }
            }
        });
        cy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cytocm.getText().toString().equals("")){
                    Toast.makeText(volume_activity.this, "Enter cubic yard value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(cytocm.getText().toString());
                    cmfromcy.setText(""+d*0.764559);
                }
            }
        });



        ltog=(EditText) findViewById(R.id.ltog);
        gtol=(EditText) findViewById(R.id.gtol);

        gfroml=(TextView) findViewById(R.id.gfroml);
        lfromg=(TextView) findViewById(R.id.lfromg);

        l=(ImageView) findViewById(R.id.lbtn);
        g=(ImageView) findViewById(R.id.gbtn);

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ltog.getText().toString().equals("")){
                    Toast.makeText(volume_activity.this, "Enter litre value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(ltog.getText().toString());
                    gfroml.setText(""+d*0.264178);
                }
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gtol.getText().toString().equals("")){
                    Toast.makeText(volume_activity.this, "Enter gallons value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(gtol.getText().toString());
                    lfromg.setText(""+d*3.785332);
                }
            }
        });



        fotomm=(EditText) findViewById(R.id.fotomm);
        mmtofo=(EditText) findViewById(R.id.mmtofo);

        mmfromfo=(TextView) findViewById(R.id.mmfromfo);
        fofrommm=(TextView) findViewById(R.id.fofrommm);

        fo=(ImageView) findViewById(R.id.fobtn);
        mm=(ImageView) findViewById(R.id.mmbtn);

        fo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fotomm.getText().toString().equals("")){
                    Toast.makeText(volume_activity.this, "Enter fluid ounce value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(fotomm.getText().toString());
                    mmfromfo.setText(""+d*29.574);
                }
            }
        });
        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mmtofo.getText().toString().equals("")){
                    Toast.makeText(volume_activity.this, "Enter millimetres value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(mmtofo.getText().toString());
                    fofrommm.setText(""+d*0.0338147);
                }
            }
        });



        ltop=(EditText) findViewById(R.id.ltop);
        ptol=(EditText) findViewById(R.id.ptol);

        pfroml=(TextView) findViewById(R.id.pfroml);
        lfromp=(TextView) findViewById(R.id.lfromp);

        p=(ImageView) findViewById(R.id.pbtn);
        l1=(ImageView) findViewById(R.id.lbtn1);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ltop.getText().toString().equals("")){
                    Toast.makeText(volume_activity.this, "Enter litre value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(ltop.getText().toString());
                    pfroml.setText(""+d*2.11342);
                }
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ptol.getText().toString().equals("")){
                    Toast.makeText(volume_activity.this, "Enter pint value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(ptol.getText().toString());
                    lfromp.setText(""+d*0.473167);
                }
            }
        });

    }
}