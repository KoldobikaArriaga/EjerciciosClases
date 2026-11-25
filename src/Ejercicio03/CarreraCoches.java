package Ejercicio03;

import java.util.Scanner;

public class CarreraCoches {

	public static void main(String[] args) {
		// Hacemos una carrera de coches
		Scanner teklado = new Scanner(System.in);
		Kotxe elTorpedoNegro = new Kotxe();
		int incremento = 0;
		
		do {
			System.out.printf("Velocidad inicial: %d km/h\n\n", elTorpedoNegro.getVelocidad());
			
			System.out.print("Introduce la variación de velocidad (0 para finalizar): ");
			incremento = Integer.parseInt( teklado.nextLine());
			System.out.println();
			
			if(incremento > 0) {
				elTorpedoNegro.acelera(incremento);
			}
			else if (incremento<0) {
				elTorpedoNegro.frena(incremento);
			}
			
		} while( incremento != 0);
		
		System.out.println("Fin");

	}

}
