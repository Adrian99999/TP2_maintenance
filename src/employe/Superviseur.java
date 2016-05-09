package employe;

public class Superviseur extends Employe {
<<<<<<< HEAD
	private String idSuperviseur;

	public Superviseur() {

	}

=======
	
>>>>>>> refs/remotes/origin/dyden
	public Superviseur(String id, String prenom, String nom, String mtp) {
<<<<<<< HEAD
		super(prenom, nom, mtp);
		this.setId(id);
	}

	public String getIdSuperviseur() {
		return idSuperviseur;
	}

	@Override
	public void setId(String id) {
		Validation validateur = new Validation();
		boolean valide = validateur.validerId(this.getNomClasse(), id);
		if (valide) {
			this.idSuperviseur = id;
		}
=======
		super(id, prenom, nom, mtp);
>>>>>>> refs/remotes/origin/dyden
	}

	@Override
	public String getNomClasse() {
		return "Employe.Superviseur";
	}
<<<<<<< HEAD

	private void consulterAbsents() {

	}
=======
	
>>>>>>> refs/remotes/origin/dyden
}
