package Tp3_Exo_1;

public class TestComplexe {
	public static void main(String[] args) {
		// Creation de l'objet c1, et affectation des valeurs aux attributs
		Complexe c1 = new Complexe();
		c1.re = 7.0f;
		c1.im = 2.0f;
		
		//utilisation de la methode afficher() sur c1
		c1.num = 1; // affectation de l'attribut num pour c1
		c1.afficher();
		
		/* Tests des methodes sur c1*/
		//c1.conjugue();
		
		
		//creation de c2
		Complexe c2 = new Complexe(3.0f, 8.0f, 2);
		c2.afficher();
		
		//creation de c3, pour tester les methodes setPolaire() ainsi que setCartesien()
		Complexe c3 = new Complexe(1.0f, 1.0f, 3);
		c3.setPolaire();
		System.out.println(c3.getRho());
		System.out.println(c3.getTheta());
	}

}
