package com.example.proyectouno;

import com.example.proyectouno.modelo.entidades.Alumno;
import com.example.proyectouno.modelo.entidades.Direccion;
import com.example.proyectouno.modelo.entidades.Persona;
import com.example.proyectouno.servicios.contratos.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProyectounoApplication {



	public static void main(String[] args) {
		String[] beanDefinitionNames = SpringApplication.run(ProyectounoApplication.class, args).getBeanDefinitionNames();
		/* for(String str = beanDefinitionNames){
			System.out.println(str);*/
		}


		}

