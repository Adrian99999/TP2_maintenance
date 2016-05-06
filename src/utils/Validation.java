package utils;

import java.util.Calendar;

public class Validation {
	public static String messageErreur;

	public static boolean validerId(String className, String id) {
		String classeNom = className.split("\\.")[1];

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
		assert (valide == true) : "Erreur, le id doit �tre invalide" ;
		return valide;
	}
	
	public static boolean validerMtp(String mtp) {
		int nbLettre = 0;
		int nbspecialChar = 0;
		int nbChiffre = 0;
		int longueur = 0;
		
<<<<<<< HEAD
		if((mtp.length() > 0) && Character.isUpperCase(mtp.charAt(0))){
=======
		if((mtp.length()>0) && Character.isUpperCase(mtp.charAt(0))){
			assert (!Character.isUpperCase(mtp.charAt(0))) : "Le mot de passe n'est";
>>>>>>> refs/heads/pierre
			longueur = mtp.length();
			nbLettre = mtp.replaceAll("\\p{Punct}", "").replaceAll("\\d","").length();
			nbspecialChar = mtp.replaceAll("\\w", "").length();
			nbChiffre = mtp.replaceAll("\\D", "").length();
		}
		assert(((longueur >= 8 && longueur <= 15) && 
				(nbLettre >=2) && (nbspecialChar >=1) && 
				(nbChiffre >=2)) == true) : "Le mot de passe doit �tre valide";
		
		return ((longueur >= 8 && longueur <= 15) && (nbLettre >=2) && (nbspecialChar >=1) && (nbChiffre >=2));
	}
	
	public static void main(String[] args) {
		
		Validation.validerId("employe.Superviseur", "Su2016d8e9");
		Validation.validerMtp("A99!bn9899nfdnf");
		
	}
	
}
