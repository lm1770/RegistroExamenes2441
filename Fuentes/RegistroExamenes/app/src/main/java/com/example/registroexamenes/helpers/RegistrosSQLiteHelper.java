package com.example.registroexamenes.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class RegistrosSQLiteHelper extends SQLiteOpenHelper {

    private final String sqlCreate = "CREATE TABLE registro(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL" +
            ",rut TEXT" +
            ",nombre TEXT" +
            ",apellido TEXT" +
            ",fecha TEXT" +
            ",area TEXT" +
            ",sintomas NUMERIC " +
            ",temperatura REAL" +
            ",tos NUMERIC " +
            ",presion INTEGER)";


    public RegistrosSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(sqlCreate);

        sqLiteDatabase.execSQL("INSERT INTO registros (rut,nombre,apellido,fecha,area,sintomas,temperatura,tos,presion)" +
                "VALUES ('192-8','jamon','olivo','05/09/2020','otro',1,39,1,120)");

        sqLiteDatabase.execSQL("INSERT INTO registros (rut,nombre,apellido,fecha,area,sintomas,temperatura,tos,presion)" +
                "VALUES ('192-8','pipe','bernal','05/06/2020','otro',0,38,1,120)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS registros");
        sqLiteDatabase.execSQL(sqlCreate);
    }
}
