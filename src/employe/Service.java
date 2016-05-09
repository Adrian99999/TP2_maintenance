package employe;

public class Service {
	private String idService;
	private String nomService;
	private SousService[] listeSousServices;

	public Service() {
	}

	public Service(String idService) {
		this.setIdService(idService);
	}

	public String getIdService() {
		return idService;
	}

	public void setIdService(String idService) {
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
