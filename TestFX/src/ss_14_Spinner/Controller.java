package ss_14_Spinner;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller implements Initializable {
	@FXML
	private Spinner<Integer> mySpinner;
	@FXML
	private Label outputLabel;
	int currentValue;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
		valueFactory.setValue(1);
		mySpinner.setValueFactory(valueFactory);
		currentValue = mySpinner.getValue();
		outputLabel.setText(Integer.toString(currentValue));

		// Update spinner to Label
		mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {

			@Override
			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
				currentValue = mySpinner.getValue();
				outputLabel.setText(Integer.toString(currentValue));

			}
		});

	}

}
