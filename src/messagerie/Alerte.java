package messagerie;

public class Alerte implements Message{
	
	private String idResp;
	private String passwordResp;
	private String idService;
	private String idChaudiere;
	private String temps;
	
	public Alerte(String idResp, String password, String idService, String idChaudiere, String temps) {
		this.idResp = idResp;
		this.passwordResp = password;
		this.idService = idService;
		this.idChaudiere = idChaudiere;
		this.temps = temps;
	}
	
	@Override
	public String creeMSG() {
		return "Employé " + idResp +", la température de la chaudière identifié par le numéro "+ idChaudiere +" est de " + temps + "U+00B0 .Bonne Journée!";
		
	}
	@Override
	public void validerMSG() {
		// TODO Auto-generated method stub
		
	}
	
}
