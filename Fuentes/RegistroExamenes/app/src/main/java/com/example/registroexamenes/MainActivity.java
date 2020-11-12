package com.example.registroexamenes;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.registroexamenes.adapters.RegistroArrayAdapter;
import com.example.registroexamenes.dao.RegistroDAOLista;
import com.example.registroexamenes.dao.RegistrosDAO;
import com.example.registroexamenes.dto.Registro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String tag ="MainAtivity";
    private ListView registrosLv;
    private EditText nombreTxt, passwdTxt;
    private Button agregarBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //agregar el toolbar
        this.setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        this.nombreTxt = findViewById(R.id.IdNombreTxt);
        this.passwdTxt = findViewById(R.id.IdPassTxt);
        this.agregarBtn= findViewById(R.id.agregarBtn);

        this.agregarBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"hola", Toast.LENGTH_SHORT).show();
                List<String> errores = new ArrayList<>();

                String NombBD  = "luis";
                String PassBD = "123";

                if (NombBD.equals(nombreTxt.getText().toString())){
                    //Toast.makeText(MainActivity.this,"nombre correcto", Toast.LENGTH_SHORT).show();

                }else{
                    //Toast.makeText(MainActivity.this,"Agregue un nombre valido", Toast.LENGTH_SHORT).show();
                    errores.add("Agregue un nombre valido");
                }

                if (PassBD.equals(passwdTxt.getText().toString())){
                    //Toast.makeText(MainActivity.this,"pass correcto", Toast.LENGTH_SHORT).show();

                }else{
                    //Toast.makeText(MainActivity.this,"Agregue una pasword valida", Toast.LENGTH_SHORT).show();
                    errores.add("Agregue una pasword valida");
                }

                if(errores.isEmpty()){
                    //Toast.makeText(MainActivity.this," "+ artistaS+" "+ fecS+" " + generoS+" " +valorS+" "+calificacionS, Toast.LENGTH_SHORT).show();

                    Toast.makeText(MainActivity.this,"Agregado exitosamente", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this,VerRegistroActivity.class);
                    startActivity(intent);


                }else{
                    mostrarErrores(errores);
                }
            }
        });

    }

    private void mostrarErrores(List<String> errores){
        String mensaje ="";
        for(String e: errores){
            mensaje+=  "-" + e +"\n";
        }
        //mostrar mensaje de alerta
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
        alertBuilder.setTitle("Error de validacion").setMessage(mensaje).setPositiveButton("Aceptar",null).create().show();

    }

}