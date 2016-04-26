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
				return new Alerte(infosRecu[0], infosRecu[3], temp);
			case "absence":
				infosRecu = (String[]) infos.get(0);
				@SuppressWarnings("unchecked")
				ArrayList<String> liste = (ArrayList<String>) infos.get(1);
				return new Absence(infosRecu[0], infosRecu[3], liste);
			case "message":
				break;
				
		}
		
		return null;
	}
	
	public void validerMessage(String texteSaisie) {
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
						obs.afficherMessage(message.creeMSG());	
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
						obs.afficherMessage(message.creeMSG());
					}
					break;
			} 
				
		} else if(converti.length > 4){
			if(validerUser(converti[0])) {
				if(converti[2].matches("\\d{10}"))
					obs.afficherMessage("Message envoyé");
			}
		}
		
	}
	
	public boolean validerUser(String nomUser) {
		return (nomUser.startsWith("S") || nomUser.startsWith("R") || nomUser.startsWith("E"));
	}
	
	public void addObservateur(InterfaceMessagerie obs) {
		this.obs = obs;
	}
	
}
