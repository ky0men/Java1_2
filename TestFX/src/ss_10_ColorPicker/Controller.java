package ss_10_ColorPicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller {
	@FXML
	private Pane scenePane;
	@FXML
	private ColorPicker colorPicker;
	
	
	public void colorChange(ActionEvent event) {
		Color myColor = colorPicker.getValue();
		scenePane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
	}

}
