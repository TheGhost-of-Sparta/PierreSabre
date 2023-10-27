package personnages;

public class Commerçant extends Humain {

	public Commerçant(int argent, String nom) {
		super(argent, nom, "thé");
	}
	
	public int seFaireExtorquer() {
		int perte = argent;
		argent=0;
		parler("J'ai tout perdu le monde est trop injuste");
		return perte;
	}
	
	public int recevoir(int argentrecu) {
		argent+= argentrecu;
		parler(argentrecu + " sous ! Je te remercie généreux donateur!");
		return argent;	
	}

}
