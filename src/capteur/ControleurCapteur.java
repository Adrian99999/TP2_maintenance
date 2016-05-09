package capteur;

import java.util.HashMap;

import utils.Validation;

public class ControleurCapteur {
	
	private HashMap<String, Capteur> listeCapteur = new HashMap<String, Capteur>();

	public ControleurCapteur() {
		this.genererListeCapteurs();
	}
	
	private void genererListeCapteurs() {
		
		Capteur capteur1 = new Capteur("Ch2016aaaa");
		Capteur capteur2 = new Capteur("Ch2016bbbb");
		Capteur capteur3 = new Capteur("Ch2016cccc");
		listeCapteur.put(capteur1.getIdChaudiere(), capteur1);
		listeCapteur.put(capteur2.getIdChaudiere(), capteur2);
		listeCapteur.put(capteur3.getIdChaudiere(), capteur3);
		
	}
	
	public Capteur getCapteur(String idChaudiere) {
		Validation validator = new Validation();
		boolean idValide = validator.validerId(Capteur.getNomClasse(), idChaudiere);
		//assert(idValide == false) : "Le id doit être invalide";
		
		Capteur capteur = null;	
		capteur = listeCapteur.get(idChaudiere);
		return capteur;
	}
	
	public static void main(String[] args) {
		ControleurCapteur cc = new ControleurCapteur();
		cc.getCapteur("dssdds");
	}
}
