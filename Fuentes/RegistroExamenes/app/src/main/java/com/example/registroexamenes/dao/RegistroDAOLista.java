package com.example.registroexamenes.dao;

import com.example.registroexamenes.dto.Registro;

import java.util.ArrayList;
import java.util.List;

public class RegistroDAOLista implements RegistrosDAO{

    private List<Registro> registros = new ArrayList<>();
    private static RegistroDAOLista instancia;

    private RegistroDAOLista(){
        Registro r = new Registro();
        r.setRutPaciente("123-k");
        r.setNombre("Boris");
        r.setApellido("Gutierrez");
        r.setFecha("12/01/2020");
        r.setAreaTrabajo("Otro");
        r.setPresentaSintomas(true);
        r.setTemperatura(38);
        r.setPresentaTos(true);
        r.setPresionArterial(120);
        registros.add(r);
        r = new Registro();
        r.setRutPaciente("456-k");
        r.setNombre("Francisco");
        r.setApellido("Donoso");
        r.setFecha("03/06/2020");
        r.setAreaTrabajo("Otro");
        r.setPresentaSintomas(true);
        r.setTemperatura(39);
        r.setPresentaTos(true);
        r.setPresionArterial(130);
        registros.add(r);
        r = new Registro();
        r.setRutPaciente("789-k");
        r.setNombre("Ariel");
        r.setApellido("Tapia");
        r.setFecha("10/08/2020");
        r.setAreaTrabajo("Atencion a publico");
        r.setPresentaSintomas(false);
        r.setTemperatura(37);
        r.setPresentaTos(true);
        r.setPresionArterial(120);
        registros.add(r);

    }

    public static RegistroDAOLista getInstance(){
        if (instancia == null){
            instancia = new RegistroDAOLista();
        }
        return instancia;
    }


    @Override
    public List<Registro> getAll() {
        return registros;
    }

    @Override
    public Registro save(Registro r) {
        registros.add(r);
        return r;
    }
}
