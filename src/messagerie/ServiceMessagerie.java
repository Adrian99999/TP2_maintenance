package messagerie;

import java.util.ArrayList;


import capteur.Capteur;

public class ServiceMessagerie {
	
	private Message message;
	private InterfaceMessagerie obs = null;
	
	public Message getMSG(String typeMessage, ArrayList<Object> infos){
		
		String[] infosRecu = null;
		
		switch(typeMessage) {
			case "temperature":
				infosRecu = (String[]) infos.get(0);
				String temp = (String) infos.get(1);
				return new Alerte(infosRecu[0], infosRecu[1], infosRecu[2], infosRecu[3], temp);
		case "absence":
				infosRecu = (String[]) infos.get(0);
				ArrayList<String> liste = (ArrayList<String>) infos.get(1);
				return new Absence(infosRecu[0], infosRecu[1], null, infosRecu[3], liste);
			case "message":
				break;
				
		}
		
		return null;
	}
	
	public void validerFormat(String texteSaisie) {
		String[] converti = texteSaisie.split(" ");
		
		if(converti.length == 4) {
	
			switch(converti[2]) {
				case "VerfTemp":
					if(converti[0].startsWith("R")) {
						
						Capteur capteur = new Capteur();
						String temp = capteur.getTemperature();
						ArrayList<Object> liste = new ArrayList<>();
						liste.add(converti);
						liste.add(temp);						
						message = this.getMSG("temperature", liste);
						System.out.println(message.creeMSG());
						obs.afficherMessage();
						
					}
					break;
				case "VerfAbs":
					if(converti[0].startsWith("S")) {
						ArrayList<String> listeAbsence = new ArrayList<>();
						listeAbsence.add("E002");
						listeAbsence.add("E015");
						ArrayList<Object> liste = new ArrayList<>();
						liste.add(converti);
						liste.add(listeAbsence);						
						message = this.getMSG("absence", liste);
						System.out.println(message.creeMSG());
						obs.afficherMessage();
						
					}
				
					
					break;
				default:
					if (converti[2].matches("\\d{10}")) {
						System.out.println("msg");
					}
					break;
			}

		}
		
		
	}
	
	public void addObservateur(InterfaceMessagerie obs) {
		this.obs = obs;
	}
	
	public static void main(String[] args) {
		ServiceMessagerie ser = new ServiceMessagerie();
		ser.validerFormat("R001 11111 VerfTemp C123");
		ser.validerFormat("S001 11111 VerfAbs Jour");
		
	}
	
}
