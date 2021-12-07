package ss_07_TurnOnAndOffLight;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	@FXML
	private ImageView lightImage;
	@FXML
	private Label lightStatic;
	@FXML
	private CheckBox checkBoxLight;
	
	Image lightOn = new Image(getClass().getResourceAsStream("turned-on.png"));
	Image lightOff = new Image(getClass().getResourceAsStream("turned-off.png"));
	
	public void changeLight() {
		if(checkBoxLight.isSelected()) {
			lightImage.setImage(lightOn);
			lightStatic.setText("ON");
		}else {
			lightImage.setImage(lightOff);
			lightStatic.setText("OFF");
		}
	}

}
