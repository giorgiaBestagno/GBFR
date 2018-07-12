package it.accenture.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import it.accenture.model.Prodotto;
import it.accenture.utilities.DBUtilityConnection;

public class CarrelloDaoImpl implements CarrelloDao {
	
	
	private Connection connection;
	private PreparedStatement prepared;
	
	
     
	public CarrelloDaoImpl() {
		
		connection = DBUtilityConnection.getConnection();
		
	}
	

	@Override
	public boolean insertProdottiIntoCarrello(Prodotto prodotto ) {
		
	    boolean controllo = true;
		String query ="insert into carrello values (id_prodotto = ?)";
		try {
			prepared= connection.prepareStatement(query);
			prepared.setInt(1, prodotto.getIdProdotto());
			prepared.executeUpdate();
			
		} catch (SQLException e) {
			
			controllo = false;
			e.printStackTrace();
		}finally {
			if(prepared != null){
				try {
					prepared.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return controllo;
	}

	@Override
	public boolean deleteProdottoFromCarrello(int idProdotto) {
	    boolean controllo = true;
	    String query = "delete from carrello where id_prodotto = ?";
	    
	    try {
			prepared = connection.prepareStatement(query);
		    prepared.setInt(1, idProdotto);
		    prepared.executeUpdate();

		} catch (SQLException e) {
			
			controllo = false;
			e.printStackTrace();
		}finally {
			if(prepared != null){
				try {
					prepared.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	    
		return controllo;
		
	}

	@Override
	public void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
