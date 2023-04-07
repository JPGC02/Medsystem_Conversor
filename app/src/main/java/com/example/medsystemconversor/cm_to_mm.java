package com.example.medsystemconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cm_to_mm extends AppCompatActivity {

    private EditText cmEditText;
    private TextView mmTextView;
    private Button bt_cm_mm;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmm_to_mm);

        // inicializando os componentes da tela
        cmEditText = (EditText) findViewById(R.id.edit_cm);
        mmTextView = (TextView) findViewById(R.id.Resul_mm);
        bt_cm_mm = findViewById(R.id.bt_cm);


        Button btnVoltar = findViewById(R.id.btn_voltar4);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });





        bt_cm_mm.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                // obtendo o valor em cmH2O a partir do campo de texto
                double cmH2O = Double.parseDouble(cmEditText.getText().toString());

                // convertendo cmH2O para mmHg
                double mmHg = cmH2O * 0.73556;

                // exibindo o resultado da conversão na tela
                mmTextView.setText(String.format("%.2f mmHg", mmHg));
                cmEditText.setText(""); // limpa o conteúdo da EditText
            }
        });
    }
}
