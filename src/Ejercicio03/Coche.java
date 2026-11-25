package Ejercicio03;

import java.util.Objects;

public class Coche {
	private int velocidad;

	// CONSTRUCTOREs
	public Coche() {
		velocidad = 0;
	}

	public Coche(int velocidad) {
		super();
		this.velocidad = velocidad;
	}

	/**
	 * 
	 * @param mas
	 */
	public void acelera(int mas) {
		if (mas < 0) {
			System.out.println("La aceleración negativa no se contempla en este ejercicio.");
		} else {
			this.velocidad += mas;
		}
	}

	/**
	 * 
	 * @param menos
	 */
	public void frena(int menos) {
		if( menos > 0) {
			System.out.println("La frenada positiva no se contempla en este ejercicio.");
		}
		else {
			this.velocidad += menos;
			if( this.velocidad < 0) {
				this.velocidad = 0;
			}
		}
		
	}

	// LOS GETTERS Y SETTERS
	
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
		Coche other = (Coche) obj;
		return velocidad == other.velocidad;
	}

	@Override
	public String toString() {
		return "Coche [velocidad=" + velocidad + "]";
	}

}
