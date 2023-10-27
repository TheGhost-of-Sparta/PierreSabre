package personnages;

public class Humain {
	protected int argent;
	private String nom;
	private String boissonPrefere;
	
	public Humain(int argent, String nom, String boissonPrefere) {
		this.argent = argent;
		this.nom = nom;
		this.boissonPrefere = boissonPrefere;
	}
	
	private void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	
	private void perdreArgent(int perte) {
		this.argent-=perte;
	}
	
	public void parler (String text) {
		System.out.println("("+nom+") -"+text);
	}
	
	public String getBoissonPrefere() {
		return boissonPrefere;
	}

	public void direBonjour() {
		parler( "Bonjour je m'appelle" + nom + "et j'aime boire du" + boissonPrefere);
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


	
}
