package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;

public class FXMLControlleur implements Initializable{

    @FXML
    private TextArea txtEnvoi;

    @FXML
    private Button btnEnvoyer;
    
    @FXML
    private VBox root;
    
    void verifierSiVide(){
    	if (txtEnvoi.getLength()!=0){
    		System.out.println("ca marche");
    	}
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnEnvoyer.setOnAction(event -> {
			verifierSiVide();
		  });
	}

}


