/**
 * 
 * @author 
 * 
 * akash aggarwal 2014008
 * rohan juneja 2014156
 *
 */

package iiitd_PhD_Admission;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Applicant extends Application {
	static Stage copy1;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			copy1 = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("Applicant.fxml"));
		Scene scene = new Scene(root, 600, 620);
		primaryStage.setTitle("IIIT-Delhi PhD Admissions");
        primaryStage.setScene(scene);
        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
