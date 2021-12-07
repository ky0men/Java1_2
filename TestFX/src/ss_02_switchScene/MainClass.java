package ss_02_switchScene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent rootParent = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			Scene scene = new Scene(rootParent);
			scene.getStylesheets().add(getClass().getResource("switchScene.css").toExternalForm());
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

}
