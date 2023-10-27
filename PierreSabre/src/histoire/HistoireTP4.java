package histoire;
import personnages.Humain;
import personnages.Ronin;
import personnages.Commerçant;
import personnages.Yakuza;


public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain(54, "Prof", "kombucha");
		prof.direBonjour();
		prof.parler("J'ai " + prof.getArgent() + "sous en poche. je vais pouvoir m'offrir une boisson a 12.");
		prof.boire();
		prof.acheter("kombucha", 12);
		prof.parler("J'ai"+prof.getArgent()+" sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
		prof.acheter("jeu", 2);
		prof.parler("Je n'ai plus que"+prof.getArgent()+" sous en poche. Je ne peux même pas m'offrir un kimono à50 sous.");
		Commerçant commercant = new Commerçant(20, "Marco");
		commercant.parler("Bonjour ! Je m'appelle" + commercant.getNom() + "et j'aime boire du " + commercant.getBoissonPrefere());
		commercant.seFaireExtorquer();
		commercant.recevoir(15);
		commercant.boire();
		Yakuza Yaku = new Yakuza(30, "Yaku Le Noir", "Whisky", "Tsong");
		Yaku.parler("Bonjour ! Je m'appelle" + Yaku.getNom() + "et j'aime boire du " + Yaku.getBoissonPrefere());
		Yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		Yaku.parler("Marco, si tu tiens à la vie donne moi ta bourse !");
		Yaku.extorquer(commercant);
		Ronin roro = new Ronin(60, "Roro", "Shochu");
		roro.parler("Bonjour ! Je m'appelle" + roro.getNom() + "et j'aime boire du " + roro.getBoissonPrefere());
		roro.donner(commercant);
		
		

	}

}
