package com.example.comp8.eventos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class cadastroUsuario extends AppCompatActivity {

    private EditText editNome;
    private EditText editEmail;
    private EditText editDtNasc;
    private EditText editTelefone;
    private EditText editSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        editNome        =   (EditText) findViewById(R.id.editNomeCadastro);
        editEmail       =   (EditText) findViewById(R.id.editEmailCadastro);
        editDtNasc      =   (EditText) findViewById(R.id.editDtNascCadastro);
        editTelefone    =   (EditText) findViewById(R.id.editTelefoneCadastro);
        editSenha       =   (EditText) findViewById(R.id.editSenha);



    }
}
