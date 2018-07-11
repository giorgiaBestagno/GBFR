package it.accenture.utilites;

import java.sql.Connection;

public class TestConnection {
	public static void main(String[] args) {
		//ogni volta che vogliamo stabilire la connessione istanzio la connsessione cosi:
		
		Connection connection = DBUtilityConnection.getConnection();
		
		if (connection != null) {
			System.out.println("connessione ottenuta con successo");
		}
	}

}


