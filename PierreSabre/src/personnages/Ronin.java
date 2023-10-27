package personnages;

public class Ronin extends Humain{
	
	private int honneur=1;
	
	public Ronin(int argent, String nom, String boissonPrefere) {
		super(argent, nom, boissonPrefere);
	}
	
	public void donner(Commerçant commercant) {
		parler("Marco prend ces " + argent/10);
		commercant.recevoir(argent/10);
		argent-=argent/10;
	}

	public void provoquer(Yakuza adversaire) {
		int force= 2*honneur;
		if (adversaire.getReputation()<=force) {
			honneur+=1;
			argent+=adversaire.perdre();
			parler("J'ai gagné c'était trop simple");
		} else {
			honneur-=1;
			adversaire.gagner(argent);
			argent=0;
		}
	}
}
