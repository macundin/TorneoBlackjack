package modelo;

public abstract class Modificador {
	
	protected String nombre;
	protected boolean enJuego;
	
	public Modificador(String nombre) {
		this.nombre = nombre;
		this.enJuego = true;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean getEnJuego() {
		return enJuego;
	}
	
	public void desactivar() {
		this.enJuego = false;
	}
	
	
}
