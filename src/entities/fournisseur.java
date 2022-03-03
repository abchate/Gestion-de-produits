package entities;

public class fournisseur {
	private int idfournisseur;
	private String nomFournisseur;
	private String prenomFournisseur;
	private int numeroFournisseur;
	public fournisseur(int idfournisseur, String nomFournisseur,
			String prenomFournisseur, int numeroFournisseur) {
		super();
		this.idfournisseur = idfournisseur;
		this.nomFournisseur = nomFournisseur;
		this.prenomFournisseur = prenomFournisseur;
		this.numeroFournisseur = numeroFournisseur;
	}
	public int getIdfournisseur() {
		return idfournisseur;
	}
	public void setIdfournisseur(int idfournisseur) {
		this.idfournisseur = idfournisseur;
	}
	public String getNomFournisseur() {
		return nomFournisseur;
	}
	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}
	public String getPrenomFournisseur() {
		return prenomFournisseur;
	}
	public void setPrenomFournisseur(String prenomFournisseur) {
		this.prenomFournisseur = prenomFournisseur;
	}
	public int getNumeroFournisseur() {
		return numeroFournisseur;
	}
	public void setNumeroFournisseur(int numeroFournisseur) {
		this.numeroFournisseur = numeroFournisseur;
	}
	

}
