package com.example.medsystemconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class watts_rms_to_watts extends AppCompatActivity {

    private TextView ResultadoWatts;
    private EditText edit_Tpico;
    private EditText edit_Irms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watts_rms_to_watts);

        ResultadoWatts = findViewById(R.id.ResultadoWatts);
        edit_Tpico = findViewById(R.id.edit_Tpico);
        edit_Irms = findViewById(R.id.edit_Irms);

        Button btnVoltar = findViewById(R.id.btn_voltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }




    @SuppressLint("DefaultLocale")
    public void converter(View view) {
        String strTpico = edit_Tpico.getText().toString();
        String strIrms = edit_Irms.getText().toString();

        double Tpico = Double.parseDouble(strTpico);
        double Irms = Double.parseDouble(strIrms);

        double x = Tpico / Math.sqrt(2);
        double resultado = x * Irms;

            // Exibe o resultado no EditText correspondente
            ResultadoWatts.setText(String.format("%.2f watts", resultado));


            edit_Tpico.setText(""); // limpa o conteúdo da EditText
            edit_Irms.setText("");
        }
}