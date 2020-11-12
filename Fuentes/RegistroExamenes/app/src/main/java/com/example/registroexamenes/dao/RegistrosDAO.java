package com.example.registroexamenes.dao;

import com.example.registroexamenes.dto.Registro;

import java.util.List;

public interface RegistrosDAO {

    List<Registro> getAll();
    Registro save (Registro r);
}
