package Ejercicio4;

import java.util.Scanner;

public class AppDni {

	private static Scanner teklado;

	public static void main(String[] args) {
		// Ejercicio 04
		String nombre;
		int edad;
		char sexo;
		double peso, altura; // peso en kg. y altura en m.

		teklado = new Scanner(System.in);

		// Creamos la PRIMERA PERSONA
		// Solicitamos los datos
		System.out.println("Datos de la persona:");
		System.out.print("Nombre: ");
		nombre = teklado.nextLine();
		System.out.print("Edad: ");
		edad = Integer.parseInt(teklado.nextLine());
		System.out.print("Sexo [H/M/E]: ");
		sexo = teklado.nextLine().toUpperCase().charAt(0);
		System.out.print("Peso (Kg): ");
		peso = Double.parseDouble(teklado.nextLine());
		System.out.print("Altura (m): ");
		altura = Double.parseDouble(teklado.nextLine());

		// Creamos la primera persona
		Persona perLehenengoa = new Persona(nombre, edad, "", sexo, peso, altura);
		System.out.println("Creada la primera persona ....");

		ponerDatosPersona(perLehenengoa);
		System.out.println(perLehenengoa.toString());

		// Creamos la SEGUNDA PERSONA
		// Solicitamos los datos
		System.out.println("\nDatos de la persona:");
		System.out.print("Nombre: ");
		nombre = teklado.nextLine();
		System.out.print("Edad: ");
		edad = Integer.parseInt(teklado.nextLine());
		System.out.print("Sexo [H/M/E]: ");
		sexo = teklado.nextLine().toUpperCase().charAt(0);

		Persona perBigarrena = new Persona(nombre, edad, sexo);
		System.out.println("Creada la segunda persona ....");

		System.out.print("Peso (Kg): ");
		peso = Double.parseDouble(teklado.nextLine());
		System.out.print("Altura (m): ");
		altura = Double.parseDouble(teklado.nextLine());

		perBigarrena.setPeso(peso);
		perBigarrena.setAltura(altura);

		ponerDatosPersona(perBigarrena);
		System.out.println(perBigarrena.toString());

		// Creamos la TERCERA PERSONA
		Persona perHirugarrena = new Persona();
		System.out.println("Creada la tercera persona ....");

		System.out.println("Datos de la persona:");
		System.out.print("Nombre: ");
		nombre = teklado.nextLine();
		System.out.print("Edad: ");
		edad = Integer.parseInt(teklado.nextLine());
		System.out.print("Sexo [H/M/E]: ");
		sexo = teklado.nextLine().toUpperCase().charAt(0);
		System.out.print("Peso (Kg): ");
		peso = Double.parseDouble(teklado.nextLine());
		System.out.print("Altura (m): ");
		altura = Double.parseDouble(teklado.nextLine());

		perHirugarrena.setNombre(nombre);
		perHirugarrena.setEdad(edad);
		perHirugarrena.setSexo(sexo);
		perHirugarrena.setAltura(altura);
		perHirugarrena.setPeso(peso);

		ponerDatosPersona(perHirugarrena);
		System.out.println(perHirugarrena.toString());

		teklado.close();
	}

	/**
	 * Imprime los datos de la persona según lo que solicita el enunciado
	 * @param unaPersonaCualquiera
	 * @author infkarriaga
	 */
	private static void ponerDatosPersona(Persona unaPersonaCualquiera) {
		// Pongo sus datos
		System.out.println("Se llama: " + unaPersonaCualquiera.getNombre());
		System.out.printf("Tiene %d años ", unaPersonaCualquiera.getEdad());
		if (unaPersonaCualquiera.esMayorDeEdad()) {
			System.out.println("y es mayor de edad.\n");
		} else {
			System.out.println("y es menor de edad.\n");
		}

		int imc = unaPersonaCualquiera.calcularIMC();
		if (imc == -1) {
			System.out.println("Esta persona está por DEBAJO de su peso ideal");
		} else if (imc == 0) {
			System.out.println("Esta persona ESTÁ en su peso ideal, oso ondo!");
		} else {
			System.out.println("Esta persona tiene SOBREPESO, kontuz!");
		}

	}

}
