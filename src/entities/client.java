package entities;

public class client {
	private int idclient;
	private String nomClient;
	private String prenomClient;
	private int numeroClient;
	public client(int idclient, String nomClient, String prenomClient,
			int numeroClient) {
		super();
		this.idclient = idclient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.numeroClient = numeroClient;
	}
	public int getIdclient() {
		return idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public int getNumeroClient() {
		return numeroClient;
	}
	public void setNumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}
	
	
	
	

}
