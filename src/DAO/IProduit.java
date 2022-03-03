package DAO;

import java.util.List;

import entities.Produit;

public interface IProduit {
	public void addproduit(Produit p);
	public void modifierProduit(Produit p);
	public void SupprimerProd(long Idproduit);
	public List<Produit> listProduit();
	public Produit rechercheProduit(long idProduit);

}
