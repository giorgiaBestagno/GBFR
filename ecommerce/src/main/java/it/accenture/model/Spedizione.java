package it.accenture.model;

public enum Spedizione {

	EXPRESS(3,5.0), 
	STANDARD(5,0.0),
	PREMIUM(1,8.0);
	
	private int numeroGiorni;
	private double costo;
	
	private Spedizione(int numeroGiorni, double costo) {
		this.numeroGiorni = numeroGiorni;
		this.costo = costo;
	}
	public int getNumeroGiorni() {
		return numeroGiorni;
	}
	public void setNumeroGiorni(int numeroGiorni) {
		this.numeroGiorni = numeroGiorni;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
}
