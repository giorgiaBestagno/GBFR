package it.accenture.model;

import java.time.LocalDate;

public class Acquisto {
	
	private int idAquisto;
	private Spedizione spedizione;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private int quantitaAcquistata;
	private int idUtente;
	private int idProdotto;
	
	
	public int getIdAquisto() {
		return idAquisto;
	}
	public void setIdAquisto(int idAquisto) {
		this.idAquisto = idAquisto;
	}
	public Spedizione getSpedizione() {
		return spedizione;
	}
	public void setSpedizione(Spedizione spedizione) {
		this.spedizione = spedizione;
	}
	public LocalDate getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	public LocalDate getDataFine() {
		return dataFine;
	}
	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}

	
	public int getQuantitaAcquistata() {
		return quantitaAcquistata;
	}
	public void setQuantitaAcquistata(int quantitaAcquistata) {
		this.quantitaAcquistata = quantitaAcquistata;
	}
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
	@Override
	public String toString() {
		return "Acquisto [idAquisto=" + idAquisto + ", spedizione=" + spedizione + ", dataInizio=" + dataInizio
				+ ", dataFine=" + dataFine + ", quantitaAcquistata="
				+ quantitaAcquistata + ", idUtente=" + idUtente + ", idProdotto=" + idProdotto + "]";
	}
	
	

}
