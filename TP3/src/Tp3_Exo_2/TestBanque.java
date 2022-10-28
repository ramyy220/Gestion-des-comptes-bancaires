package Tp3_Exo_2;

public class TestBanque {
	public static void main(String[] args) {
		Banque banque = new Banque();
		//Creation des comptes
		banque.ajouterCompte("Hassani", "Mohamed", 5000);
		banque.ajouterCompte("Bakdi", "Amina", 9000);
		banque.ajouterCompte("Slimani", "Rachid", 30000);
		banque.ajouterCompte("Saidi", "Fateh", 8000);
		banque.ajouterCompte("Mani", "Nassima", 9500);
		banque.lister();
		System.out.println();
		
		//modification sur les comptes
		banque.crediterCompte(1, 2000);
		banque.chercherCompte(1).afficherInfos();
		banque.debiterCompte(2, 9000);
		banque.chercherCompte(2).afficherInfos();

		banque.supprimerCompte(2);
		banque.supprimerCompte(5);
		banque.lister();
		
	}

}
