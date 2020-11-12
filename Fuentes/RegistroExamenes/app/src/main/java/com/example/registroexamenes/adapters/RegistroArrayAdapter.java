package com.example.registroexamenes.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.registroexamenes.R;
import com.example.registroexamenes.dto.Registro;

import java.util.List;

public class RegistroArrayAdapter extends ArrayAdapter<Registro> {

    private Activity activity;
    private List<Registro> registros;
    public RegistroArrayAdapter(@NonNull Activity context, int resource, @NonNull List<Registro> objects) {
        super(context, resource, objects);
        this.activity = context;
        this.registros = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        View fila = inflater.inflate(R.layout.registros_list, null,true);
        TextView rutTv = fila.findViewById(R.id.rut_regist_lv);
        TextView nombreTv = fila.findViewById(R.id.nombre_regist_lv);
        TextView apellidoTv = fila.findViewById(R.id.apellido_regist_lv);
        TextView fechaTv = fila.findViewById(R.id.fecha_regist_lv);
        Registro actual = registros.get(position);
        rutTv.setText(actual.getRutPaciente());
        nombreTv.setText(actual.getNombre());
        apellidoTv.setText(actual.getApellido());
        fechaTv.setText(actual.getFecha());

        return fila;
    }
}
