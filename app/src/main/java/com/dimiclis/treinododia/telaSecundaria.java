package com.dimiclis.treinododia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class telaSecundaria extends AppCompatActivity {
    private Button botaoVoltar, botao_A, botao_B, botao_C, botao_D, botao_E, botao_domingo, botao_X;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_secundaria);


        botaoVoltar = (Button) findViewById(R.id.botaoVoltar);
        botao_A = (Button) findViewById(R.id.botao_A);
        botao_B = (Button) findViewById(R.id.botao_B);
        botao_C = (Button) findViewById(R.id.botao_C);
        botao_D = (Button) findViewById(R.id.botao_D);
        botao_E = (Button) findViewById(R.id.botao_E);
        botao_domingo = (Button) findViewById(R.id.botao_domingo);
        botao_X = (Button) findViewById(R.id.botao_X);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        botao_domingo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texto = findViewById(R.id.msgTreino);
                texto.setText("Dia de Descanso");
            }
        });

        botao_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texto = findViewById(R.id.msgTreino);
                texto.setText("Treinar Peitoral");
            }
        });
        botao_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texto = findViewById(R.id.msgTreino);
                texto.setText("Treinar Quadríceps");
            }
        });
        botao_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texto = findViewById(R.id.msgTreino);
                texto.setText("Treinar Costas Completo");
            }
        });
        botao_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texto = findViewById(R.id.msgTreino);
                texto.setText("Treinar Ombros e Bíceps femorais");
            }
        });
        botao_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texto = findViewById(R.id.msgTreino);
                texto.setText("Treinar Bíceps, Tríceps e Panturrilha");
            }
        });
        botao_X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texto = findViewById(R.id.msgTreino);
                texto.setText("Treinar Grupamento que deseja melhorar");
            }
        });
    }

}