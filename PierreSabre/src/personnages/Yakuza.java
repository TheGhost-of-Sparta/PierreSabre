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
		reputation+=1;
		parler("J’ai piqué les" + argentvole + " sous de Marco, ce qui me fait" + argent + " sous dans ma poche. Hi ! Hi !");
	}
	
}
