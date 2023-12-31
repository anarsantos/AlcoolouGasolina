package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editPrecoAlcool;
    private EditText editEditGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        editEditGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularPreco (View view) {
        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editEditGasolina.getText().toString());

        /* Faz cálculo (precoAlcool/precoGasolina)
            Se resultado >= 0.7 melhor utilizar gasolina
            Senão melhor utilizar Álcool
         */
        Double resultado = precoAlcool/precoGasolina;
        if (resultado >= 0.7) {
            textResultado.setText("Melhor utilizar gasolina.");
        } else {
            textResultado.setText("Melhor utilizar álcool.");
        }
    }
}