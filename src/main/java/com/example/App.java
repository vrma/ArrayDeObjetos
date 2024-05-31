package com.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
   	
        // Para crear un array de Persona.
    	// Esta primera variante, crea un array INMUTABLE, es decir, 
    	// que no se puede modificar una vez que se ha creado
    	Persona[] personas = {
    		Persona.builder()
    			.nombre("Ivan")
    			.primerApellido("Santiago")
    			.genero(Genero.HOMBRE)
    			.salario(3000.60)
    			.build(),
    		Persona.builder()
    			.nombre("Maria José")
    			.primerApellido("Rodriguez")
    			.salario(2500.50)
    			.genero(Genero.MUJER)
    			.build(),
    		Persona.builder()
    			.nombre("Tamara")
    			.primerApellido("Sanchez")
    			.genero(Genero.MUJER)
    			.salario(2800.90)
    			.build(),
    		Persona.builder()
    			.nombre("Adrian")
    			.primerApellido("Santos")
    			.segundoApellido("Gil")
    			.genero(Genero.HOMBRE)
    			.salario(3000.00)
    			.build()
    	};
    	

    	
    	/*
    	 * Ejercicio # 1. Crear una rama nueva
    	 * 
    	 * Recorrer el array de personas y recuperar el salario promedio
    	 * de todas las personas */
    	
    	double sumatoriaDeLosSalarios = 0.0;
    	int totalDePersonas = personas.length;
    	double salarioPromedio = 0.0;
    	
    	for(Persona persona : personas) {
    		// sumatoriaDeLosSalarios = sumatoriaDeLosSalarios + persona.getSalario();
    		sumatoriaDeLosSalarios += persona.getSalario();
    	}
    	
    	salarioPromedio = sumatoriaDeLosSalarios / totalDePersonas;
      	System.out.println("El salario promedio de todas las personas es: " + salarioPromedio);
      	
      	/*
      	 * */
    	
    	
    	
    	
    	
    	
    	
    	
    	
   
    	
    	
    	
    	
    	
    	
    	
    }
}
