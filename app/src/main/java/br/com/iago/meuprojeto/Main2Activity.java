package br.com.iago.meuprojeto;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView campoTexto = (TextView) findViewById(R.id.fundoTela);

        Button botaoTexto = (Button) findViewById(R.id.botaoTexto);
        final Button botaoCor = (Button) findViewById(R.id.botaoCor);

        final ConstraintLayout fundoTela = (ConstraintLayout) findViewById(R.id.fundoTela);

        botaoTexto.setOnClickListener(new Button.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              campoTexto.setText("Felpudinho");
                                          }
                                      }
        );
        botaoCor.setOnClickListener(new Button.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            fundoTela.setBackgroundColor(Color.parseColor("#0B9AE2"));
                                        }
                                    }
        );

    }

}


