package Tp3_Exo_1;

public class Complexe {
	
	/**
	 * attributs, publics 
	 */
	public float re;
	public float im;
	public int nbr;
	public int num;
	
	/**
	 * attributs prives
	 */
	private float rho;
	private float theta;
	
	/*************************************************************************************************/
	/*                            Surcharge des constructeurs                                        */
	/*************************************************************************************************/
	
	/**
	 * Le premier constructeur "calassique", qui remplie les attributs 
	 */
	public Complexe(float re, float im, int num) {
		this.re = re;
		this.im = im;
		this.num = num;
	}

	
	/**
	 * Le deuxieme constructeur, qui ne fait rien
	 */
	public Complexe() {
		
	}
	
	/**
	 * La difference est que :
	 * Dans le premier constructeur, on pourra affecter des valeurs aux attributs à l'instantiation des objets
	 * Dans le second, on se contentera de creer les objets en memoire sans leur attribuer de valeur a la 
	 * création 
	 */
	
	/**
	 * troisiem constructeur, qui specifie si on est dans un repaire polaire ou non
	 */
	public Complexe(float re, float im, boolean repPolaire) {
		this.re = re;
		this.im = im;
	}
	// le troisiem parametre est de type booleen, 
	
	/*************************************************************************************************/
	/*                                 La methode afficher()                                         */
	/*************************************************************************************************/
	
	public void afficher() {
		System.out.println("C"+num+"="+re+"+i*"+im);
	}
	


	/*************************************************************************************************/
	/*                                Les methodes à realiser                                        */
	/*************************************************************************************************/
	
	//La methode conjugue()
	public void conjugue() {
		im = -im;
		//System.out.println("Le conjugue de C"+num+" est : C"+num+"="+re+"-i*"+im);
	}
	
	//La methode ajoute()
	public void ajoute(Complexe c) {
		this.re += c.re;
		this.im += c.im;
	}
	
	//La methode soustrait()
	public void soustrait(Complexe c) {
		this.re -= c.re;
		this.im -= c.im;
	}
	
	/*************************************************************************************************/
	/*                                Les methodes certesien et polaire                              */
	/*************************************************************************************************/
	
	/**
	 * La methode setCartesien(), qui calcule la perie reelle ainsi que la partie imaginaire de la
	 * reprsentation cartesienne d'un nombre complexes a partir des valeurs de rho et theta
	 */
	public void setCartesien() {
		re = (float) Math.cos((float) theta);
		im = (float) Math.sin((float) theta);
	}
	
	/**
	 * La methode setPolaire(), qui calcule la valeur du module rho, ainsi que l'argument theta
	 * à partir des données cartesiennes
	 */
	public void setPolaire() {
		//Etape 1 : calcule du moduke rho
		float add = (float) (Math.pow((float)this.re, 2) + Math.pow((float)this.im, 2));
		rho = (float) Math.sqrt((float)add);
		
		//Etape 2 : calcule de theta
		theta = (float) Math.atan((float) im/re);
	}
	
	
	/*************************************************************************************************/
	/*                                Les methodes de calcul                                         */
	/*************************************************************************************************/
	
	public void produit(Complexe c) {
		this.re = this.re * c.re + this.re * c.im;
		this.im = this.im * c.re + this.im *c.im;
	}
	
	public void divise(Complexe c) {
		this.re = this.re * c.re - this.re * c.im;
		this.im = this.im * c.re - this.im *c.im;
		
	}
	


	/*************************************************************************************************/
	/*                                Les accesseurs et modificateurs                                */
	/*************************************************************************************************/
	public float getRe() {
		return re;
	}


	public void setRe(float re) {
		this.re = re;
	}


	public float getIm() {
		return im;
	}


	public void setIm(float im) {
		this.im = im;
	}


	public float getRho() {
		return rho;
	}


	public void setRho(float rho) {
		this.rho = rho;
	}


	public float getTheta() {
		return theta;
	}


	public void setTheta(float theta) {
		this.theta = theta;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
