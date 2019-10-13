package finalProject;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HomeController {
	/*
		Home for the Company server where an user/admin login into an account or choose to create one.
		user and admin will navigate to different scenes.
	*/
	
	@FXML
	TextField userField;
	@FXML
	TextField passField;
	
	@FXML
	Button createBtn;
	@FXML
	Button loginBtn;
	
	
	public void goToCreateAccount(ActionEvent event) throws IOException {
		Parent newview = FXMLLoader.load(getClass().getResource("CompanyNewAccount.fxml"));
		Scene tableViewScene = new Scene(newview);
		
		
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		
		window.setScene(tableViewScene);
		window.setTitle("Create Username for Computer Part Company");
		window.show();
		
		
	}
	public void goToLogin(ActionEvent event) throws IOException {
		Parent newview = FXMLLoader.load(getClass().getResource("CompanyNavigation.fxml"));
		Scene tableViewScene = new Scene(newview);
		
		
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		
		window.setScene(tableViewScene);
		window.setTitle("Navigation Page");
		window.show();
		
		
	}
	
}
