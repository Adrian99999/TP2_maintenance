package employe;

import utils.ValiderId;

public class Service {
	private String idService;
	private String nomService;
	private SousService[] listeSousServices;

	public String getIdService() {
		return idService;
	}

	public void setIdService(String idService) {
		assert (ValiderId.validerId(this.getClass().getName(), idService)) : ValiderId.messageErreur;
		this.idService = idService;
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
