package employe;

import java.util.ArrayList;
import java.util.HashMap;

import utils.Validation;

public class GestionEmploye {
	
	private ArrayList<String> listeAbsent = new ArrayList<String> ();
	private HashMap<String, Employe> listeEmploye = new HashMap<String, Employe>();
	
	public GestionEmploye() {
		this.genererAbsence();
		this.genererListeEmploye();
	}
	
	private void genererAbsence() {
		Employe employe1 = new Employe("Em20161111", "Bob", "Langlois", "A!111aaa");
		Employe employe2 = new Employe("Em20162222", "Tony", "Bobo", "B!222bbb");
		listeAbsent.add(employe1.getPrenom() + " " + employe1.getNom());
		listeAbsent.add(employe2.getPrenom() + " " + employe2.getNom());
	}
	
	private void genererListeEmploye() {
		ResponsableChaudiere resp = new ResponsableChaudiere("Re20161111", "John", "Leclair", "R#111aaa");
		Superviseur sup = new Superviseur("Su20162222", "Hugo", "Lajoie", "S%222bbb");
		Employe emp = new Employe("Em20163333", "Tom", "Pom", "C#333ccc");
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
	
	public boolean validerLogin(String idUsager, String mtp) {
		boolean loginValide = false;	
		
		if(listeEmploye.get(idUsager) != null) {
			loginValide = mtp.equals(listeEmploye.get(idUsager).getMtp());
		}
		return loginValide;
	}
		
}
