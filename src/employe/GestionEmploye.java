package employe;

import java.util.ArrayList;
import java.util.HashMap;

import utils.Validation;

public class GestionEmploye {
	
	private ArrayList<String> listeAbsent = new ArrayList<String> ();
	private HashMap<String, Employe> listeEmploye = new HashMap<String, Employe>();
	private HashMap<String, Service> listeService = new HashMap<String, Service>();

	public GestionEmploye() {
		this.genererAbsence();
		this.genererListeEmploye();
		this.genererService();
	}
	
	private void genererService() {
		Service service1 = new Service("Se2016Temp");
		Service service2 = new Service("Se2016Absc");
		SousService sousService1 = new SousService("So2016jour");
		SousService sousService2 = new SousService("So2016soir");
		SousService[] listeSousServices = new SousService[2];
		listeSousServices[0] = sousService1;
		listeSousServices[1] = sousService2;
		service2.setListeSousServices(listeSousServices);
		listeService.put(service1.getIdService(), service1);
		listeService.put(service2.getIdService(), service2);
	}
	
	private void genererAbsence() {
		Employe employe1 = new Employe("Em2016aaaa", "Bob", "Langlois", "A!111aaa");
		Employe employe2 = new Employe("Em2016bbbb", "Tony", "Bobo", "B!222bbb");
		listeAbsent.add(employe1.getPrenom() + " " + employe1.getNom());
		listeAbsent.add(employe2.getPrenom() + " " + employe2.getNom());
	}
	
	private void genererListeEmploye() {
		ResponsableChaudiere resp = new ResponsableChaudiere("Re2016cccc", "John", "Leclair", "R#111aaa");
		Superviseur sup = new Superviseur("Su2016dddd", "Hugo", "Lajoie", "S%222bbb");
		Employe emp = new Employe("Em2016eeee", "Tom", "Pom", "C#333ccc");
		listeEmploye.put(resp.getId(), resp);
		listeEmploye.put(sup.getId(), sup);
		listeEmploye.put(emp.getId(), emp);
	}

	public ArrayList<String> getListeAbsent() {
		return listeAbsent;
	}

	public HashMap<String, Employe> getListeEmploye() {
		return listeEmploye;
	}
	
	public boolean validerLogin(String nomClasse, String idUsager, String mtp) {
		Validation validateur = new Validation();
		boolean loginValide = false;	
		boolean idValide = validateur.validerId(nomClasse, idUsager);
		boolean mtpValide = validateur.validerMtp(mtp);
	
		//assert(idValide == true) : "GestionEmploye: L'id doit être valide";
		//assert(mtpValide == true) : "GestionEmploye: Le mtp doit être valide";
		
		if(idValide && mtpValide) {
			if(listeEmploye.get(idUsager) != null) {
				loginValide = mtp.equals(listeEmploye.get(idUsager).getMtp());
			}
		}
		return loginValide;
	}	
	
	public HashMap<String, Service> getListeService() {
		return listeService;
	}

	public static void main(String[] args) {
		GestionEmploye gestEmp = new GestionEmploye();
		gestEmp.validerLogin("employe.Superviseur", "Su20161234", "A!12nb12mn");		
	}
		
}
