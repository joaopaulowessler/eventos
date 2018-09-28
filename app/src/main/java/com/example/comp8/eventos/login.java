package com.example.comp8.eventos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {

    private EditText editEmail;
    private EditText editSenha;
    private CheckBox checkRelembrar;
    private Button   btnEntrar;
    private TextView textCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editEmail      = (EditText) findViewById(R.id.editEmail);
        editSenha      = (EditText) findViewById(R.id.editSenha);
        checkRelembrar = (CheckBox) findViewById(R.id.checkRelembrar);
        btnEntrar      = (Button)   findViewById(R.id.btnEntrar);
        textCadastrar  = (TextView) findViewById(R.id.textCadastrar);
    }
}
