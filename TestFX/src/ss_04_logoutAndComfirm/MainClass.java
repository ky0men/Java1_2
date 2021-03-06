package ss_04_logoutAndComfirm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("LogoutScene.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		stage.setOnCloseRequest(event ->{
			event.consume();
			logout(stage);
		});
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	public void logout(Stage stage) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You're about logout!");
		alert.setContentText("Do you want to save before exiting?");

		if (alert.showAndWait().get() == ButtonType.OK) {
			System.out.println("You successfully logged out!");
			stage.close();
		}

	}

}
