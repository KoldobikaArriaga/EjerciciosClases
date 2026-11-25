package Ejercicio01_Taxi;

public class Taxi {
	// ---------------------
	// Atributos
	// ---------------------
	private String provincia;
	private String matricula;
	private String municipio;
	private int motor; // 0 - desconocido
						// 1 - diesel
						// 2 - gasolina

	// ---------------------
	// CONSTRUCTOR
	// ---------------------
	Taxi() {
		this.provincia = "Bizkaia";
		this.motor = 0;
	}

	// ---------------------
	// Métodos
	// ---------------------
	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String herria) {
		this.municipio = herria;
	}

	public int getMotor() {
		return this.motor;
	}

	public String getTipoMotor() {
		String tipoMotor = "";

		switch (this.motor) {
		case 0:
			tipoMotor = "Desconocido";
			break;
		case 1:
			tipoMotor = "Diesel";
			break;
		case 2:
			tipoMotor = "Gasolina";
			break;
		}

		return tipoMotor;
	}

	public void setMotor(int tipoMotor) {
		if ((tipoMotor >= 0) && (tipoMotor < 3)) {
			this.motor = tipoMotor;
		} else {
			// Si me pasan un número malo, el motor será desconocido.
			System.out.println("Tipo de motor erroneo: " + tipoMotor);
			System.out.println("Se asigna motor desconocido.");
			this.motor = 0;
		}
	}

	public String getProvincia() {
		return this.provincia;
	}
	
	/**
	 * 
	 */
	public void imprimeEsteTaxi() {
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Provicia: " + this.provincia);
		System.out.println("Municipio: " + this.municipio);
		System.out.println("Tipo del motor: " + this.motor + "-" + getTipoMotor());
	}

}
