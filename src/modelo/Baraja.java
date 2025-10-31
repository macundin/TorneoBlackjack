package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
	private List<Carta> baraja;
	
	public Baraja() {
		this.baraja = new ArrayList<>();
		for(int i=1; i <= 11; i++) {
			baraja.add(new Carta(i));
		}
		Collections.shuffle(baraja);
	}
	
	public Carta obtenerCarta() {
		if(baraja.isEmpty()) {
			return null;
		}
		return baraja.remove(0);
	}
	
	public void devolverCarta(Carta c) {
		baraja.add(c);
		Collections.shuffle(baraja);
	}
	
	public int cartasRestantes() {
		return baraja.size();
	}
	
	public boolean hayCartas() {
		return !baraja.isEmpty();
	}
	
	public void reiniciarBaraja() {
		baraja.clear();
		for(int i=1; i <= 11; i++) {
			baraja.add(new Carta(i));
		}
		Collections.shuffle(baraja);
	}

}
