package employe;

import utils.Validation;

public class ResponsableChaudiere extends Employe {
	private String idResponsableChaudiere;
	
	public ResponsableChaudiere(String id, String prenom, String nom, String mtp) {
		super(prenom, nom, mtp);
		this.setId(id);
	}
	
	@Override 
	public void setId(String id) {
		Validation validateur = new Validation();
		boolean valide = validateur.validerId(this.getNomClasse(), id); 
		if(valide) {
			this.idResponsableChaudiere = id;
		}
	}
	
	public String getIdResponsableChaudiere() {
		return idResponsableChaudiere;
	}

	@Override
	public String getNomClasse() {
		return "Employe.ResponsableChaudiere"; 
	}
	
	private void consulterTm() {

	}

	private void recevoirAlert() {

	}
}
