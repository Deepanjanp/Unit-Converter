package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class temp_activity extends AppCompatActivity {

    EditText ctof,ftoc,  ktoc,ktof;
    TextView ffromc,cfromf,  cfromk,ffromk;
    ImageView c,f,kc,kf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        ctof=(EditText) findViewById(R.id.ctof);
        ftoc=(EditText) findViewById(R.id.ftoc);



        ffromc=(TextView) findViewById(R.id.ffromc);
        cfromf=(TextView) findViewById(R.id.cfromf);



        c=(ImageView) findViewById(R.id.cbtn);
        f=(ImageView) findViewById(R.id.fbtn);



        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctof.getText().toString().equals("")){
                    Toast.makeText(temp_activity.this, "Enter temperature", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(ctof.getText().toString());
                    ffromc.setText(""+((d*9/5)+32));
                }
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ftoc.getText().toString().equals("")){
                    Toast.makeText(temp_activity.this, "Enter temperature", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(ftoc.getText().toString());
                    cfromf.setText(""+(d-32)*5/9);
                }
            }
        });



        ktoc=(EditText) findViewById(R.id.ktoc);
        ktof=(EditText) findViewById(R.id.ktof);

        cfromk=(TextView) findViewById(R.id.cfromk);
        ffromk=(TextView) findViewById(R.id.ffromk);

        kc=(ImageView) findViewById(R.id.kcbtn);
        kf=(ImageView) findViewById(R.id.kfbtn);

        kc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ktoc.getText().toString().equals("")){
                    Toast.makeText(temp_activity.this, "Enter kelvin value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(ktoc.getText().toString());
                    cfromk.setText(""+(d-273.15));
                }
            }
        });
        kf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ktof.getText().toString().equals("")){
                    Toast.makeText(temp_activity.this, "Enter kelvin value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double d=Double.parseDouble(ktof.getText().toString());
                    ffromk.setText(""+(d-273.15)*9/5+32);
                }
            }
        });

    }
}