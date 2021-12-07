package ss_09_DatePicker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {
	@FXML
	private DatePicker datePickerSS;
	@FXML
	private Label outputDay;
	
	public void getDate(ActionEvent event) {
		LocalDate myDate = datePickerSS.getValue();
		String myFormatDate = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
		outputDay.setText(myFormatDate);
	}

}
