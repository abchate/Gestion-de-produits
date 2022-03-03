package DAO;



import java.util.List;

import entities.commande;

public interface ICommande {
	public void addcommande(commande c);
	public void modifiercommande(commande c);
	public void supprimercommande(int Refcommande);
	public List <commande> listcommande();
	public commande recherchecom(int Refcommande);
	


}
