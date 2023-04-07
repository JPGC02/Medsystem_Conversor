package com.example.medsystemconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnWatts;
    Button btnVazao;
    Button btnCMtoMM;

    Button btnECG;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWatts = findViewById(R.id.bt_watts);

        btnWatts.setOnClickListener(view ->{
            startActivity(new Intent(this, watts_rms_to_watts.class));

        });

        btnVazao = findViewById(R.id.bt_vazão);

        btnVazao.setOnClickListener(view ->{
            startActivity(new Intent(this, vazao.class));

        });

        btnCMtoMM = findViewById(R.id.bt_cmtomm);

        btnCMtoMM.setOnClickListener(view ->{
            startActivity(new Intent(this, cm_to_mm.class));

        });

        btnECG = findViewById(R.id.bt_ecg);

        btnECG.setOnClickListener(view ->{
                startActivity(new Intent(this, ecg.class));



        });
    }
}