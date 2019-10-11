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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NewAccountController implements Initializable {
	private String fName;
	private String lName;
	private String phoneNum;
	private String email;
	private String uName;
	private String pWord;
	private String job;
	private String jobs[] = { "Job1", "Job2", "Job3", "Job4", "Job5" };
	@FXML
	Text displayTxt;
	
	@FXML
	TextField fnField;
	@FXML
	TextField lnField;
	@FXML
	TextField phoneField;
	@FXML
	TextField emailField;
	@FXML
	TextField userField;
	@FXML
	PasswordField passField;

	@FXML
	ComboBox jobCombo;

	@FXML
	Button submitBtn;
	@FXML
	Button backBtn;

	//private ObservableList<String> list = FXCollections.observableArrayList("Job1", "job2", "job3", "job4", "job5");

	
	// create an account, should make sure if username doesnt exist already and all fields are filled correctly 
	public void createAccount(ActionEvent event) throws IOException{
		
		System.out.println("BUTTOn");
		
		if(fnField.getText().equals("")) {
			System.out.println("Enter a firstname");
		}
		fName = fnField.getText();
		lName = lnField.getText();
		phoneNum = phoneField.getText();
		email = emailField.getText();
		uName = userField.getText();
		pWord = passField.getText();
		job = (String) jobCombo.getValue();
		
		
		displayTxt.setText(fName+" "+lName+ " "+phoneNum+" "+email+" "+uName+" "+pWord+" "+job);
		
	}
	public void goHome(ActionEvent event) throws IOException {
		Parent newview = FXMLLoader.load(getClass().getResource("CompanyHome.fxml"));
		Scene tableViewScene = new Scene(newview);
		
		
		Stage window = (Stage)(((Node) event.getSource()).getScene().getWindow());
		
		window.setScene(tableViewScene);
		window.setTitle("CompanyName");
		window.show();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//jobCombo.setItems(list);


	}
	

}
