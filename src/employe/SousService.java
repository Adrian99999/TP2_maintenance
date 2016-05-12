package employe;

import utils.Validation;

public class SousService {
	private String idSousService;
	private String nomSousService;
	private Employe[] listeEmploye;
	private Validation validator;

	public SousService() {
		validator = new Validation();
	}

	public SousService(String idSousService) {
		validator = new Validation();
		this.setIdSousService(idSousService);
	}

	public String getIdSousService() {

		return idSousService;
	}

	public void setIdSousService(String idSousService) {

		boolean valide = validator.validerId(this.getNomClasse(), idSousService);
		assert(valide == true) : "Le id doit �tre valide";
		if (valide) {
			this.idSousService = idSousService;
		}
	}

	public String getNomClasse() {
		return this.getClass().getName();
	}

	public String getNomSousService() {
		return nomSousService;
	}

	public void setNomSousService(String nomSousService) {
		this.nomSousService = nomSousService;
	}

	public Employe[] getListeEmploye() {
		return listeEmploye;
	}

	public void setListeEmploye(Employe[] listeEmploye) {
		this.listeEmploye = listeEmploye;
	}

}
