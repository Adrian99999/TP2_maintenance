package application;

import java.net.URL;
import java.util.ResourceBundle;

import capteur.Capteur;
import capteur.ControleurCapteur;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import messagerie.InterfaceMessagerie;
import messagerie.ServiceMessagerie;

public class FXMLControlleur implements Initializable, InterfaceMessagerie{

	@FXML
    private TextField txtEnvoi;

    @FXML
    private Button btnEnvoyer;
    
    @FXML
    private VBox root;
    
    @FXML
    private TextArea txtRecu;
    
    private ServiceMessagerie serviceMessage = new ServiceMessagerie();
  
    void verifierSiVide(){
    	txtRecu.setText("");
    	if (txtEnvoi.getLength()!=0){
    		serviceMessage.traiterMessage(txtEnvoi.getText());
    	}
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		serviceMessage.addObservateur(this);
		btnEnvoyer.setOnAction(event -> {
			verifierSiVide();
		  });
	}

	@Override
	public void afficherMessage(String message) {
		txtRecu.setText(message);
		
	}
}