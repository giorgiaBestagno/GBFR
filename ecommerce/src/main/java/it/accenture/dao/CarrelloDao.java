package it.accenture.dao;

import it.accenture.model.Prodotto;

public interface CarrelloDao {
	
	public boolean insertProdottiIntoCarrello (Prodotto prodotto);
	public boolean deleteProdottoFromCarrello(int idProdotto);
	public void close();

}
