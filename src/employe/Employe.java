package employe;

import utils.Validation;

public class Employe {
	private String id;
	private String prenom;
	private String nom;
	private String mtp;

	public Employe() {}
	
	public Employe(String id, String prenom, String nom, String mtp) {
		setId(id);
		this.prenom = prenom;
		this.nom = nom;
		this.mtp = mtp;
	}
	
	private void envoyerMsg() {
	}

	private void recevoirMsg() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		//assert (Validation.validerId(this.getClass().getName(), id)) : Validation.messageErreur;
		boolean valide = Validation.validerId("Employe", "iffikfdif");
		if(valide) {
			assert (valide) : "L'id n'est pas valide";
			this.id = id;
		}
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
	
	
	public static void main(String[] args) {

		//Employe em = new Employe("E2016aa11", "fsdf", "fsd", "fsdf");

		// System.out.println(em.getId());
			
	}
}
