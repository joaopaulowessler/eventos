package com.example.comp8.eventos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.comp8.eventos.database.dao.UsuarioDAO;

public class login extends AppCompatActivity {

    private EditText editEmail;
    private EditText editSenha;
    private CheckBox checkRelembrar;
    private Button   btnEntrar;
    private TextView textCadastrar;

    private UsuarioDAO userDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editEmail      = (EditText) findViewById(R.id.editEmail);
        editSenha      = (EditText) findViewById(R.id.editSenha);
        checkRelembrar = (CheckBox) findViewById(R.id.checkRelembrar);
        btnEntrar      = (Button)   findViewById(R.id.btnEntrar);
        textCadastrar  = (TextView) findViewById(R.id.textCadastrar);

        userDAO = new UsuarioDAO(this);

        final SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(login.this);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userDAO.SelectUser(editEmail.getText().toString(), editSenha.getText().toString())){

                    SharedPreferences.Editor edit = preferences.edit();
                    edit.putString("editEmail",editEmail.getText().toString());
                    edit.apply();

                    startActivity(new Intent(login.this,menuPrincipal.class));
                }
                else{
                    Toast.makeText(login.this, "Usuário Inválido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        final SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(login.this);

        editEmail = (EditText) findViewById(R.id.editEmail);
        editEmail.setText(preferences.getString("editEmail",""));
    }

    public void onClick(View view ){
        startActivity(new Intent(login.this,cadastroUsuario.class));
    }
}
