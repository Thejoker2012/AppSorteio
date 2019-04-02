package br.com.iago.meuprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view) {

        TextView textDigiNumero = findViewById(R.id.textDigiNumero);
        Integer textInt = Integer.valueOf(textDigiNumero.getText().toString());

        TextView textResults = findViewById(R.id.textoResultado);

        int numero = new Random().nextInt(textInt + 1);


        if (numero == 0) {
            textResults.setText("Não é possível sortear sem participantes !!!");
        } else if (numero == 0 || numero == 1) {
            textResults.setText("Não é possível sortear sem participantes !!!");


        }

    }
}