package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import entities.Produit;

public class ProduitImp implements IProduit {


	@Override
	public void addproduit(Produit p) {
		Connection con = SingletonConnexion.getConnexion();
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO produit values(?,?,?,?)");
			ps.setDouble(1, p.getIdProduit());
			ps.setString(2, p.getNomProduit());
			ps.setDouble(3, p.getPrixUnitaire());
			ps.setInt(4, p.getQuantite());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

	@Override
	public void modifierProduit(Produit p) {
		Connection con = SingletonConnexion.getConnexion();
		
			try {
				PreparedStatement ps = con.prepareStatement("UPDATE produit where idProduit = ? ");
				ps.setDouble(1, p.getIdProduit());
				ps.setString(2, p.getNomProduit());
				ps.setDouble(3, p.getPrixUnitaire());
				ps.setInt(4, p.getQuantite());
				ps.executeUpdate();
				ps.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

	@Override
	public void SupprimerProd(long Idproduit) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Produit> listProduit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit rechercheProduit(long Idproduit) {
	Produit p = null;
	Connection con = SingletonConnexion.getConnexion();
	try {
		p = new Produit();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM Produit WHERE idProduit = ? ");
		ps.setLong(1,Idproduit);
		ResultSet st = ps.executeQuery();
		if(st.next()){
			p.setNomProduit(st.getString("nomProduit"));
			p.setPrixUnitaire(st.getDouble("prixUnitaire"));
			p.setQuantite(st.getInt("quantite"));
			st.close();
	
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	if(p==null){
		throw new RuntimeException(" le produit n'existe pas");
	}
	
		return p;
	}

}
