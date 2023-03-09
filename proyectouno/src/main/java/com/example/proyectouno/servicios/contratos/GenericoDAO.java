package com.example.proyectouno.servicios.contratos;

import com.example.proyectouno.modelo.entidades.Carrera;

import java.util.Optional;

public interface GenericoDAO <E> {

    Optional<E> findById(Integer id);
    E save(E Entidad);
    Iterable<E> findAll();
    void deleteById(Integer id);
}
