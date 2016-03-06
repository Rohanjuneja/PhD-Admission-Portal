/**
 * 
 * @author 
 * 
 * akash aggarwal 2014008
 * rohan juneja 2014156
 *
 */

package iiitd_PhD_Admission;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class FilterController implements Initializable{
	public static Stage stage;
	public static Scene scene1;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<FilterEntries> filtercolumn;

    @FXML
    private Button back;
    
    @FXML
    TableColumn<FilterEntries,Integer> enrollmentCol;
    
    @FXML
    TableColumn<FilterEntries, String> nameCol;
    
    @FXML
    TableColumn<FilterEntries, String> linkCol;
    
    @FXML
    void actionButtonHandle(ActionEvent event) {
    		stage.setScene(scene1);
			stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	enrollmentCol = new TableColumn<FilterEntries,Integer>("Enrollment ID");
    	nameCol = new TableColumn<FilterEntries,String>("Name");
    	linkCol = new TableColumn<FilterEntries,String>("Link To Data");
    	enrollmentCol.setCellValueFactory(new PropertyValueFactory<FilterEntries,Integer>("amount"));
    	nameCol.setCellValueFactory(new PropertyValueFactory<FilterEntries,String>("category"));
    	linkCol.setCellFactory(new Callback<TableColumn<FilterEntries, String>, TableCell<FilterEntries,String>>() {
    	      @Override
    	      public TableCell<FilterEntries,String> call(TableColumn<FilterEntries,String> param) {
    	             final TableCell<FilterEntries,String> cell = new TableCell<FilterEntries,String>() {
    	                      @Override
    	                      public void updateItem(String value, boolean empty) {
    	                            super.updateItem(value, empty);

    	                            final VBox vbox = new VBox(5);
    	                            Button button = new Button("Link");
    	                            final TableCell<FilterEntries,String> c = this;
    	                            button.setOnAction(new EventHandler<ActionEvent>() {
    	                                  @Override
    	                                  public void handle(ActionEvent event) {
    	                                	  Desktop dt = Desktop.getDesktop();
    	                                          TableRow tableRow = c.getTableRow();
    	                                          FilterEntries item = (FilterEntries) tableRow.getTableView().getItems().get(tableRow.getIndex());
    	                                         File document = new File("src/enrollment.txt");
    	                                          try {
    	                                        	  dt.open(new File(document.getAbsolutePath()));
    	                                          }
    	                                          catch(IOException e) {
    	                                        	 e.printStackTrace();
    	                                          }
    	                                          
    	                                  }
    	                            });
    	                      vbox.getChildren().add(button);
    	                      setGraphic(vbox);
    	               }
    	        };
    	        //cell.setAlignment(Pos.TOP_RIGHT);
    	        return cell;
    	    }
    	});
		enrollmentCol.setMinWidth(206);
		nameCol.setMinWidth(206);
		linkCol.setMinWidth(206);
		filtercolumn.getItems().clear();
		filtercolumn.setItems(AdminController.dataTable);
		filtercolumn.getColumns().addAll(enrollmentCol,nameCol,linkCol);
        assert filtercolumn != null : "fx:id=\"filtercolumn\" was not injected: check your FXML file 'filtered_result.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'filtered_result.fxml'.";
    }
}
