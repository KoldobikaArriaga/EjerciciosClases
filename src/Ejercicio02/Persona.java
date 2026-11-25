package Ejercicio02;

public class Persona {
	// Atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private String numeroDocumentoIdentidad;
	
	// Construtor
	Persona(){
		
	}
	
	Persona(String nombre, String apellidos, int edad, boolean casado, String numDocId){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.casado = casado;
		this.numeroDocumentoIdentidad = numDocId;
	}
	
	// Mis Metodos
	/**
	 * Devuelve true si la persona es mayor que la que se pasa por parámetro
	 * @param p1 es otra persona
	 * @return true si es mayor
	 */
	public boolean esMayorQue(Persona p1) {
		boolean esMayor = false;
		
		if( this.edad > p1.getEdad()) {
			esMayor = true;
		}
		
		return esMayor;
	}
	
	// Metodos Set / Get
	public void setNombre( String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public String getNumeroDocumentoIdentidad() {
		return numeroDocumentoIdentidad;
	}

	public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
		this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", casado=" + casado
				+ ", numeroDocumentoIdentidad=" + numeroDocumentoIdentidad + "]";
	}
	
	
}
