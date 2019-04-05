package br.com.iago.meuprojeto;

import android.content.Intent;
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

    public void proximaTela(View view){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    public void sortearNumero(View view) {

        TextView textDigiNumero = findViewById(R.id.textDigiNumero);
        Integer textInt = Integer.valueOf(textDigiNumero.getText().toString());

        TextView textResults = findViewById(R.id.textoResultado);

        int min = 1;

        Random numero = new Random();
        int result = min + numero.nextInt(textInt);
        if(textInt.equals(0) || textInt.equals(1)){

            textResults.setText("Somente é possível realizar o sorteio com 2 ou mais pessoas!");
        }else{
            textResults.setText("O número selecionado é: "+result);
        }

    }


}