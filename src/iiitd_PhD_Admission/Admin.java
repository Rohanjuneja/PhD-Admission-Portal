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

public class Admin extends Application {
	Stage copy2;
	
	@Override
	public void start(Stage primaryStage) {
		try {
		copy2 = primaryStage;
		Parent root1 = FXMLLoader.load(getClass().getResource("admin.fxml"));
		Scene scene1 = new Scene(root1, 620, 560);
		Parent root2 = FXMLLoader.load(getClass().getResource("filtered_result.fxml"));
		Scene scene2 = new Scene(root2, 620, 560);
		primaryStage.setTitle("Filter Entries.fxml");
        primaryStage.setScene(scene1);
        primaryStage.show();
        AdminController.stage = primaryStage;
        FilterController.scene1 = scene1;
        FilterController.stage = primaryStage;
        
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
