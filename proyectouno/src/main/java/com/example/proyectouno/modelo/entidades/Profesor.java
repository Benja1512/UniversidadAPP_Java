package com.example.proyectouno.modelo.entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "profesores")
@PrimaryKeyJoinColumn(name = "persona_id")

public class Profesor extends Persona{

    private BigDecimal sueldo;
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                        CascadeType.PERSIST,
                        CascadeType.MERGE
            }
    )

    @JoinTable(
            name = "profesor_carrera",
            joinColumns = @JoinColumn(name = "profesor_id"),
            inverseJoinColumns = @JoinColumn(name= "carrera_id")
    )

    private Set<Carrera> carrera;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, String apellido, String dni, LocalDateTime fechaAlta, LocalDateTime fechaModificacion, Direccion direccion, BigDecimal sueldo) {
        super(id, nombre, apellido, dni, fechaAlta, fechaModificacion, direccion);
        this.sueldo = sueldo;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public Set<Carrera> getCarrera() {
        return carrera;
    }

    public void setCarrera(Set<Carrera> carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Profesor{" +
                "sueldo=" + sueldo +
                ", carrera=" + carrera +
                '}';
    }
}
