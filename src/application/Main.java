package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 VBox root= (VBox)FXMLLoader.load(getClass().getResource("/vue/interface.fxml"));
			Scene scene = new Scene(root,630,400);
			scene.getStylesheets().add(getClass().getResource("/vue/ressources/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Service Requête Réponse");
			primaryStage.setResizable(false);
			primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream( "/vue/ressources/sms.png" )));
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
