package com.example.medsystemconversor;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ecg extends AppCompatActivity {

    private EditText editEcg;
    private TextView resulEcg;
    private Button btEcg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecg);

        editEcg = findViewById(R.id.edit_ecg);
        resulEcg = findViewById(R.id.resul_ecg);
        btEcg = findViewById(R.id.bt_ECG);

        Button btnVoltar = findViewById(R.id.btn_voltar1);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });




        btEcg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editEcg.getText().toString().trim();
                if (!input.isEmpty()) {
                    double mmValue = Double.parseDouble(input);
                    double result = (25 / mmValue) * 60;
                    resulEcg.setText(String.format("%.2f bpm", result));
                    editEcg.setText(""); // limpa o conteúdo da EditText
                } else {
                    resulEcg.setText("Insira um valor em milímetros");
                }
            }
        });
    }
}