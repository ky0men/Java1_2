package ss_06_ValidateAgeInputForm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private Label outputLabel;
	@FXML
	private TextField inputAgeField;
	@FXML
	private Button submitBtn;
	int age;
	
	public void submit(ActionEvent event) {
		try {
			age = Integer.parseInt(inputAgeField.getText());
//			System.out.println(age);
			if(age >= 18) {
				outputLabel.setText("You are logged!");
			}else {
				outputLabel.setText("You must 18+");
			}
		} catch (NumberFormatException e) {
//			System.out.println("Only allow a number!");
			outputLabel.setText("Only allow a number!");
		}catch (Exception e) {
//			System.out.println("ERROR");
			outputLabel.setText("ERROR");
		}
		
	}
}
