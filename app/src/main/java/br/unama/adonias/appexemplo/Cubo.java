package br.unama.adonias.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Cubo extends AppCompatActivity {

    private TextInputEditText inputRaio;
    private TextInputEditText inputAltura;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        inputRaio = findViewById(R.id.inputRaio);
        inputAltura = findViewById(R.id.inputAltura);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calculaVolume(View v){
        DecimalFormat dc = new DecimalFormat("##,##");
        double raio = Double.parseDouble(inputRaio.getText().toString());
        double altura = Double.parseDouble(inputAltura.getText().toString());
        double resultado = 3.141559 * Math.pow(raio, 2) * altura;
        String texto = "O valor do volume é " + dc.format(resultado);
        txtResultado.setText(texto);
    }
}
