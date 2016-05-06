package messagerie;

public class Alerte implements Message{
	
	private String idResp;
	private String idChaudiere;
	private String temps;
	private final String DEGREE  = "\u00b0";
	
	public Alerte(String idResp, String idChaudiere, String temps) {
		this.idResp = idResp;
		this.idChaudiere = idChaudiere;
		this.temps = temps;
	}
	
	@Override
	public String creeMSG() {
		return "Température de la chaudière "+ idChaudiere +" : " + temps + DEGREE + ". \nBonne Journée!";
	}

}
