package com.example.proyectouno.servicios.contratos;

import com.example.proyectouno.modelo.entidades.Carrera;

import java.util.Optional;

public interface CarreraDAO extends GenericoDAO <Carrera>{

    Iterable<Carrera> findCarreraByNombreContains(String nombre);

    Iterable<Carrera> findCarreraByNombreContainsIgnoreCase(String nombre);

    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios);

}
