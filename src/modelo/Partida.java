package modelo;

public class Partida {
	private Jugador j1;
	private Jugador j2;
	private Baraja baraja;
	
	public Partida(Jugador j1, Jugador j2) {
		this.j1 = j1;
		this.j2 = j2;
		this.baraja = new Baraja();
	}
	
	public Jugador obtenerGanador() {
		if(!j1.sigueVivo()){
			return j2;
		}
		else if(!j2.sigueVivo()) {
			return j1;
		}
		return null;
	}
	
	public boolean partidaAcabada() {
		return !j1.sigueVivo() || !j2.sigueVivo();
	}
	
	public void ronda() {
		Carta cartaJ1 = baraja.obtenerCarta();
		Carta cartaJ2 = baraja.obtenerCarta();
		
		j1.agnadirCarta(cartaJ1);
		j2.agnadirCarta(cartaJ2);
		
		//Añadir modificador a cada jugador
		
		//Añadir jugabilidad de ronda (Jugador puede robar carta, jugar un modificador o pasar turno)
		
		//Si el puntuaje del j1 es mayor que 21 y mayor que el de j2, j1 pierde vida
		
		//Si el puntuaje del j2 es mayor que 21 y mayor que el de j1, j2 pierde vida
		
		//Si el puntuaje del j1 es mayor que 21 e igual que el de j2, ambos pierden vida
		
		//Si el puntuaje del j1 es igual o menor que 21 y mayor que el de j2, j2 pierde vida
		
		//Si el puntuaje del j2 es igual o menor que 21 y mayor que el de j1, j1 pierde vida
		
		//Si el puntuaje del j1 es igual o menor que 21 e igual que el de j2, ninguno pierde vida
		
	}
	
	

}
