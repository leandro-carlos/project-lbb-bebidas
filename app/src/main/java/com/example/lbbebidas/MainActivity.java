package com.example.lbbebidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText recebeValor;
    Button btnCalcular;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encontrando dentro da interface;

        recebeValor = findViewById(R.id.recebeValor);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcularPercentaje(View view){

        String valorString = recebeValor.getText().toString();  // Resgatando o valor;
        Double valorDouble = Double.parseDouble(valorString);  // Passando pra numero;

        Double percentaje = valorDouble * 0.12; // Pegando os 12% do valor digitado
        Double valorTotal = valorDouble + percentaje;


        String totalCompra = String.valueOf(valorTotal); //Convertendo pra string
        txtResultado.setText(totalCompra);
    }

    public void limpar(View view){
        txtResultado.setText(" ");
    }
}