package com.example.proyectouno.repositorios;

import com.example.proyectouno.modelo.entidades.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface CarreraRepository extends CrudRepository<Carrera, Integer> {

    //@Query("select c from Carrera c where c.nombre like %?1%")
    Iterable<Carrera> findCarreraByNombreContains(String nombre);
    //@Query("select c from Carrera c where upper(c.nombre) like upper(%?1%)")
    Iterable<Carrera> findCarreraByNombreContainsIgnoreCase(String nombre);
    //@Query("select c from Carrera c where c.cantidadAnios > ?1")
    Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios);

}
