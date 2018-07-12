package it.accenture.model;

public class Carrello {
	
	private int idUtente;
	private int idProdotto;
	private double prezzoProdotto;
	
	
	
	public int getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}
	public int getIdProdotto() {
		return idProdotto;
	}
	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}
	public double getPrezzoProdotto() {
		return prezzoProdotto;
	}
	public void setPrezzoProdotto(double prezzoProdotto) {
		this.prezzoProdotto = prezzoProdotto;
	}
	@Override
	public String toString() {
		return "Carrello [ idUtente=" + idUtente + ", idProdotto=" + idProdotto + ", prezzoProdotto="
				+ prezzoProdotto + "]";
	}
	
	
	
	

}
