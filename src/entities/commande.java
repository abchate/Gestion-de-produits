package entities;
import java.util.Date;

public class commande {
	
	private int idcommande;
	private int Montant;
	private int refCommande;
	private Date datecomm;
	
	
	
	public commande(int idcommande, int montant, int refCommande, Date datecomm) {
		super();
		this.idcommande = idcommande;
		Montant = montant;
		this.refCommande = refCommande;
		this.datecomm = datecomm;
	}
	public commande() {
		// TODO Auto-generated constructor stub
	}
	public int getIdcommande() {
		return idcommande;
	}
	public void setIdcommande(int idcommande) {
		this.idcommande = idcommande;
	}
	public int getMontant() {
		return Montant;
	}
	public void setMontant(int montant) {
		Montant = montant;
	}
	public int getRefCommande() {
		return refCommande;
	}
	public void setRefCommande(int refCommande) {
		this.refCommande = refCommande;
	}
	public Date getDatecomm() {
		return datecomm;
	}
	public void setDatecomm(Date datecomm) {
		this.datecomm = datecomm;
	}
	
	
	

}
