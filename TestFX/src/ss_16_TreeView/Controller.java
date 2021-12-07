package ss_16_TreeView;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class Controller implements Initializable {
	@FXML
	private TreeView<String> treeView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> root = new TreeItem<String>("Files");
		TreeItem<String> branchItem1 = new TreeItem<String>("Pictures");
		TreeItem<String> branchItem2 = new TreeItem<String>("Videos");
		TreeItem<String> branchItem3 = new TreeItem<String>("Music");

		root.getChildren().addAll(branchItem1, branchItem2, branchItem3);
		TreeItem<String> leafItem1 = new TreeItem<String>("Picture 1");
		TreeItem<String> leafItem2 = new TreeItem<String>("Picture 2");
		TreeItem<String> leafItem3 = new TreeItem<String>("Video 1");
		TreeItem<String> leafItem4 = new TreeItem<String>("Video 2");
		TreeItem<String> leafItem5 = new TreeItem<String>("Music 1");
		TreeItem<String> leafItem6 = new TreeItem<String>("Music 2");

		branchItem1.getChildren().addAll(leafItem1, leafItem2);
		branchItem2.getChildren().addAll(leafItem3, leafItem4);
		branchItem3.getChildren().addAll(leafItem5, leafItem6);

		treeView.setRoot(root);
	}

	public void selectItem() {
		TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
		if (item != null) {
			System.out.println(item.getValue());
		}
	}

}
