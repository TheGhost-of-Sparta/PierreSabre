package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;

	public Yakuza(int argent, String nom, String boissonPrefere, String clan) {
		super(argent, nom, boissonPrefere);
		this.clan=clan;
	}
	
	public void extorquer(Commerçant victime) {
		int argentvole=victime.seFaireExtorquer();
		argent+=argentvole;
		reputation = getReputation() + 1;
		parler("J’ai piqué les" + argentvole + " sous de Marco, ce qui me fait" + argent + " sous dans ma poche. Hi ! Hi !");
	}

	public int getReputation() {
		return reputation;
	}

	public int perdre() {
		int argentperdu = argent;
		argent=0;
		reputation-=1;
		parler("J'ai perdu mes " + argentperdu + " sous, j'ai déshonnoré le clan " + clan);
		return argentperdu;
	}

	public void gagner(int argentgagne) {
		argent+=argentgagne;
		reputation+=1;
		parler("J'ai gagner les yakuza gagnent toujours. Je l'ai dépouillé de " + argentgagne + " sous");
	}
	
	@Override
	public void direBonjour() {
		parler( "Bonjour je m'appelle " + nom + " et j'aime boire du " + boissonPrefere + ". Mon clan est celui de " + clan);
	}
	
	
}
