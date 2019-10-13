package finalProject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CompanyDriver extends Application {

	@Override
	public void start(Stage s) {
		
		
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("CompanyHome.fxml"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("die");
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		s.setTitle("Computer Part Company Login");
		s.setScene(scene);
		
		s.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
