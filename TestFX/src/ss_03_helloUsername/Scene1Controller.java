package ss_03_helloUsername;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {
	@FXML
	TextField inputText;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void login(ActionEvent event) throws IOException {
		String name = inputText.getText();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2Output.fxml"));
		root = loader.load();
		
		Scene2Controller sc2 = loader.getController();
		sc2.displayName(name);
		
		scene = new Scene(root);
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
}
