package entities;

public class catproduit {
	private int idcatproduit;
	private String nomCatproduit;
	
	public catproduit(int catproduit, String nomCatproduit) {
		super();
		this.idcatproduit = catproduit;
		this.nomCatproduit = nomCatproduit;
	}

	public int getCatproduit() {
		return idcatproduit;
	}

	public void setCatproduit(int catproduit) {
		this.idcatproduit = catproduit;
	}

	public String getNomCatproduit() {
		return nomCatproduit;
	}

	public void setNomCatproduit(String nomCatproduit) {
		this.nomCatproduit = nomCatproduit;
	}
	
	

}
