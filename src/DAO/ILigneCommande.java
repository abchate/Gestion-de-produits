package DAO;

import java.util.List;

import entities.lignecommande;

public interface ILigneCommande {
	public void addlignecommande(lignecommande lc);
	public void modifierlignecommande(lignecommande lc);
	public void supprimerlignecommande(int Reflignecom);
	public List <lignecommande> listlignecommande();
	public lignecommande recherchelignecom(int Reflignecom);

}
