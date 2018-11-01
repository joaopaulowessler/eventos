package com.example.comp8.eventos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.comp8.eventos.database.dao.EventoDAO;
import com.example.comp8.eventos.objetos.Evento;

public class cadastroFormatura extends AppCompatActivity{

    private EditText edtResponsavel;
    private EditText edtUniversidade;
    private EditText edtCurso;
    private EditText edtData;
    private EditText edtHora;
    private EditText edtQtdPessoas;
    private EditText edtEndereco;

    private Button btnSalvarEvento;
    private Button btnConvidados;

    private EventoDAO eventoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_formatura);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edtResponsavel    = (EditText) findViewById(R.id.edtResponsavel);
        edtUniversidade   = (EditText) findViewById(R.id.edtUniversidade);
        edtCurso          = (EditText) findViewById(R.id.edtCurso);
        edtData           = (EditText) findViewById(R.id.edtData);
        edtHora           = (EditText) findViewById(R.id.edtHora);
        edtQtdPessoas     = (EditText) findViewById(R.id.edtQtdPessoas);
        edtEndereco       = (EditText) findViewById(R.id.edtEndereco);
        btnSalvarEvento   = (Button)   findViewById(R.id.btnSalvarEvento);
        btnConvidados     = (Button)   findViewById(R.id.btnConvidados);

        eventoDAO = new EventoDAO(this);

        btnSalvarEvento   = (Button)   findViewById(R.id.btnSalvarEvento);
        btnSalvarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtResponsavel.getText().toString().isEmpty()){
                    Toast.makeText(cadastroFormatura.this, "Responsável deve ser informado", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtUniversidade.getText().toString().isEmpty()){
                    Toast.makeText(cadastroFormatura.this, "Universidade deve ser informada", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtCurso.getText().toString().isEmpty()){
                    Toast.makeText(cadastroFormatura.this, "Curso deve ser informado", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtData.getText().toString().isEmpty()){
                    Toast.makeText(cadastroFormatura.this, "Data deve ser informada", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtHora.getText().toString().isEmpty()){
                    Toast.makeText(cadastroFormatura.this, "Hora deve ser informada", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtEndereco.getText().toString().isEmpty()){
                    Toast.makeText(cadastroFormatura.this, "Endereço deve ser informado", Toast.LENGTH_SHORT).show();
                    return;
                }

                Evento ev = new Evento();

                ev.setTIPO(8);
                ev.setNOME(edtResponsavel.getText().toString());
                ev.setUNIVERSIDADE(edtUniversidade.getText().toString());
                ev.setCURSO(edtCurso.getText().toString());
                ev.setDATA(edtData.getText().toString());
                ev.setHORA(edtHora.getText().toString());
                ev.setQTDPESSOAS(edtQtdPessoas.getText().toString());
                ev.setLOCALFESTA(edtEndereco.getText().toString());
                eventoDAO.Insert(ev);

                finish();
            }
        });
    }
}
