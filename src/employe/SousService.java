package employe;

import utils.Validation;

public class SousService {
	private String idSousService;
	private String nomSousService;
	private Employe[] listeEmploye;
	
	public SousService(String idSousService) {
		this.setIdSousService(idSousService);
	}

	public String getIdSousService() {
		return idSousService;
	}

	public void setIdSousService(String idSousService) {
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
