package finalProject;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EditController {
	
	
	
	public void adminPage(ActionEvent event) throws IOException {
		Parent newview = FXMLLoader.load(getClass().getResource("CompanyAdmin.fxml"));
		Scene tableViewScene = new Scene(newview);
		
		
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		
		window.setScene(tableViewScene);
		window.setTitle("Control Center Alpha");
		window.show();
	}
	
	

}
