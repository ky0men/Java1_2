package ss_08_RadioButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
	@FXML
	private Label titleOut;
	@FXML
	private RadioButton rButton1, rButton2, rButton3;
	
	public void chooseFood(ActionEvent event) {
		if(rButton1.isSelected()) {
			titleOut.setText(rButton1.getText());
		}else if(rButton2.isSelected()){
			titleOut.setText(rButton2.getText());
		}else if(rButton3.isSelected()){
			titleOut.setText(rButton3.getText());
		}
	}

}
