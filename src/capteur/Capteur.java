package capteur;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import utils.Validation;

public class Capteur {
	private String temps;
	private String temperature;
	private String idChaudiere;
	private String alerte;

	public Capteur(String idChaudiere) {
		this.setIdChaudiere(idChaudiere);
	}

	public String getTemps() {
		return temps;
	}

	public void setTemps(String temps) {
		this.temps = temps;
	}

	public String getTemperature() {
		NumberFormat formatter = new DecimalFormat("#0.00");
		this.temperature = formatter.format(Math.random() * 100 + 1);
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getIdChaudiere() {
		return idChaudiere;
	}

	public void setIdChaudiere(String idChaudiere) {
		Validation validateur = new Validation();
		boolean idValide = validateur.validerId(Capteur.getNomClasse(), idChaudiere);
		assert(idValide == true) : "Capteur: L'id doit être valide";
		this.idChaudiere = idChaudiere;
	}

	public String getAlerte() {
		return alerte;
	}

	public void setAlerte(String alerte) {
		this.alerte = alerte;
	}
	
	public static String getNomClasse() {
		return "capteur.Chaudiere";
	}
	
	public static void main(String[] args) {
		Capteur capteur = new Capteur("Ch20161234");
	}
	
}
