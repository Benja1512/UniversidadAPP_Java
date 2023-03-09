package com.example.proyectouno.servicios.contratos;

import com.example.proyectouno.modelo.entidades.Persona;

public interface AlumnoDAO extends PersonaDAO {

    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);


}
