package ss_11_ChoiseBox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller implements Initializable{
	
	@FXML
	private ChoiceBox<String> myChoiceBox;
	@FXML
	private Label labelChoice;
	private String food[] = {"Pizza", "Sushi", "Ramen", "Noodle"};
	
	public void changeChoice(ActionEvent event) {
		String myFood = myChoiceBox.getValue();
		labelChoice.setText(myFood);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myChoiceBox.getItems().addAll(food);
		myChoiceBox.setOnAction(this::changeChoice);
	}
}
