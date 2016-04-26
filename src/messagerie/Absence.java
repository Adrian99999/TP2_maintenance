package messagerie;

import java.util.ArrayList;

public class Absence implements Message{
	private String idSup;
	private String passwordSup;
	private String idService; 
	private String idSousService;
	private ArrayList<String> listeAbsent;
	
	public Absence(String idSup, String password, String idService, String idSubService, ArrayList<String> liste) {
		this.idSup = idSup;
		this.passwordSup = password;
		this.idService = idService;
		this.idSousService = idSubService;
		this.listeAbsent = liste;
	}
	
	@Override
	public String creeMSG() {
		String absents = "";
		
		for(int i = 0; i < listeAbsent.size(); i++) {
			absents += listeAbsent.get(i) + " ";
		}
		
		return "Superviseur "+ idSup +", voici les absents du service " +" : "+ absents+ ". Bonne Journée!";
	}
	@Override
	public void validerMSG() {
		// TODO Auto-generated method stub
		
	}
}
