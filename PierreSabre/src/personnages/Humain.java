package personnages;

public class Humain {
	protected int argent;
	protected String nom;
	protected String boissonPrefere;
	protected int nbConnaissances=0;
	protected Humain [] memoire = new Humain[30];
	
	public Humain(int argent, String nom, String boissonPrefere) {
		this.argent = argent;
		this.nom = nom;
		this.boissonPrefere = boissonPrefere;
	}
	
	protected void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	
	protected void perdreArgent(int perte) {
		this.argent-=perte;
	}
	
	public void parler (String text) {
		System.out.println("("+nom+") -"+text);
	}
	
	public String getBoissonPrefere() {
		return boissonPrefere;
	}

	public void direBonjour() {
		parler( "Bonjour je m'appelle " + nom + " et j'aime boire du " + boissonPrefere);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPrefere + "! GLOUPS !");
	}
	
	public void acheter(String bien , int prix) {
		perdreArgent(prix);
	}
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissances==30) {
			for (int i=0; i<nbConnaissances-1; i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[nbConnaissances-1]=humain;
		}else {
			memoire[nbConnaissances]=humain;
			nbConnaissances++;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.repondre(this);
		memoriser(humain);
		
	}
	
	public void listerConnaisance() {
		parler("Je connais beaucoup de monde dont : ");
		for (int i =0; i<nbConnaissances;i++ ) {
			System.out.println(memoire[i].getNom());
		}
	}


	
}
