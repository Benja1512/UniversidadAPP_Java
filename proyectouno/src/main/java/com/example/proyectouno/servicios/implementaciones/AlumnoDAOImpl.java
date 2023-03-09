package com.example.proyectouno.servicios.implementaciones;

import com.example.proyectouno.modelo.entidades.Persona;
import com.example.proyectouno.repositorios.AlumnoRepository;
import com.example.proyectouno.repositorios.PersonaRepository;
import com.example.proyectouno.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO {



    @Autowired

    public AlumnoDAOImpl(@Qualifier("repositorioAlumnos")PersonaRepository repository)
    { super(repository); }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre) {
        return ((AlumnoRepository)repository).buscarAlumnosPorNombreCarrera(nombre);
    }


}
