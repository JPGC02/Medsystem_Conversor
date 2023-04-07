package com.example.medsystemconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class vazao extends AppCompatActivity {

    private TextView ResultadoVazao;
    private EditText editTextMl;
    private Button bt_vazao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vazao);

        ResultadoVazao = findViewById(R.id.ResultadoVazao);
        editTextMl = findViewById(R.id.editTextMl);
        bt_vazao = findViewById(R.id.bt_resul_Vazao);

        Button btnVoltar = findViewById(R.id.btn_voltar6);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });






        bt_vazao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String strMl = editTextMl.getText().toString();
                double ml = Double.parseDouble(strMl);
                double vazao = ml / 0.333;
                ResultadoVazao.setText(String.format("%.2f mL/s", vazao));
                editTextMl.setText(""); // limpa o conteúdo da EditText
            }
        });

    }
}