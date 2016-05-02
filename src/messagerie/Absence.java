package messagerie;

import java.util.ArrayList;

import employe.Employe;

public class Absence implements Message{
	private String idSup;
	private String periode;
	private ArrayList<String> listeAbsent;
	
	public Absence(String idSup, String periode, ArrayList<String> liste) {
		this.idSup = idSup;
		this.periode = periode;
		this.listeAbsent = liste;
	}
	
	@Override
	public String creeMSG() {
		String absents = "";
		
		for(int i = 0; i < listeAbsent.size(); i++) {
			absents += listeAbsent.get(i) + "\n";
		}
		
		return "Absence de la periode "
				+ "." + periode + " :\n"+ absents+ " \nBonne Journée!";
	}
}
