package modelo;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
	
	private List<Partida> partidas;
	private List<Jugador> jugadores;
	
	public Torneo(List<Jugador> jugadores) {
		this.jugadores = jugadores;
		this.partidas = new ArrayList<>();	
	}

}
