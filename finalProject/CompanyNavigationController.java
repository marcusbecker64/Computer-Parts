package finalProject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class CompanyNavigationController implements Initializable {
	
	@FXML
	ComboBox browseCB;
	
	//@FXML
	//RadioButton adminCB;
	
	private ObservableList<String> list = FXCollections.observableArrayList("All", "HDD", "SSD", "CPU", "Fans","Power");

	
	public void logout(ActionEvent event) throws IOException {
		Parent newview = FXMLLoader.load(getClass().getResource("CompanyHome.fxml"));
		Scene tableViewScene = new Scene(newview);
		
		
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		
		window.setScene(tableViewScene);
		window.setTitle("CompanyName");
		window.show();
	}
	
	public void adminPage(ActionEvent event) throws IOException {
		Parent newview = FXMLLoader.load(getClass().getResource("CompanyAdmin.fxml"));
		Scene tableViewScene = new Scene(newview);
		
		
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		
		window.setScene(tableViewScene);
		window.setTitle("Control Center Alpha");
		window.show();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		browseCB.setItems(list);
	}


}
