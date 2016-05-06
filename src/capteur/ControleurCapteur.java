package capteur;

import java.util.HashMap;

import utils.Validation;

public class ControleurCapteur {
	
	private HashMap<String, Capteur> listeCapteur = new HashMap<String, Capteur>();
	
	public ControleurCapteur() {
		this.genererListeCapteurs();
	}
	
	private void genererListeCapteurs() {
		int code = 1230;
		for(int i = 0; i < 3; i++) {
			code++;
			Capteur capteur = new Capteur("Ch2016"+code);
			listeCapteur.put(capteur.getIdChaudiere(), capteur);
		}
	}
	
	public Capteur getCapteur(String idChaudiere) {		
		boolean idValide = Validation.validerId(Capteur.getNomClasse(), idChaudiere);
		assert(idValide == false) : "Le id doit être invalide";
		
		Capteur capteur = null;	
		capteur = listeCapteur.get(idChaudiere);
		return capteur;
	}
	
	public static void main(String[] args) {
		ControleurCapteur cc = new ControleurCapteur();
		cc.getCapteur("dssdds");
	}
	

}
