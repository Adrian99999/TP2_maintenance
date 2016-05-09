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
		}
		return null;
	}
	
	public void traiterMessage(String texteSaisie) {
		String[] converti = texteSaisie.split(" ");
		if(formatMsgValide(converti)) {
			String service =  converti[2].substring(0, 6);
			switch(service) {
				case "Se2016":
					if((gestionEmp.validerLogin("employe.ResponsableChaudiere",converti[0], converti[1])) && (converti[0].startsWith("R"))) {
						
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
				case "So2016":
					if((gestionEmp.validerLogin("employe.Superviseur",converti[0], converti[1])) && (converti[0].startsWith("S"))) {
						
						ArrayList<String> listeAbsence = gestionEmp.getListeAbsent();
						ArrayList<Object> liste = new ArrayList<>();
						liste.add(converti);
						liste.add(listeAbsence);						
						message = this.getMSG("absence", liste);
						obs.afficherMessage(message.creeMSG());
						
					}
					break;
				default: {
					if(gestionEmp.validerLogin("employe.Employe",converti[0], converti[1]))
						obs.afficherMessage("Message envoyé");
					break;
				}
			} 	
		} 
	}
	
	public boolean formatMsgValide(String[] messageSepare) {
		boolean formatValide = 
				(messageSepare.length == 4) || ((messageSepare.length >= 4) 
				&& messageSepare[2].matches("\\d{10}"));
		assert(formatValide == true) : "ServiceMessagerie : Le format doit être valide";
		return formatValide;
	}
	
	
	public void addObservateur(InterfaceMessagerie obs) {
		this.obs = obs;
	}
	
	public static void main(String[] args) {
		ServiceMessagerie ser = new ServiceMessagerie();
		ser.traiterMessage("Em20163333 C#333ccc 4185555555 fdf dfdf");
	}
	
}
