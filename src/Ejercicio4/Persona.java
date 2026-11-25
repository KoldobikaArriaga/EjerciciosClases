package Ejercicio4;

public class Persona {
	private final char emakumea = 'M';
	private final char gizona = 'H';
	private final char ezDeklaratua = 'E';

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	private String[] letraDNI = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
			"V", "H", "L", "C", "K", "E" };

	// CONSTRUCTORES

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = generaDNI();
		this.sexo = emakumea;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.sexo = sexo;
		comprobarSexo(sexo);
		this.peso = 0.0;
		this.altura = 0.0;
	}

	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	// METODOS ESPECIALES
	/**
	 * Devuelve la clasificación del peso según el imc
	 * @return 0 -> Peso ideal 1 -> Sobrepeso -1-> Infrapeso
	 * @author infkarriaga
	 */
	public int calcularIMC() {
		final int ANOREXIA = -1;
		final int IDEAL = 0;
		final int SOBREPESO = 1;
		
		int valorIMC = 0;

		// double imc = (this.peso) / (Math.pow(this.altura, 2));
		double imc = (peso) / (altura * altura);

		if (imc < 20.0) {
			valorIMC = ANOREXIA;
		} else if ((imc >= 20.0) && (imc <= 25.0)) {
			valorIMC = IDEAL;
		} else {
			valorIMC = SOBREPESO;
		}

		return valorIMC;
	}

	/**
	 * 
	 * @return true -> es mayor de edad false -> no es mayor de edad
	 * @author infkarriaga
	 */
	public boolean esMayorDeEdad() {
		boolean esMayor = false;

		if (this.edad >= 18) {
			esMayor = true;
		}

		return esMayor;
	}

	/**
	 * Comprueba el caracter del sexo, si es erroneo lo sustituye con una H de hombre
	 * @param sexo
	 * @author infkarriaga
	 */
	private void comprobarSexo(char sexo) {

		if (!(sexo == 'H' || sexo == 'M' || sexo == 'E')) {
			// La letra del sexo es erronea
			this.sexo = gizona;
		}
	}

	/**
	 * Generar un numero de 8 cifras. Dividirlo por 23 y quedarnos con el resto para
	 * calcular la letra. La letra la sacamos del array de letrasDNI
	 * 
	 * @return String con el número del DNI
	 * @author infkarriaga
	 */
	private String generaDNI() {
		String strDni = "";
		
		long numDni = (long) (Math.random() * Math.pow(10, 8));

		strDni = String.valueOf(numDni).concat(letraDNI[(int) (numDni % 23)]);

		return strDni;
	}

	// GETTERS Y SETTERS
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
		comprobarSexo(sexo);
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

}
