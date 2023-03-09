package com.example.proyectouno;

import com.example.proyectouno.modelo.entidades.Alumno;
import com.example.proyectouno.modelo.entidades.Carrera;
import com.example.proyectouno.modelo.entidades.Persona;
import com.example.proyectouno.servicios.contratos.AlumnoDAO;
import com.example.proyectouno.servicios.contratos.CarreraDAO;
import com.example.proyectouno.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;

import java.util.Optional;

public class AlumnosComandos implements CommandLineRunner {

    @Autowired
    @Qualifier("AlumnoDAOImpl")
    private PersonaDAO personaDao;
    @Autowired
    private CarreraDAO carreraDao;

    @Override
    public void run(String... args) throws Exception {
        Optional<Carrera> ingSistemas = carreraDao.findById(2);

        /*Iterable<Persona> alumnos = personaDao.findAll();
        alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(ingSistemas.get()));
        alumnos.forEach((alumno -> personaDao.save(alumno)));*/

        /*Optional<Persona> alumno_1 = personaDao.findById(1);*/


        /*Optional<Persona> personaDni = personaDao.buscarPorDni(alumno_1.get().getDni());
        System.out.println(personaDni.toString());

        Iterable<Persona> personasApellido = personaDao.buscarPersonaPorApellido(alumno_1.get().getApellido());
        personasApellido.forEach(System.out::println);*/

        Optional<Persona> alumno_2 = personaDao.findById(2);
        Iterable<Persona> alumnosCarrera = ((AlumnoDAO) personaDao).buscarAlumnosPorNombreCarrera(ingSistemas.get().getNombre());
        alumnosCarrera.forEach(System.out::println);



    }
}
