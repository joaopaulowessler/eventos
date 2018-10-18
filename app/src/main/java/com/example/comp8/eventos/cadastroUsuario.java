package com.example.comp8.eventos;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        final SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(cadastroUsuario.this);

        userDAO = new UsuarioDAO(this);

        editNome          =   (EditText) findViewById(R.id.editNomeCadastro);
        editEmail         =   (EditText) findViewById(R.id.editEmailCadastro);
        editSenha         =   (EditText) findViewById(R.id.editSenha);
        btnSalvarCadastro = (Button) findViewById(R.id.btnSalvarCadastro);
        btnSalvarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editNome.getText().toString().isEmpty()){
                    Toast.makeText(cadastroUsuario.this, "Nome deve ser informado", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (editEmail.getText().toString().isEmpty()){
                    Toast.makeText(cadastroUsuario.this, "Email deve ser informado", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (editSenha.getText().toString().isEmpty()){
                    Toast.makeText(cadastroUsuario.this, "Senha deve ser informada", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (userDAO.ValidaEmail(editEmail.getText().toString())){
                    Toast.makeText(cadastroUsuario.this, "Email já cadastrado", Toast.LENGTH_SHORT).show();
                    return;
                }

                userDAO.Insert(editEmail.getText().toString(),editSenha.getText().toString(),editNome.getText().toString());

                SharedPreferences.Editor edit = preferences.edit();
                edit.putString("editEmail",editEmail.getText().toString());
                edit.apply();

                finish();
            }
        });
    }

    public void onClick(View view ){
        finish();
    }
}
