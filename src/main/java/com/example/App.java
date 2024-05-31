package com.example;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
   	
    	// Queremos crear un array que contenga tanto personas como coches,
    	// en el mismo
    	Object[] personasYCoches = {
       			Persona.builder()
    				.nombre("Rosa")
    				.primerApellido("Castro")	
    				.genero(Genero.MUJER)
    				.build(),
    			Persona.builder()
    				.nombre("Marly")
    				.genero(Genero.MUJER)
    				.build(),
    			Coche.builder()
    				.marca("Audi")
    				.modelo("R2")
    				.build(),
    			Coche.builder()
    				.marca("Mercedez")
    				.modelo("AMG")
    				.build()
     	};
    	
    	// Recorrer al array y operar con los elementos segun el tipo
    	for(Object object : personasYCoches) {
    		
    		// Tengo que determinar si el objeto es una instancia de Persona o de Coche
    		// para lo cual se utiliza el operador instanceof, que comprueba si un objeto 
    		// es una instancia de algun tipo
    		
    		// CON PATTERN MATCHING
    		if(object instanceof Persona p) {
    			// Persona p = (Persona) object;
    			System.out.println("Nombre de la persona: " + p.getNombre());
    		} else if(object instanceof Coche c) {
    			// Coche c = (Coche) object;
    			System.out.println("La marca del coche es: " + c.getMarca());
    			System.out.println("El pais del fabricante es: " + Coche.paisDelFabricante);
    		}
  	
    	}
    }
}
