package employe;

import utils.Validation;

public class Service {
	private String idService;
	private String nomService;
	private SousService[] listeSousServices;
	private Validation validator;

	public Service() {
		validator = new Validation();
	}

	public Service(String idService) {
		validator = new Validation();
		this.setIdService(idService);
	}

	public String getIdService() {
		return idService;
	}

	public void setIdService(String idService) {
		boolean valide = validator.validerId(this.getNomClasse(), idService);
		// assert(valide == true) : "Le id doit �tre valide";
		if (valide) {
			this.idService = idService;
		}
	}

	public String getNomClasse() {
		return this.getClass().getName();
	}

	public String getNomService() {
		return nomService;
	}

	public void setNomService(String nomService) {
		this.nomService = nomService;
	}

	public SousService[] getListeSousServices() {
		return listeSousServices;
	}

	public void setListeSousServices(SousService[] listeSousServices) {
		this.listeSousServices = listeSousServices;
	}

}
