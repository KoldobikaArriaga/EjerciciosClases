package Ejercicio01_Taxi;

public class TaxiApp {

	public static void main(String[] args) {
		// Creo taxis y los imprimo
		Taxi superTaxi = new Taxi();
		
		superTaxi.setMatricula("7789HHJ");
		superTaxi.setMunicipio("Errigoiti");
		superTaxi.setMotor(2);
		
		superTaxi.imprimeEsteTaxi();


	}

}
