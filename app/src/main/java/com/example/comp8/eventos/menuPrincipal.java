package com.example.comp8.eventos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.LinearLayout;

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
}
