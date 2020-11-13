package com.example.registroexamenes.dto;

import java.io.Serializable;
import java.util.Date;

public class Registro implements Serializable {
    private int id;
    private String rutPaciente;
    private String nombre;
    private String apellido;
    private String fecha;
    private String areaTrabajo;
    private boolean presentaSintomas;
    private double temperatura;
    private boolean presentaTos;
    private int presionArterial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRutPaciente() {
        return rutPaciente;
    }

    public void setRutPaciente(String rutPaciente) {
        this.rutPaciente = rutPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apeliido) {
        this.apellido = apeliido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public boolean isPresentaSintomas() {
        return presentaSintomas;
    }

    public void setPresentaSintomas(boolean presentaSintomas) {
        this.presentaSintomas = presentaSintomas;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isPresentaTos() {
        return presentaTos;
    }

    public void setPresentaTos(boolean presentaTos) {
        this.presentaTos = presentaTos;
    }

    public int getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(int presionArterial) {
        this.presionArterial = presionArterial;
    }
}
