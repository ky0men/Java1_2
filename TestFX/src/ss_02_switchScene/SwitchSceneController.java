package ss_02_switchScene;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SwitchSceneController {
	private Stage stage;
	private Scene scene;
	private Parent rootParent;

	public void switchToScene1(ActionEvent event) throws IOException {
		rootParent = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//		scene.getStylesheets().add(getClass().getResource("switchScene.css").toExternalForm());
		scene = new Scene(rootParent);
		stage.setScene(scene);
		stage.show();
	}

	public void switchToScene2(ActionEvent event) throws IOException {
		rootParent = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
//		scene.getStylesheets().add(getClass().getResource("switchScene.css").toExternalForm());
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(rootParent);
		stage.setScene(scene);
		stage.show();
	}
}
