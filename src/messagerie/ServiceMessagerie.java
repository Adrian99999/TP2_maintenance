package messagerie;

import java.util.ArrayList;


import capteur.Capteur;
import capteur.ControleurCapteur;
import employe.GestionEmploye;

public class ServiceMessagerie {
	
	private Message message;
	private InterfaceMessagerie obs = null;
	private ControleurCapteur controlCapteur = new ControleurCapteur();
	private GestionEmploye gestionEmp = new GestionEmploye();
	
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
				ArrayList<String> listeAbsent = (ArrayList<String>) infos.get(1);
				return new Absence(infosRecu[0], infosRecu[3], listeAbsent);
			case "message":
				break;
				
		}
		
		return null;
	}
	
	public void traiterMessage(String texteSaisie) {
		String[] converti = texteSaisie.split(" ");
		
		if(converti.length == 4) {
	
			switch(converti[2]) {
				case "VerfTemp":
					if(converti[0].startsWith("r")) {
					
						Capteur capteurDemande = controlCapteur.getCapteur(converti[3]);
						if(capteurDemande != null) {
							String temp = capteurDemande.getTemperature();
							ArrayList<Object> liste = new ArrayList<>();
							liste.add(converti);
							liste.add(temp);						
							message = this.getMSG("temperature", liste);
							obs.afficherMessage(message.creeMSG());
						}
						
					}
					break;
				case "VerfAbs":
					if(converti[0].startsWith("s")) {
						
						ArrayList<String> listeAbsence = gestionEmp.getListeAbsent();
						ArrayList<Object> liste = new ArrayList<>();
						liste.add(converti);
						liste.add(listeAbsence);						
						message = this.getMSG("absence", liste);
						obs.afficherMessage(message.creeMSG());
						
					}
					break;
			} 
				
		} else if(converti.length > 4){
			//if(validerUser(converti[0])) {
				if(converti[2].matches("\\d{10}"))
					obs.afficherMessage("Message envoyé");
			//}
		}
		
	}
	
	public boolean validerLogin(String nomUsager, String mtp) {

		 // return gestionEmp.validerNomUsager(nomUsager) && gestionEmp.validerMtp(mtp);
		return (nomUsager.startsWith("s") || nomUsager.startsWith("r") || nomUsager.startsWith("e"));
	}
	
	public void addObservateur(InterfaceMessagerie obs) {
		this.obs = obs;
	}
	
}
