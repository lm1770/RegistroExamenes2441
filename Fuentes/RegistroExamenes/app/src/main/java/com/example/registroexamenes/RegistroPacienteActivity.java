package com.example.registroexamenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import com.example.registroexamenes.dto.Registro;

public class RegistroPacienteActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView rutTxt;
    private TextView nombreTxt;
    private TextView fechaTxt;
    private TextView areaTxt;
    private TextView sintomasTxt;
    private TextView tosTxt;
    private TextView temperaturaTxt;
    private TextView presionTxt;
    private TextView tituloToolbar;

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_paciente);

        //agregar el toolbar
        this.toolbar = findViewById(R.id.toolbar);
        this.rutTxt = findViewById(R.id.rutRegTxt);
        this.nombreTxt = findViewById(R.id.nombreRegTxt);
        this.fechaTxt = findViewById(R.id.fechaRegTxt);
        this.areaTxt = findViewById(R.id.areaRegTxt);
        this.sintomasTxt = findViewById(R.id.sintomasRegTxt);
        this.tosTxt = findViewById(R.id.tosRegTxt);
        this.temperaturaTxt = findViewById(R.id.temperaturaRegTxt);
        this.presionTxt = findViewById(R.id.presionRegTxt);
        this.tituloToolbar = findViewById(R.id.tituloToolbar);

        this.setSupportActionBar(this.toolbar);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        if (getIntent() !=null){
            Registro registro = (Registro) getIntent().getSerializableExtra("registro");
            this.rutTxt.setText(registro.getRutPaciente());
            this.nombreTxt.setText(registro.getNombre() + " " + registro.getApellido());
            this.fechaTxt.setText(registro.getFecha());
            this.areaTxt.setText(registro.getAreaTrabajo());
            this.sintomasTxt.setText(String.valueOf(registro.isPresentaSintomas()));
            this.tosTxt.setText(String.valueOf(registro.isPresentaTos()));
            this.temperaturaTxt.setText(String.valueOf(registro.getTemperatura()));
            this.presionTxt.setText(String.valueOf(registro.getPresionArterial()));
            this.tituloToolbar.setText("Paciente");
        }
    }
}