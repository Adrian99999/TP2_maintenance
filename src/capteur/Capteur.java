package capteur;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import utils.ValiderId;

public class Capteur {
	private String temps;
	private String temperature;
	private String idChaudiere;
	private String alerte;

	public Capteur(String idChaudiere) {
		this.idChaudiere = idChaudiere;
	}

	private void envoyerAlert() {

	}

	public String getTemps() {
		return temps;
	}

	public void setTemps(String temps) {
		this.temps = temps;
	}

	public String getTemperature() {
		NumberFormat formatter = new DecimalFormat("#0.00");
		return formatter.format(Math.random() * 100 + 1);
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getIdChaudiere() {
		return idChaudiere;
	}

	public void setIdChaudiere(String idChaudiere) {
		assert (ValiderId.validerId(this.getClass().getName(), idChaudiere)) : ValiderId.messageErreur;
		this.idChaudiere = idChaudiere;
	}

	public String getAlerte() {
		return alerte;
	}

	public void setAlerte(String alerte) {
		this.alerte = alerte;
	}

}
