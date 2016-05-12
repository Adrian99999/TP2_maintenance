package employe;

import utils.Validation;

public class Employe {
	private String id;
	private String prenom;
	private String nom;
	private String mtp;
	private Validation validator;

	public Employe() {
		validator = new Validation();
	}
	
	public Employe(String id, String prenom, String nom, String mtp) {
		validator = new Validation();
		this.prenom = prenom;
		this.nom = nom;
		setId(id);
		setMtp(mtp);
	}
		
	public Employe(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		boolean valide = validator.validerId(this.getNomClasse(), id); 
		assert(valide == true) : "Le id doit être valide";
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
		boolean mtpValide = validator.validerMtp(mtp);
		assert(mtpValide == true) : "Employe : Le mtp doit être valide";
		if(mtpValide){
			this.mtp = mtp;
		}
	}

	public static void main(String[] args) {
		Employe emp = new Employe();
		emp.setId("em201602kd");
	}
	
	public String getNomClasse(){
		return "employe.Employe";
	}
	
	
	
}
