package com.example.registroexamenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.registroexamenes.adapters.RegistroArrayAdapter;
import com.example.registroexamenes.dao.RegistroDAOLista;
import com.example.registroexamenes.dao.RegistrosDAO;
import com.example.registroexamenes.dto.Registro;

import java.util.List;

public class VerRegistroActivity extends AppCompatActivity {

    private ListView registrosLv;
    private List<Registro> registros;
    private RegistroArrayAdapter adaptador;
    private RegistrosDAO registrosDAO = RegistroDAOLista.getInstance();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_registro);

        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        registros = registrosDAO.getAll();
        adaptador = new RegistroArrayAdapter(this,R.layout.registros_list, registros);
        registrosLv = findViewById(R.id.registros_lv);
        registrosLv.setAdapter(adaptador);
        registrosLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(VerRegistroActivity.this,RegistroPacienteActivity.class);
                Registro regActual = registros.get(position);
                intent.putExtra("registro",regActual);

                startActivity(intent);
            }
        });



    }
}