package Tp3_Exo_2;

import java.util.ArrayList;

public class Banque {
	//Les attributs
	private String nomBanque;
	private int derNum; //le dernier numero attribue
	private int code;
	private String adresse;
	private int tel;
	private ArrayList<Compte> listeComptes = new ArrayList<>();
	
	// les methodes
	public int ajouterCompte(String nom, String prenom, int montant) {
		derNum++;
		Compte compte = new Compte(nom, prenom, derNum, montant);
		listeComptes.add(compte);
		return derNum;		
	}
	
	public void lister() {
		for(Compte c: listeComptes){
			c.afficherInfos();
		}
	 
	}
	
	public Compte chercherCompte(int num) {
		for (Compte compte : listeComptes)
			if (compte.getNum() == num) 
				return compte;
			return null;
		
		
	}
	
	public boolean supprimerCompte(int num) {
		for (Compte compte : listeComptes)
		    if (compte.getNum() == num) {
		    	listeComptes.remove(compte);
		    	return true;
		    }
			return false;
	    }
	
	
	public void crediterCompte(int num, int montant) {
		this.chercherCompte(num).crediter(montant);
		
	}
	
	public void debiterCompte(int num, int montant) {
		this.chercherCompte(num).debiter(montant);
		
	}
	
	
	public int getDerNum() {
		return derNum;
	}
	

	public static void main(String[] args) {
		Banque b = new Banque();
		System.out.println(b.getDerNum());
	}

}
