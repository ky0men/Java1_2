package ss_12_Slider;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller implements Initializable {
	@FXML
	private Label outputLabel;
	@FXML
	private Slider sliderTemperature;

	int temperature;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		temperature = (int) sliderTemperature.getValue();
		outputLabel.setText(Integer.toString(temperature) + "°C");

		sliderTemperature.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				temperature = (int) sliderTemperature.getValue();
				outputLabel.setText(Integer.toString(temperature) + "°C");

			}

		});

	}
}
