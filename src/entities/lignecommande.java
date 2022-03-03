package entities;

public class lignecommande {
	private int idlignecom;
	private int Reflingcom;
	private float quantite;
	public lignecommande(int idlignecom, int reflingcom, float quantite) {
		super();
		this.idlignecom = idlignecom;
		Reflingcom = reflingcom;
		this.quantite = quantite;
	}
	public int getIdlignecom() {
		return idlignecom;
	}
	public void setIdlignecom(int idlignecom) {
		this.idlignecom = idlignecom;
	}
	public int getReflingcom() {
		return Reflingcom;
	}
	public void setReflingcom(int reflingcom) {
		Reflingcom = reflingcom;
	}
	public float getQuantite() {
		return quantite;
	}
	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}
	
	

}
