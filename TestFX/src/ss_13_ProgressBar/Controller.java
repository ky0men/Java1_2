package ss_13_ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller implements Initializable {
	@FXML
	private Label outputLabel;
	@FXML
	private ProgressBar myProgressBar;
	@FXML
	private Button startBtn;

	BigDecimal percent = new BigDecimal(String.format("%.2f", 0.0));

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public void startProgress(ActionEvent event) {
		if (percent.doubleValue() < 1) {
			percent = new BigDecimal(String.format("%.2f", percent.doubleValue() + 0.1));
			myProgressBar.setProgress(percent.doubleValue());
			outputLabel.setText(Integer.toString((int)(percent.doubleValue() * 100)) + "%");

		}
	}

}
