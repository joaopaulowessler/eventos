package com.example.comp8.eventos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.comp8.eventos.database.dao.UsuarioDAO;

public class cadastroUsuario extends AppCompatActivity {

    private EditText editNome;
    private EditText editEmail;
    private EditText editSenha;

    private Button   btnSalvarCadastro;

    private UsuarioDAO userDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        userDAO = new UsuarioDAO(this);

        editNome          =   (EditText) findViewById(R.id.editNomeCadastro);
        editEmail         =   (EditText) findViewById(R.id.editEmailCadastro);
        editSenha         =   (EditText) findViewById(R.id.editSenha);
        btnSalvarCadastro = (Button) findViewById(R.id.btnSalvarCadastro);
        btnSalvarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userDAO.Insert(editEmail.getText().toString(),editSenha.getText().toString(),editNome.getText().toString());
            }
        });
    }
}
