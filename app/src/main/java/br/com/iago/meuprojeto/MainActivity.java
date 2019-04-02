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

        if(textDigiNumero.getText().toString().trim().equals("")) {

            try{
                textResults.setText("Digite o número de pessoas que participará do sorteio!");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else if(textInt.equals(0) || textInt.equals(1)){
            textResults.setText("Somente é possível realizar o sorteio com 2 ou mais pessoas!");
        }else{
            textResults.setText("O número selecionado é: "+numero);
        }

    }


}