package messagerie;

import java.util.ArrayList;


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
		
		return "Absence pour la periode "
				+ ":" + periode + " :\n"+ absents+ " \nBonne Journ�e!";
	}
}
