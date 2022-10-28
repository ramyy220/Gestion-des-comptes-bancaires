package Tp3_Exo_2;

public class Compte {
	//Les attributs
	private String nom;
	private String prenom;
	private int num;
	private float solde;
	
	//Le constructeur
	public Compte(String nom, String prenom, int num, float solde) {
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
		this.solde = solde;
	}
	
	
	/*************************************************************************************************/
	/*                                          Les methodes                                         */
	/*************************************************************************************************/
	public void debiter(float valeur) {
		solde -= valeur;
	}
	

	public void crediter(float valeur) {
		solde += valeur;
	}

	public float getSolde() {
		return solde;
	}
	
	public void afficherInfos() {
		System.out.println("Compte [num=" + num +", nom=" + nom + ", prenom=" + prenom + ", solde=" + solde + "]");
		
	}


	//accesseur du numero de compte, qui va permettre de reouner le numerode compte dans la methode 
	// ajouterCompte() de la classe 
	public int getNum() {
		return num;
	}



	


	
	
	

}
