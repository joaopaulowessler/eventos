package com.example.comp8.eventos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class adicionarConvidado extends AppCompatActivity {

    private EditText nome;
    private EditText CPF;
    private EditText idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adicionar_convidados);

        nome = (EditText) findViewById(R.id.edtNome);
        CPF = (EditText) findViewById(R.id.edtCPF);
        idade = (EditText) findViewById(R.id.edtIdade);
    }



}
