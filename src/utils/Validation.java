package utils;

import java.util.Calendar;

public class Validation {
	public static String messageErreur;

	public static boolean validerId(String className, String id) {
		System.out.println(className);

		String classeNom = className.split("\\.")[1];
		System.out.println(classeNom);
		char[] arrayId = id.toCharArray();

		boolean valide = false;

		if (arrayId.length != 10) {
			messageErreur = "La longueur de l'id doit être de 10 caractères";
		} else {
			if (id.matches("^[A-Za-z]{2}+[0-9]{4}+[A-Za-z0-9]{4}")) {
				char[] arrayClassName = classeNom.toCharArray();
				if (arrayClassName[0] == arrayId[0] && arrayClassName[1] == arrayId[1]) {
					String anneeString = id.substring(2, 6);
					int annee = Integer.parseInt(anneeString);
					int year = Calendar.getInstance().get(Calendar.YEAR);
					if (annee == year) {
						messageErreur = "Id valide";
						valide = true;
					} else {
						messageErreur = "L'année n'est pas valide";
					}
				} else {
					messageErreur = "Les deux premiers caractères de l'id ne sont pas les premières lettres du nom de la classe";
				}
			} else {
				messageErreur = "Le format de l'id n'est pas valide";
			}
		}
		
		return valide;
	}
	
	public static boolean validerMtp(String mtp) {
		int nbLettre = 0;
		int nbspecialChar = 0;
		int nbChiffre = 0;
		int longueur = 0;
		
		if((mtp.length()>0) && Character.isUpperCase(mtp.charAt(0))){
			assert (!Character.isUpperCase(mtp.charAt(0))) : "Le mot de passe n'est";
			longueur = mtp.length();
			nbLettre = mtp.replaceAll("\\p{Punct}", "").replaceAll("\\d","").length();
			nbspecialChar = mtp.replaceAll("\\w", "").length();
			nbChiffre = mtp.replaceAll("\\D", "").length();
		}
		//System.out.println(nbLettre + " " + nbspecialChar + " " + nbChiffre);
		return ((longueur >= 8 && longueur <= 15) && (nbLettre >=2) && (nbspecialChar >=1) && (nbChiffre >=2));
	}
	
	public static void main(String[] args) {
		
		boolean valide = Validation.validerId("jkjhhj.Superviseur", "Su2016d8e9");
		//assert (valide == false) : "Erreur" ;
		assert (valide == true) : "Erreur" ;
	}

}
