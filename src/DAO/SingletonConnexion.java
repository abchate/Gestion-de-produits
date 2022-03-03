package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnexion {
private static java.sql.Connection connexion;
	
	static{
		try {
			//pour permettre de d appelle la biblioteque pour les pilote
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//connexion a la base 
			
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_de_produits","root","");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnexion() {
		return (Connection) connexion;
	}

	
	
}


