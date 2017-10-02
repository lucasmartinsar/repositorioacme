package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	//private static String url = "jdbc:postgresql://localhost/5432/banco_acme";
	
	public static Connection getConnection () {
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost/5432/banco_acme", "", "");
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
		
	}
	
}
