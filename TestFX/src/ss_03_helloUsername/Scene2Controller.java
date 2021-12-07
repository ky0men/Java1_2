package ss_03_helloUsername;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
	@FXML
	Label outputText;
	
	public void displayName(String name) {
		outputText.setText("Hello: " + name);
	}
}
