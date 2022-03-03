package DAO;

import java.util.List;


import entities.fournisseur;

public interface IFournisseur {
	public void addproduit(fournisseur f);
	public void modifierProduit(fournisseur f);
	public void SupprimerProd(long Idfournisseur);
	public List<fournisseur> listfournisseur();
	public fournisseur rechercheProduit(long idfournisseur);

}
