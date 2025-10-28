package modelo;

//Clase para las cartas, las cartas únicamente tienen un valor entre 1 y 11
public class Carta {
	private int valor;
	
	public Carta(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

}
