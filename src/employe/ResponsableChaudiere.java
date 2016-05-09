package employe;

public class ResponsableChaudiere extends Employe {
	
	public ResponsableChaudiere() {}

	public ResponsableChaudiere(String id, String prenom, String nom, String mtp) {
		super(id, prenom, nom, mtp);
	}
	
	@Override
	public String getNomClasse() {
		return "Employe.ResponsableChaudiere"; 
	}	
}