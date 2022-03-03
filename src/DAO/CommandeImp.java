package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entities.commande;

public class CommandeImp implements ICommande {

	private static final commande Null = null;

	@Override
	public void addcommande(commande c) {
		Connection con = SingletonConnexion.getConnexion();
		try{
			PreparedStatement ps = con.prepareStatement("INSERT INTO commande values(?,?,?,?)");
			ps.setInt(1, c.getIdcommande());
			ps.setInt(2, c.getMontant());
			ps.setInt(3,  c.getRefCommande());
			ps.setDate(4,(Date) c.getDatecomm());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void modifiercommande(commande c) {
		Connection con = SingletonConnexion.getConnexion();
		try{
			PreparedStatement ps = con.prepareStatement("UPDATE commande WHERE Refcommande = ?");
			ps.setInt(1, c.getIdcommande());
			ps.setInt(2, c.getMontant());
			ps.setInt(3,  c.getRefCommande());
			ps.setDate(4,(Date) c.getDatecomm());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void supprimercommande(int idcommande) {
		Connection con = SingletonConnexion.getConnexion();
		try{
			PreparedStatement ps = con.prepareStatement("DELETE * FROM commande WHERE Refcommande = ?");
			commande c = null;
			ps.setInt(1, c.getIdcommande());
			ps.setInt(2, c.getMontant());
			ps.setInt(3,  c.getRefCommande());
			ps.setDate(4,(Date) c.getDatecomm());
			ps.executeUpdate();
			ps.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<commande> listcommande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public commande recherchecom(int idcommande) {
		commande c = Null;
		Connection con = SingletonConnexion.getConnexion();
		try{
			c= new commande();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM commande WHERE idcommande = ? ");
			ps.setInt(1, c.getIdcommande());
			ResultSet st = ps.executeQuery(); 
			if(st.next()){
				c.setDatecomm(st.getDate("Datecomm"));
				c.setMontant(st.getInt("Montant"));
				c.setRefCommande(st.getInt("Refcommande"));
				st.close();
			}
				
				
			}catch (Exception e){
				
		}
		if (c == null){
			throw new RuntimeException ("ce commande n'existe pas");
		}
		return c;
		// TODO Auto-generated method stub
		
	}

}
