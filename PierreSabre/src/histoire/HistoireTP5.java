package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Commerçant;
import personnages.Yakuza;
import personnages.Samourai;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commerçant marco = new Commerçant(20,"Marco");
		Commerçant chonin = new Commerçant(40,"Chonin");
		Commerçant kumi = new Commerçant(10,"kumi");
		Yakuza yaku = new Yakuza(30, "Yaku Le Noir", "Whiskey", "Warsong");
		Ronin roro = new Ronin(60, "Roro", "shochu");
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(kumi);
		marco.faireConnaissanceAvec(chonin);
		marco.listerConnaisance();
		roro.listerConnaisance();
		yaku.listerConnaisance();
		Samourai akimoto= new Samourai(80, "Akimoto", "saké", "Miyamoto");
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaisance();
		akimoto.boire("thé");
		
	}

}
