package DAO;

import java.util.List;

import entities.client;

public interface IClient {
	public void addnewclient(client cl);
	public void modifierclient(client cl);
	public void supprimerclient(int idclient);
	public List<client> listclient();
	public client rechercheclient(int idclient);
	

}
