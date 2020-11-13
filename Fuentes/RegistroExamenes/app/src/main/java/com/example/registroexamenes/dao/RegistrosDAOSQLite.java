package com.example.registroexamenes.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.registroexamenes.dto.Registro;
import com.example.registroexamenes.helpers.RegistrosSQLiteHelper;

import java.util.ArrayList;
import java.util.List;

public class RegistrosDAOSQLite implements RegistrosDAO{

    private RegistrosSQLiteHelper registrosHelper;

    public RegistrosDAOSQLite(Context context){
        this.registrosHelper = new RegistrosSQLiteHelper(context,"DBRegistros",null,1);


    }

    @Override
    public List<Registro> getAll() {
        SQLiteDatabase reader = this.registrosHelper.getReadableDatabase();
        List<Registro> registros = new ArrayList<>();

        try{
            if (reader !=null){
                Cursor c = reader.rawQuery("SELECT id,rut,nombre,apellido,fecha,area,sintomas,temperatura,tos,presion FROM registros",null);
                if (c.moveToFirst()){
                    do {
                        Registro r = new Registro();
                        r.setId(c.getInt(0));
                        r.setNombre(c.getString(1));
                        r.setApellido(c.getString(2));
                        r.setFecha(c.getString(3));
                        r.setAreaTrabajo(c.getString(4));
                        r.setPresentaSintomas(c.getWantsAllOnMoveCalls());
                        r.setTemperatura(c.getDouble(6));
                        r.setPresentaTos(c.getWantsAllOnMoveCalls());
                        r.setPresionArterial(c.getInt(8));
                        registros.add(r);
                    }while (c.moveToNext());
                }
                reader.close();
            }
        }catch (Exception ex){
            registros = null;
        }


        return registros;

    }

    @Override
    public Registro save(Registro r) {
        SQLiteDatabase writer = this.registrosHelper.getWritableDatabase();

        return r;
    }
}
