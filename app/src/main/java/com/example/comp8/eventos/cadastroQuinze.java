package com.example.comp8.eventos;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.comp8.eventos.database.dao.EventoDAO;
import com.example.comp8.eventos.database.dao.UsuarioDAO;
import com.example.comp8.eventos.database.model.EventoModel;

public class cadastroQuinze extends AppCompatActivity{

    private EditText edtResponsavel;
    private EditText edtAniversariante;
    private EditText edtData;
    private EditText edtHora;
    private EditText edtQtdPessoas;
    private EditText edtEndereco;
    private EditText edtDecoracao;
    private EditText edtMusica;

    private Button btnSalvarEvento;
    private Button btnConvidados;

    private EventoDAO eventoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_quinze);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edtResponsavel    = (EditText) findViewById(R.id.edtResponsavel);
        edtAniversariante = (EditText) findViewById(R.id.edtAniversariante);
        edtData           = (EditText) findViewById(R.id.edtData);
        edtHora           = (EditText) findViewById(R.id.edtHora);
        edtQtdPessoas     = (EditText) findViewById(R.id.edtQtdPessoas);
        edtEndereco       = (EditText) findViewById(R.id.edtEndereco);
        edtDecoracao      = (EditText) findViewById(R.id.edtDecoracao);
        edtMusica         = (EditText) findViewById(R.id.edtMusica);
        btnSalvarEvento   = (Button)   findViewById(R.id.btnSalvarEvento);
        btnConvidados     = (Button)   findViewById(R.id.btnConvidados);

        eventoDAO = new EventoDAO(this);

        btnSalvarEvento   = (Button)   findViewById(R.id.btnSalvarEvento);
        btnSalvarEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtResponsavel.getText().toString().isEmpty()){
                    Toast.makeText(cadastroQuinze.this, "Responsável deve ser informado", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edtAniversariante.getText().toString().isEmpty()){
                    Toast.makeText(cadastroQuinze.this, "Aniversariante deve ser informada", Toast.LENGTH_SHORT).show();
                    return;
                }

                EventoModel ev = new EventoModel();

                eventoDAO.Insert(ev);

                finish();
            }
        });
    }
}
