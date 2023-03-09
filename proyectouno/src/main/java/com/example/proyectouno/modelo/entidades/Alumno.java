package com.example.proyectouno.modelo.entidades;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn

public class Alumno extends Persona {


    @ManyToOne(
            optional = true,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            fetch =  FetchType.LAZY
    )

    @JoinColumn(name = "carrera_id")
    private Carrera carrera;

    public Alumno(Object o, String raul, String perez, String s, Direccion direccion) {
    }

    public Alumno(Integer id, String nombre, String apellido, String dni, LocalDateTime fechaAlta, LocalDateTime fechaModificacion, Direccion direccion) {
        super(id, nombre, apellido, dni, fechaAlta, fechaModificacion, direccion);
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Alumno{" +
                "carrera=" + carrera +
                '}';
    }
}
