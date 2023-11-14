package personnages;

public class Samourai extends Humain{
	protected String seigneur;
	
	public Samourai(int argent, String nom, String boissonPrefere, String seigneur) {
		super(argent, nom, boissonPrefere);
		this.seigneur=seigneur;
	}
	
	@Override
	public void direBonjour() {
		parler( "Bonjour je m'appelle " + nom + " et j'aime boire du " + boissonPrefere + ". Je suis fier de servir mon seigneur" + seigneur);
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
	}
}
