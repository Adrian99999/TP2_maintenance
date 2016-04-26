package capteur;

public class Capteur {
	private String temps;
	private String temperature;
	private String idChaudiere;
	private String alerte;

	private void envoyerAlert() {

	}

	public String getTemps() {
		return temps;
	}

	public void setTemps(String temps) {
		this.temps = temps;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getIdChaudiere() {
		return idChaudiere;
	}

	public void setIdChaudiere(String idChaudiere) {
		this.idChaudiere = idChaudiere;
	}

	public String getAlerte() {
		return alerte;
	}

	public void setAlerte(String alerte) {
		this.alerte = alerte;
	}

}
