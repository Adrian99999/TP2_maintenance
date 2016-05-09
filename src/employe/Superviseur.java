package employe;

import utils.Validation;

public class Superviseur extends Employe {
	private String idSuperviseur;
	
	public Superviseur(String id, String prenom, String nom, String mtp) {
		super(prenom, nom, mtp);
		this.setId(id);
	}
	
	public String getIdSuperviseur() {
		return idSuperviseur;
	}

	@Override 
	public void setId(String id) {
		Validation validateur = new Validation();
		boolean valide = validateur.validerId(this.getNomClasse(), id); 
		if(valide) {
			this.idSuperviseur = id;
		}
	}
	
	@Override
	public String getNomClasse() {
		return "Employe.Superviseur"; 
	}
	
	private void consulterAbsents() {

	}
}
