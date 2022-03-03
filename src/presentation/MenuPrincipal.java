package presentation;

import DAO.IProduit;
import DAO.ProduitImp;
import entities.Produit;



public class MenuPrincipal {

	public static void main(String[] args) {
		IProduit prod = new ProduitImp();
		prod.addproduit(new Produit("ordinateur",25,45));
		try{
			Produit p = prod.rechercheProduit(7);
			p.setNomProduit("voiture");
			prod.modifierProduit(p);
			System.out.println(p.getNomProduit());
		}catch(Exception e){
			
		}
			
		
		
		
		

	}
       

}