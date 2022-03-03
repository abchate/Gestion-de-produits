package entities;

public class Produit {
	private long idProduit;
	private String nomProduit;
	private double prixUnitaire;
	private int quantite;
	
	//consteucteur sans parametre
	
	public Produit() {
		super();
	}
	//constructeur avec parametre
	
	public Produit(String nomProduit, double prixUnitaire, int quantite) {
		super();
		this.nomProduit = nomProduit;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}
	
	//Creation des getter and setter
	
	public long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}
	
	public String getNomProduit() {
		return nomProduit;
	}


	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


}
