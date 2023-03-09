package com.example.proyectouno.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "carreras")
public class Carrera implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column( nullable = false, unique = true, length = 80)
    private String nombre;
    @Column(name = "cantidad_materias")
    private Integer cantidadMaterias;
    @Column(name = "cantidad_anios")
    private Integer CantidadAnios;
    @Column(name = "fecha_alta")
    private LocalDateTime fechaAlta;
    @Column(name = "fecha_modificacion")
    private LocalDateTime fechaModificacion;

    @OneToMany(
            mappedBy = "carrera",
            fetch = FetchType.LAZY

    )
    private Set<Alumno> alumno;

    @ManyToMany(
            mappedBy = "carreras",
            fetch = FetchType.LAZY
    )
    private Set<Profesor> profesor;

    public Carrera() {
    }

    public Carrera(Object o, String ingenieria_en_sistemas, int i, int i1) {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(Integer cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public Integer getCantidadAnios() {
        return CantidadAnios;
    }

    public void setCantidadAnios(Integer cantidadAnios) {
        CantidadAnios = cantidadAnios;
    }


    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Set<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(Set<Alumno> alumno) {
        this.alumno = alumno;
    }

    public Set<Profesor> getProfesor() {
        return profesor;
    }

    public void setProfesor(Set<Profesor> profesor) {
        this.profesor = profesor;
    }

    @PrePersist
    private void antesDePersistir() {
        this.fechaAlta = LocalDateTime.now();
    }
    @PreUpdate
    private void antesDeUpdate() {
        this.fechaModificacion = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidadMaterias=" + cantidadMaterias +
                ", CantidadAnios=" + CantidadAnios +
                ", fechaAlta=" + fechaAlta +
                ", fechaModificacion=" + fechaModificacion +
                '}';
    }
}
