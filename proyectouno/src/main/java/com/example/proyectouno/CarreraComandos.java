package com.example.proyectouno;

import com.example.proyectouno.modelo.entidades.Carrera;
import com.example.proyectouno.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {
     /*Carrera ingSistemas = new Carrera(null, "Ingenieria en Sistemas", 60, 5);
     Carrera ingIndustrial = new Carrera(null, "ingenieria industrial", 55, 5)
     Carrera ingAlimentos = new Carrera(null, "ingenieria de Alimentos", 40, 5);
     Carrera ingElectronica = new Carrera(null, "ingenieria electronica", 60, 5);

     servicio.save(ingSistemas);
     servicio.save(ingIndustrial);
     servicio.save(ingAlimentos);
     servicio.save(ingElectronica);*/

       /* List<Carrera> carrerasIgnoreCase1 = (List<Carrera>)servicio.findCarreraByNombreContains("SISTEMAS");
        List<Carrera> carrerasIgnoreCase2 = (List<Carrera>)servicio.findCarreraByNombreContains("sistemas");

        carrerasIgnoreCase1.forEach(System.out::println);
        carrerasIgnoreCase2.forEach(System.out::println);*/

        List<Carrera> carreraPorAnio = (List<Carrera>)servicio.findCarrerasByCantidadAniosAfter(4);
        carreraPorAnio.forEach(System.out::println);
    }
}
