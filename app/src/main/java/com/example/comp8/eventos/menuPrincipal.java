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

        Intent it = new Intent(this, listagemEventos.class);
        it.putExtra("Tipo", "1");
        startActivity(it);
    }

    public void onClickAniversario(View view){

        Intent it = new Intent(this, listagemEventos.class);
        it.putExtra("Tipo", "2");
        startActivity(it);
    }

    public void onClickCasamento(View view){

        Intent it = new Intent(this, listagemEventos.class);
        it.putExtra("Tipo", "3");
        startActivity(it);
    }

    public void onClickChurrasco(View view){

        Intent it = new Intent(this, listagemEventos.class);
        it.putExtra("Tipo", "4");
        startActivity(it);
    }

    public void onClickEmpresarial(View view){

        Intent it = new Intent(this, listagemEventos.class);
        it.putExtra("Tipo", "5");
        startActivity(it);
    }

    public void onClickFesta(View view){

        Intent it = new Intent(this, listagemEventos.class);
        it.putExtra("Tipo", "6");
        startActivity(it);
    }

    public void onClickInfantil(View view){

        Intent it = new Intent(this, listagemEventos.class);
        it.putExtra("Tipo", "7");
        startActivity(it);
    }

    public void onClickFormatura(View view){

        Intent it = new Intent(this, listagemEventos.class);
        it.putExtra("Tipo", "8");
        startActivity(it);
    }
}
