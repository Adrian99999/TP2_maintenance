package employe;

import utils.Validation;

public class Employe {
	private String id;
	private String prenom;
	private String nom;
	private String mtp;
	private String nomClasse="employe.Employe";

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
		boolean valide = Validation.validerId(this.getClass().getName(), id); 
		assert(valide == true) : "Le id doit �tre valide";
		if(valide) {
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
		boolean mtpValide = Validation.validerMtp(mtp);
		assert(mtpValide == true) : "Employe : Le mtp doit �tre valide";
		this.mtp = mtp;
	}
	
	
	public static void main(String[] args) {
		Employe emp = new Employe();
		emp.setId("em201602kd");
	}
	
	public String getNomClasse(){
		return nomClasse;
	}
	
}
