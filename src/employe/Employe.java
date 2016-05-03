package employe;

public class Employe {
	private String id;
	private String prenom;
	private String nom;
	private String mtp;
	
	public Employe(String id, String prenom, String nom, String mtp) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
	}
	
	private void envoyerMsg() {
	}

	private void recevoirMsg() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMtp() {
		return mtp;
	}

	public void setMtp(String mtp) {
		this.mtp = mtp;
	}
	
	

}
