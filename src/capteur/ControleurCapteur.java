package capteur;

import java.util.HashMap;

public class ControleurCapteur {
	
	private HashMap<String, Capteur> listeCapteur = new HashMap<String, Capteur>();
	
	public ControleurCapteur() {
		this.genererListeCapteurs();
	}
	
	private void genererListeCapteurs() {
		int code = 123;
		for(int i = 0; i < 3; i++) {
			code++;
			Capteur capteur = new Capteur("C"+code);
			listeCapteur.put(capteur.getIdChaudiere(), capteur);
		}
	}
	
	public Capteur getCapteur(String idChaudiere) {
		Capteur capteur = null;
		

			capteur = listeCapteur.get(idChaudiere);

		
		return capteur;
	}
	

}
