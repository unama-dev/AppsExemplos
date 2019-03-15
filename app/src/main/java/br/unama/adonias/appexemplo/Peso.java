package br.unama.adonias.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Peso extends AppCompatActivity {

    private TextInputEditText altura;
    private RadioGroup rbResp;
    private TextView txresult;
    private double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);
        altura = findViewById(R.id.inputAltura);
        rbResp = findViewById(R.id.rbResp);
        txresult = findViewById(R.id.txtResultado);
    }

    public void calculaPeso(View v){
        String alturaR = altura.getText().toString();
        if(alturaR.trim().length() == 0){

        }
        int idResp = rbResp.getCheckedRadioButtonId();
        if(idResp == R.id.rbMasc){
            resultado = (72.7 * Double.parseDouble(altura.getText().toString())) - 58;
        }else{
            resultado = (62.1 * Double.parseDouble(altura.getText().toString())) - 44.7;
        }
        String texto = "Seu peso ideal é " + resultado;
        txresult.setText(texto);
    }
}
