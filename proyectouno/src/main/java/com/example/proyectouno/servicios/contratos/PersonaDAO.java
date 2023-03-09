package com.example.proyectouno.servicios.contratos;

import com.example.proyectouno.modelo.entidades.Persona;

import java.util.Optional;

public interface PersonaDAO<P> extends  GenericoDAO <Persona> {


    Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido);
    Optional<Persona> buscarPorDni(String dni);
    Iterable<Persona> buscarPersonaPorApellido(String apellido);
}
