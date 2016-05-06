package employe;

import utils.Validation;

public class SousService {
	private String idSousService;
	private String nomSousService;
	private Employe[] listeEmploye;

	public String getIdSousService() {
		return idSousService;
	}

	public void setIdSousService(String idSousService) {
		assert (Validation.validerId(this.getClass().getName(), idSousService)) : Validation.messageErreur;
		this.idSousService = idSousService;
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
