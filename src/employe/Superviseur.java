package employe;

public class Superviseur extends Employe {
	
	public Superviseur(String id, String prenom, String nom, String mtp) {
		super(id, prenom, nom, mtp);
	}
	
	@Override
	public String getNomClasse() {
		return "Employe.Superviseur"; 
	}
	
}
