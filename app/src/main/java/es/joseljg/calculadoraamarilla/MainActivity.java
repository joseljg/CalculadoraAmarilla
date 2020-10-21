package es.joseljg.calculadoraamarilla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_numero1 = null;
    EditText edt_numero2 = null;
    TextView txt_resultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero1 = findViewById(R.id.edt_numero1);
        edt_numero2 = findViewById(R.id.edt_numero2);
        txt_resultado = findViewById(R.id.txt_resultado);
    }

    public void calcular(View v) {
        double numero1 = 0;
        try {
            String textoNumero1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textoNumero1);
        }
        catch (Exception e) {
            edt_numero1.setError("numero1 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double numero2 = 0;
        try {
            String textoNumero2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textoNumero2);
        }
        catch (Exception e) {
            edt_numero2.setError("numero2 incorrecto");
            return;
        }
        double resultado = 0.0;
        switch (v.getId())
        {
            case R.id.bt_mas:
                resultado = numero1 + numero2;
                break;
            case R.id.bt_menos:
                resultado = numero1 - numero2;
                break;
            case R.id.bt_por:
                resultado = numero1 * numero2;
                break;
            case R.id.bt_division:
                if(numero2 == 0) {
                edt_numero2.setError("numero2 no puede ser cero");
                return;
                }
                resultado = numero1 / numero2;
                                break;
            case R.id.bt_resto:
                resultado = numero1 % numero2;
                                break;
            default:
                                break;
        }
        //---------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/ 100.0;
        //---------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }
/*
    public void sumar(View view) {
        double numero1 = 0;
        try {
            String textoNumero1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textoNumero1);
        }
        catch (Exception e) {
             edt_numero1.setError("numero1 incorrecto");
             return;
        }
        //---------------------------------------------------------
        double numero2 = 0;
        try {
            String textoNumero2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textoNumero2);
        }
        catch (Exception e) {
            edt_numero2.setError("numero2 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double resultado = numero1 + numero2;
        //---------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/ 100.0;
        //---------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void restar(View view) {
        double numero1 = 0;
        try {
            String textoNumero1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textoNumero1);
        }
        catch (Exception e) {
            edt_numero1.setError("numero1 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double numero2 = 0;
        try {
            String textoNumero2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textoNumero2);
        }
        catch (Exception e) {
            edt_numero2.setError("numero2 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double resultado = numero1 - numero2;
        //---------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/ 100.0;
        //---------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void multiplicar(View view) {
        double numero1 = 0;
        try {
            String textoNumero1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textoNumero1);
        }
        catch (Exception e) {
            edt_numero1.setError("numero1 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double numero2 = 0;
        try {
            String textoNumero2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textoNumero2);
        }
        catch (Exception e) {
            edt_numero2.setError("numero2 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double resultado = numero1 * numero2;
        //---------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/ 100.0;
        //---------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void dividir(View view) {
        double numero1 = 0;
        try {
            String textoNumero1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textoNumero1);
        }
        catch (Exception e) {
            edt_numero1.setError("numero1 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double numero2 = 0;
        try {
            String textoNumero2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textoNumero2);
        }
        catch (Exception e) {
            edt_numero2.setError("numero2 incorrecto");
            return;
        }
        if(numero2 == 0)
        {
            edt_numero2.setError("el numero2 no puede ser cero");
            return;
        }
        //---------------------------------------------------------
        double resultado = numero1 / numero2;
        //---------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/ 100.0;
        //---------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void resto(View view) {
        double numero1 = 0;
        try {
            String textoNumero1 = edt_numero1.getText().toString();
            numero1 = Double.valueOf(textoNumero1);
        }
        catch (Exception e) {
            edt_numero1.setError("numero1 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double numero2 = 0;
        try {
            String textoNumero2 = edt_numero2.getText().toString();
            numero2 = Double.valueOf(textoNumero2);
        }
        catch (Exception e) {
            edt_numero2.setError("numero2 incorrecto");
            return;
        }
        //---------------------------------------------------------
        double resultado = numero1 % numero2;
        //---------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado * 100.0)/ 100.0;
        //---------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }
    */

}