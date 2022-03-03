package DAO;

import java.util.List;

import entities.catproduit;

public interface ICatProduit {
	public void addcatproduit(catproduit cp);
	public void supprimercatproduit(int idcatproduit);
	public void modifiercatprod(catproduit cp);
	public List<catproduit> listcatproduit();
	public catproduit recherchecatprod(int idcatproduit);
	

}
