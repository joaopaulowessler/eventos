package com.example.comp8.eventos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.comp8.eventos.database.dao.EventoDAO;
import com.example.comp8.eventos.database.model.EventoModel;
import com.example.comp8.eventos.objetos.Evento;

public class cadastroInfantil extends AppCompatActivity{

    private EditText edtResponsavel;
    private EditText edtAniversariante;
    private EditText edtData;
    private EditText edtHora;
    private EditText edtQtdPessoas;
    private EditText edtEndereco;
    private EditText edtDecoracao;
    private EditText edtBrinquedo;

    private Button btnSalvarEvento;
    private Button btnConvidados;

    private EventoDAO eventoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_infantil);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edtResponsavel    = (EditText) findViewById(R.id.edtResponsavel);
        edtAniversariante = (EditText) findViewById(R.id.edtAniversariante);
        edtData           = (EditText) findViewById(R.id.edtData);
        edtHora           = (EditText) findViewById(R.id.edtHora);
        edtQtdPessoas     = (EditText) findViewById(R.id.edtQtdPessoas);
        edtEndereco       = (EditText) findViewById(R.id.edtEndereco);
        edtDecoracao      = (EditText) findViewById(R.id.edtDecoracao);
        edtBrinquedo      = (EditText) findViewById(R.id.edtBrinquedo);
        btnSalvarEvento   = (Button)   findViewById(R.id.btnSalvarEvento);
        btnConvidados     = (Button)   findViewById(R.id.btnConvidados);

        eventoDAO = new EventoDAO(this);

        btnSalvarEvento   = (Button)   findViewById(R.id.btnSalvarEvento);
        btnSalvarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtResponsavel.getText().toString().isEmpty()){
                    Toast.makeText(cadastroInfantil.this, "Responsável deve ser informado", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtAniversariante.getText().toString().isEmpty()){
                    Toast.makeText(cadastroInfantil.this, "Aniversariante deve ser informado", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtData.getText().toString().isEmpty()){
                    Toast.makeText(cadastroInfantil.this, "Data deve ser informada", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtHora.getText().toString().isEmpty()){
                    Toast.makeText(cadastroInfantil.this, "Hora deve ser informada", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtEndereco.getText().toString().isEmpty()){
                    Toast.makeText(cadastroInfantil.this, "Endereço deve ser informado", Toast.LENGTH_SHORT).show();
                    return;
                }

                Evento ev = new Evento();

                ev.setTIPO(4);
                ev.setNOME(edtResponsavel.getText().toString());
                ev.setANIVERSARIANTE(edtAniversariante.getText().toString());
                ev.setDATA(edtData.getText().toString());
                ev.setHORA(edtHora.getText().toString());
                ev.setQTDPESSOAS(edtQtdPessoas.getText().toString());
                ev.setLOCALFESTA(edtEndereco.getText().toString());
                ev.setDECORACAO(edtDecoracao.getText().toString());
                ev.setBRINQUEDO(edtBrinquedo.getText().toString());
                eventoDAO.Insert(ev);

                finish();
            }
        });
    }
}
