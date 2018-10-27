package com.example.comp8.eventos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class menuPrincipal extends AppCompatActivity {

    private LinearLayout festaQuinze;
    private LinearLayout aniversario;
    private LinearLayout casamento;
    private LinearLayout churrasco;
    private LinearLayout empresarial;
    private LinearLayout festaGeral;
    private LinearLayout festaInfantil;
    private LinearLayout formatura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        festaQuinze   = (LinearLayout) findViewById(R.id.festaQuinze);
        aniversario   = (LinearLayout) findViewById(R.id.aniversario);
        casamento     = (LinearLayout) findViewById(R.id.casamento);
        churrasco     = (LinearLayout) findViewById(R.id.churrasco);
        empresarial   = (LinearLayout) findViewById(R.id.empresarial);
        festaGeral    = (LinearLayout) findViewById(R.id.festaGeral);
        festaInfantil = (LinearLayout) findViewById(R.id.festaInfantil);
        formatura     = (LinearLayout) findViewById(R.id.formatura);
    }

    public void onClickQuinze(View view){
        startActivity(new Intent(menuPrincipal.this,cadastroQuinze.class));
    }

    public void onClickAniversario(View view){
        Toast.makeText(menuPrincipal.this, "ANIVERSARIO", Toast.LENGTH_SHORT).show();
    }

    public void onClickCasamento(View view){
        Toast.makeText(menuPrincipal.this, "CASAMENTO", Toast.LENGTH_SHORT).show();
    }

    public void onClickChurrasco(View view){
        Toast.makeText(menuPrincipal.this, "CHURRAS", Toast.LENGTH_SHORT).show();
    }

    public void onClickEmpresarial(View view){
        Toast.makeText(menuPrincipal.this, "EMPRESARIAL", Toast.LENGTH_SHORT).show();
    }

    public void onClickFesta(View view){
        Toast.makeText(menuPrincipal.this, "FESTA", Toast.LENGTH_SHORT).show();
    }

    public void onClickInfantil(View view){
        Toast.makeText(menuPrincipal.this, "INFANTIL", Toast.LENGTH_SHORT).show();
    }

    public void onClickFormatura(View view){
        Toast.makeText(menuPrincipal.this, "FORMATURA", Toast.LENGTH_SHORT).show();
    }
}
