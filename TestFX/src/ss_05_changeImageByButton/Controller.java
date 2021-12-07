package ss_05_changeImageByButton;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	@FXML
	ImageView myImageView;
	Button myBtn;
	Image image2 = new Image(getClass().getResourceAsStream("image2.jpeg"));
	
	public void displayImage2() {
		myImageView.setImage(image2);
	}
}
