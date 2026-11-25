package Ejercicio03;

import java.util.Objects;

public class Kotxe {

	private int velocidad;
	
	public Kotxe() {
		this.velocidad=0;
	}
	
	/**
	 * 
	 * @param mas
	 */
	public void acelera(int mas) {
		
		this.velocidad += mas;
	}
	
	/**
	 * 
	 * @param menos
	 */
	public void frena(int menos) {
		
		this.velocidad += menos;
		
		if( this.velocidad < 0) {
			this.velocidad = 0;
		}
	}

	// GETTERS y SETTERS
	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Kotxe [velocidad=" + velocidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(velocidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kotxe other = (Kotxe) obj;
		return velocidad == other.velocidad;
	}
	
	

	
}
