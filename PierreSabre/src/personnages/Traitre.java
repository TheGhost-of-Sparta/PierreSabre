package personnages;
import java.util.*;

public class Traitre extends Samourai{
	private int niveauTraitrise=0;
	
	public Traitre(int argent, String nom, String boissonPrefere, String seigneur) {
		super(argent, nom, boissonPrefere,seigneur);
	}
	
	private void ranconner(Commerçant commercant) {
		if(niveauTraitrise<3) {
			int montantAExtorquer=commercant.getArgent()/5;
			commercant.perdreArgent(montantAExtorquer);
			this.gagnerArgent(montantAExtorquer);
			parler("Si tu veux ma protection contre les yakuzas, il va falloir payer ! Donne moi " + montantAExtorquer + " sous ou gare a toi !");
			commercant.parler("Tout de suite grand " + this.getNom());
	
		} else {
			parler("Mince je ne peu plus ranconner personne sinnon un samourai risque de me demasquer");
		}
	}
	
	private void faireLeGentil() {
		if (nbConnaissances<1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif...");
		} else {
			Random ran = new Random();
	  		Humain victime= memoire[ran.nextInt(nbConnaissances)];
	  		int don = argent*1/20;
	  		String nomAmi= victime.getNom();
	  		parler("Il faut absoluement remonter ma cote de confiance. Je vais faire ami ami avec " +nomAmi);
	  		parler("Bonjour l'ami je voudrais vous aider en vous donnant " + don + "sous.");
	  		victime.gagnerArgent(don);
	  		this.perdreArgent(don);
	  		victime.parler("Merci " + this.getNom() + "Vous etes quelqu'un de bien");
	  		if (niveauTraitrise>1) {
	  			niveauTraitrise--;
	  		}
	  		
		}
	}
	
	@Override
	public void direBonjour() {
		parler( "Bonjour je m'appelle " + nom + " et j'aime boire du " + boissonPrefere + ". Je suis fier de servir mon seigneur" + seigneur + ". Mon niveau traitrise actuel est de " + niveauTraitrise);
	}
	

}
