package Ejercicio02;

import java.util.Scanner;

public class PersonaMain {

	private static Scanner teklado;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Preguntamos por dos personas.
		Persona persona1;
		Persona persona2;

		teklado = new Scanner(System.in);

		persona1 = crearPersona();
		persona2 = crearPersona();
		
		// Mostramos los datos
		persona1.toString();
		persona2.toString();

		// Buscamos al mayor
		if( persona1.esMayorQue(persona2)) {
			System.out.printf("La persona llamada %s, %s es la mayor.\n", persona1.getApellidos(), persona1.getNombre());
		}
		else if( persona2.esMayorQue(persona1)){
			System.out.printf("La persona llamada %s, %s es la mayor.\n", persona2.getApellidos(), persona2.getNombre());
		}
		else {
			System.out.println("Ambas personas son de la misma edad.");
		}

		teklado.close();
	}

	/**
	 * 
	 * @return
	 */
	public static Persona crearPersona() {
		Persona personaCreada;
		
		String nombre;
		String apellidos;
		int edad;
		boolean casado;
		String numDocId;

		System.out.println("Damos los datos de la persona:");
		System.out.print("Nombre: ");
		nombre = teklado.nextLine();

		System.out.print("Apellido: ");
		apellidos = teklado.nextLine();

		try {
			System.out.print("Edad: ");
			edad = Integer.parseInt(teklado.nextLine());
		} catch (NumberFormatException error) {
			System.out.println("Te he solicitado la edad ... la pongo a 18 años");
			edad = 18;
		}
		
		System.out.print("¿Está casado? [s/N]: ");
		if( teklado.nextLine().toUpperCase().charAt(0) == 'S') {
			casado = true;
		}
		else {
			casado = false;
		}
		
		System.out.print("DNI: ");
		numDocId = teklado.nextLine();
		
		// Creamos la persona con los datos incluidos
		personaCreada = new Persona(nombre, apellidos, edad, casado, numDocId);
		
		return personaCreada;
	}

}
