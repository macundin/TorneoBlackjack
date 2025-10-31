package modelo;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	
	private String nombre;
	private int vidas;
	private List<Carta> mano;
	private List<Modificador> modificadores;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.vidas = 5;
		this.mano = new ArrayList<>();
		this.modificadores = new ArrayList<>();
	}
	
	public void agnadirCarta(Carta c) {
		mano.add(c);
	}
	
	public void perderVida() {
		vidas--;
	}
	
	public boolean sigueVivo() {
		return vidas>0;
	}

}
