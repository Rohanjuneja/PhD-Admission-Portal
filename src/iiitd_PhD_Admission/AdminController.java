/**
 * 
 * @author 
 * 
 * akash aggarwal 2014008
 * rohan juneja 2014156
 *
 */

package iiitd_PhD_Admission;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AdminController implements Initializable{
	public static ObservableList<FilterEntries> dataTable = FXCollections.observableArrayList();
	public static Stage stage;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> grad2;

    @FXML
    private ComboBox<String> post2;

    @FXML
    private TextField class12per2;

    @FXML
    private CheckBox equals5;

    @FXML
    private TextField email1;

    @FXML
    private CheckBox equals4;

    @FXML
    private CheckBox equals3;

    @FXML
    private CheckBox equals2;

    @FXML
    private CheckBox equals1;

    @FXML
    private DatePicker datefrom3;

    @FXML
    private CheckBox less2;

    @FXML
    private TextField gradper2;

    @FXML
    private Button Back;

    @FXML
    private CheckBox less1;

    @FXML
    private CheckBox less4;

    @FXML
    private CheckBox less3;

    @FXML
    private CheckBox less5;

    @FXML
    private Button result3;

    @FXML
    private TextField gate2;

    @FXML
    private ComboBox<String> deptgrad2;

    @FXML
    private ComboBox<String> category1;

    @FXML
    private ToggleGroup gender1;

    @FXML
    private TextField class10per2;

    @FXML
    private DatePicker date1;

    @FXML
    private ComboBox<String> stategrad2;
    
    @FXML
    private ComboBox<String> statepost2;

    @FXML
    private TextField univgrad2;

    @FXML
    private TextField enrollment1;

    @FXML
    private ToggleGroup phydis1;

    @FXML
    private DatePicker dateupto3;

    @FXML
    private ComboBox<String> deptpost2;

    @FXML
    private CheckBox greater1;

    @FXML
    private ComboBox<String> phd2;

    @FXML
    private ToggleGroup dob1;

    @FXML
    private ComboBox<String> class122;

    @FXML
    private TextField univpost2;

    @FXML
    private CheckBox greater4;

    @FXML
    private TextField name1;

    @FXML
    private CheckBox greater5;

    @FXML
    private ComboBox<String> class102;

    @FXML
    private CheckBox greater2;

    @FXML
    private TextField postper2;

    @FXML
    private CheckBox greater3;
    
    @FXML
    private RadioButton male1, female1, phyyes1, phyno1, dobbefore1, dobon1, dobafter1;
    
    @FXML
    void filterresultsaction(ActionEvent event) {
		ObjectInputStream objin = null;
  	  	try {
  	  		FileInputStream fin = new FileInputStream("./src/applicant.dat");
  	  		dataTable.clear();
  	  		while(true) {
  	  			objin = new ObjectInputStream(fin);
  	  			applicantDetails apdt = (applicantDetails) objin.readObject();
  	  			if(email1.getText().equals("") || email1.getText().equals(apdt.email))
  	  			if(name1.getText().equals("") || name1.getText().equals(apdt.name))
  	  			if(category1.getValue() == null || category1.getValue().toString().equals(apdt.category1))
  	  			if(enrollment1.getText().equals("") || enrollment1.getText().equals(apdt.enrollmentid))
  	  			if(gender1.getSelectedToggle() == null || gender1.getSelectedToggle().getUserData().toString().equals(apdt.gender1))
  	  			if(phydis1.getSelectedToggle() == null || phydis1.getSelectedToggle().getUserData().toString().equals(apdt.phydis1))
  	  			if(date1.getValue() == null || ((dob1.getSelectedToggle() == null || dob1.getSelectedToggle().toString().contains("dobon1")) && date1.getValue().equals(apdt.dateOfBirth)) || (dob1.getSelectedToggle().toString().contains("dobbefore1") && (date1.getValue().compareTo(apdt.dateOfBirth) > 0) )  || (dob1.getSelectedToggle().toString().contains("dobafter1") && (date1.getValue().compareTo(apdt.dateOfBirth) < 0))) 
  	  			if(phd2.getValue() == null || phd2.getValue().toString().equals(apdt.phdstream))
  	  			if(grad2.getValue() == null || grad2.getValue().toString().equals(apdt.degree))
  	  			if(post2.getValue() == null || post2.getValue().toString().equals(apdt.degree22))
  	  			if(class102.getValue() == null || class102.getValue().toString().equals(apdt.XthBoard))
  	  			if(class122.getValue() == null || class122.getValue().toString().equals(apdt.XIIthBoard))
  	  			if(deptgrad2.getValue() == null || deptgrad2.getValue().toString().equals(apdt.department))
  	  			if(deptpost2.getValue() == null || deptpost2.getValue().toString().equals(apdt.dept22))
  	  			if(univgrad2.getText().equals("") || univgrad2.getText().equals(apdt.universityName))
  	  			if(univpost2.getText().equals("") || univpost2.getText().equals(apdt.nameofcolege22))
  	  			if(stategrad2.getValue() == null || stategrad2.getValue().toString().equals(apdt.state))
  	  			if(statepost2.getValue() == null || statepost2.getValue().toString().equals(apdt.nameofstate22))
  	  			if(class10per2.getText().equals("") || (greater1.isSelected() == false && less1.isSelected() == false && Integer.parseInt(class10per2.getText().toString()) == apdt.XthMarks) || (greater1.isSelected() == true && less1.isSelected() == true && equals1.isSelected() == true) || (greater1.isSelected() == true && less1.isSelected() == true && equals1.isSelected() == false && Integer.parseInt(class10per2.getText().toString()) != apdt.XthMarks) || (greater1.isSelected() == true && less1.isSelected() == false && equals1.isSelected() == true && Integer.parseInt(class10per2.getText().toString()) <= apdt.XthMarks) || (greater1.isSelected() == false && less1.isSelected() == true && equals1.isSelected() == true && Integer.parseInt(class10per2.getText().toString()) >= apdt.XthMarks) || (greater1.isSelected() == true && less1.isSelected() == false && equals1.isSelected() == false && Integer.parseInt(class10per2.getText().toString()) < apdt.XthMarks) || (greater1.isSelected() == false && less1.isSelected() == true && equals1.isSelected() == false && Integer.parseInt(class10per2.getText().toString()) > apdt.XthMarks))
  	  			if(class12per2.getText().equals("") || (greater2.isSelected() == false && less2.isSelected() == false && Integer.parseInt(class12per2.getText().toString()) == apdt.XIIthMarks) || (greater2.isSelected() == true && less2.isSelected() == true && equals2.isSelected() == true) || (greater2.isSelected() == true && less2.isSelected() == true && equals2.isSelected() == false && Integer.parseInt(class12per2.getText().toString()) != apdt.XIIthMarks) || (greater2.isSelected() == true && less2.isSelected() == false && equals2.isSelected() == true && Integer.parseInt(class12per2.getText().toString()) <= apdt.XIIthMarks) || (greater2.isSelected() == false && less2.isSelected() == true && equals2.isSelected() == true && Integer.parseInt(class12per2.getText().toString()) >= apdt.XIIthMarks) || (greater2.isSelected() == true && less2.isSelected() == false && equals2.isSelected() == false && Integer.parseInt(class12per2.getText().toString()) < apdt.XIIthMarks) || (greater2.isSelected() == false && less2.isSelected() == true && equals2.isSelected() == false && Integer.parseInt(class12per2.getText().toString()) > apdt.XIIthMarks))
  	  			if(gradper2.getText().equals("") || (greater3.isSelected() == false && less3.isSelected() == false && Integer.parseInt(gradper2.getText().toString()) == apdt.gotMarks) || (greater3.isSelected() == true && less3.isSelected() == true && equals3.isSelected() == true) || (greater3.isSelected() == true && less3.isSelected() == true && equals3.isSelected() == false && Integer.parseInt(gradper2.getText().toString()) != apdt.gotMarks) || (greater3.isSelected() == true && less3.isSelected() == false && equals3.isSelected() == true && Integer.parseInt(gradper2.getText().toString()) <= apdt.gotMarks) || (greater3.isSelected() == false && less3.isSelected() == true && equals3.isSelected() == true && Integer.parseInt(gradper2.getText().toString()) >= apdt.gotMarks) || (greater3.isSelected() == true && less3.isSelected() == false && equals3.isSelected() == false && Integer.parseInt(gradper2.getText().toString()) < apdt.gotMarks) || (greater3.isSelected() == false && less3.isSelected() == true && equals3.isSelected() == false && Integer.parseInt(gradper2.getText().toString()) > apdt.gotMarks))
  	  			if(postper2.getText().equals("") || (greater4.isSelected() == false && less4.isSelected() == false && Integer.parseInt(postper2.getText().toString()) == apdt.marks22) || (greater4.isSelected() == true && less4.isSelected() == true && equals4.isSelected() == true) || (greater4.isSelected() == true && less4.isSelected() == true && equals4.isSelected() == false && Integer.parseInt(postper2.getText().toString()) != apdt.marks22) || (greater4.isSelected() == true && less4.isSelected() == false && equals4.isSelected() == true && Integer.parseInt(postper2.getText().toString()) <= apdt.marks22) || (greater4.isSelected() == false && less4.isSelected() == true && equals4.isSelected() == true && Integer.parseInt(postper2.getText().toString()) >= apdt.marks22) || (greater4.isSelected() == true && less4.isSelected() == false && equals4.isSelected() == false && Integer.parseInt(postper2.getText().toString()) < apdt.marks22) || (greater4.isSelected() == false && less4.isSelected() == true && equals4.isSelected() == false && Integer.parseInt(postper2.getText().toString()) > apdt.marks22))
  	  			if(gate2.getText().equals("") || (greater5.isSelected() == false && less5.isSelected() == false && Integer.parseInt(gate2.getText().toString()) == apdt.score24) || (greater5.isSelected() == true && less5.isSelected() == true && equals5.isSelected() == true) || (greater5.isSelected() == true && less5.isSelected() == true && equals5.isSelected() == false && Integer.parseInt(gate2.getText().toString()) != apdt.score24) || (greater5.isSelected() == true && less5.isSelected() == false && equals5.isSelected() == true && Integer.parseInt(gate2.getText().toString()) <= apdt.score24) || (greater5.isSelected() == false && less5.isSelected() == true && equals5.isSelected() == true && Integer.parseInt(gate2.getText().toString()) >= apdt.score24) || (greater5.isSelected() == true && less5.isSelected() == false && equals5.isSelected() == false && Integer.parseInt(gate2.getText().toString()) < apdt.score24) || (greater5.isSelected() == false && less5.isSelected() == true && equals5.isSelected() == false && Integer.parseInt(gate2.getText().toString()) > apdt.score24)) 
  	  			if((datefrom3.getValue() == null && dateupto3.getValue() == null) || (datefrom3.getValue() == null && dateupto3.getValue().compareTo(apdt.timeStamp) >= 0) || (datefrom3.getValue().compareTo(apdt.timeStamp) <= 0 && dateupto3.getValue() == null) || (datefrom3.getValue().compareTo(apdt.timeStamp) <= 0 && dateupto3.getValue().compareTo(apdt.timeStamp) >= 0)) {
  	  				FilterEntries entry = new FilterEntries(apdt.enrollmentid, apdt.name, apdt.CV);
  	  				dataTable.add(entry);
  	  			}
  	  		}
  	  	} catch (Exception e) {
		} finally {
			try {
				objin.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}
  	  	try {
  	  		Parent root = FXMLLoader.load(getClass().getResource("filtered_result.fxml"));
  	  		Scene scene = new Scene(root, 620, 560);
  	  		stage.setScene(scene);
  	  		stage.show();
  	  	} catch(Exception e) {
  	  		e.printStackTrace();
  	  	}
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {	
		assert grad2 != null : "fx:id=\"grad2\" was not injected: check your FXML file 'View1.fxml'.";
        assert post2 != null : "fx:id=\"post2\" was not injected: check your FXML file 'View1.fxml'.";
        assert class12per2 != null : "fx:id=\"class12per2\" was not injected: check your FXML file 'View1.fxml'.";
        assert equals5 != null : "fx:id=\"equals5\" was not injected: check your FXML file 'View1.fxml'.";
        assert email1 != null : "fx:id=\"email1\" was not injected: check your FXML file 'View1.fxml'.";
        assert equals4 != null : "fx:id=\"equals4\" was not injected: check your FXML file 'View1.fxml'.";
        assert equals3 != null : "fx:id=\"equals3\" was not injected: check your FXML file 'View1.fxml'.";
        assert equals2 != null : "fx:id=\"equals2\" was not injected: check your FXML file 'View1.fxml'.";
        assert equals1 != null : "fx:id=\"equals1\" was not injected: check your FXML file 'View1.fxml'.";
        assert datefrom3 != null : "fx:id=\"datefrom3\" was not injected: check your FXML file 'View1.fxml'.";
        assert less2 != null : "fx:id=\"less2\" was not injected: check your FXML file 'View1.fxml'.";
        assert gradper2 != null : "fx:id=\"gradper2\" was not injected: check your FXML file 'View1.fxml'.";
        assert Back != null : "fx:id=\"Back\" was not injected: check your FXML file 'View1.fxml'.";
        assert less1 != null : "fx:id=\"less1\" was not injected: check your FXML file 'View1.fxml'.";
        assert less4 != null : "fx:id=\"less4\" was not injected: check your FXML file 'View1.fxml'.";
        assert less3 != null : "fx:id=\"less3\" was not injected: check your FXML file 'View1.fxml'.";
        assert less5 != null : "fx:id=\"less5\" was not injected: check your FXML file 'View1.fxml'.";
        assert result3 != null : "fx:id=\"result3\" was not injected: check your FXML file 'View1.fxml'.";
        assert gate2 != null : "fx:id=\"gate2\" was not injected: check your FXML file 'View1.fxml'.";
        assert deptgrad2 != null : "fx:id=\"deptgrad2\" was not injected: check your FXML file 'View1.fxml'.";
        assert category1 != null : "fx:id=\"category1\" was not injected: check your FXML file 'View1.fxml'.";
        assert gender1 != null : "fx:id=\"gender1\" was not injected: check your FXML file 'View1.fxml'.";
        assert class10per2 != null : "fx:id=\"class10per2\" was not injected: check your FXML file 'View1.fxml'.";
        assert date1 != null : "fx:id=\"date1\" was not injected: check your FXML file 'View1.fxml'.";
        assert stategrad2 != null : "fx:id=\"stategrad2\" was not injected: check your FXML file 'View1.fxml'.";
        assert univgrad2 != null : "fx:id=\"univgrad2\" was not injected: check your FXML file 'View1.fxml'.";
        assert enrollment1 != null : "fx:id=\"enrollment1\" was not injected: check your FXML file 'View1.fxml'.";
        assert phydis1 != null : "fx:id=\"phydis1\" was not injected: check your FXML file 'View1.fxml'.";
        assert dateupto3 != null : "fx:id=\"dateupto3\" was not injected: check your FXML file 'View1.fxml'.";
        assert deptpost2 != null : "fx:id=\"deptpost2\" was not injected: check your FXML file 'View1.fxml'.";
        assert greater1 != null : "fx:id=\"greater1\" was not injected: check your FXML file 'View1.fxml'.";
        assert phd2 != null : "fx:id=\"phd2\" was not injected: check your FXML file 'View1.fxml'.";
        assert dob1 != null : "fx:id=\"dob1\" was not injected: check your FXML file 'View1.fxml'.";
        assert class122 != null : "fx:id=\"class122\" was not injected: check your FXML file 'View1.fxml'.";
        assert univpost2 != null : "fx:id=\"univpost2\" was not injected: check your FXML file 'View1.fxml'.";
        assert statepost2 != null : "fx:id=\"statepost2\" was not injected: check your FXML file 'View1.fxml'.";
        assert greater4 != null : "fx:id=\"greater4\" was not injected: check your FXML file 'View1.fxml'.";
        assert name1 != null : "fx:id=\"name1\" was not injected: check your FXML file 'View1.fxml'.";
        assert greater5 != null : "fx:id=\"greater5\" was not injected: check your FXML file 'View1.fxml'.";
        assert class102 != null : "fx:id=\"class102\" was not injected: check your FXML file 'View1.fxml'.";
        assert greater2 != null : "fx:id=\"greater2\" was not injected: check your FXML file 'View1.fxml'.";
        assert postper2 != null : "fx:id=\"postper2\" was not injected: check your FXML file 'View1.fxml'.";
        assert greater3 != null : "fx:id=\"greater3\" was not injected: check your FXML file 'View1.fxml'.";
        assert male1 != null : "fx:id=\"male1\" was not injected: check your FXML file 'View1.fxml'.";
        assert female1 != null : "fx:id=\"female1\" was not injected: check your FXML file 'View1.fxml'.";
        assert phyyes1 != null : "fx:id=\"phyyes1\" was not injected: check your FXML file 'View1.fxml'.";
        assert phyno1 != null : "fx:id=\"phyno1\" was not injected: check your FXML file 'View1.fxml'.";
        assert dobbefore1 != null : "fx:id=\"dobbefore1\" was not injected: check your FXML file 'View1.fxml'.";
        assert dobon1 != null : "fx:id=\"dobon1\" was not injected: check your FXML file 'View1.fxml'.";
        assert dobafter1 != null : "fx:id=\"dobafter1\" was not injected: check your FXML file 'View1.fxml'.";
        
        male1.setUserData("Male");
        female1.setUserData("Female");
        phyyes1.setUserData("Phydis Yes");
        phyno1.setUserData("Phydis No");
        dobbefore1.setUserData("DOB Before");
        dobon1.setUserData("DOB On");
        dobafter1.setUserData("DOB After");
        
        category1.getItems().addAll("General", "SC", "ST", "OBC");
        phd2.getItems().addAll("Computer Science", "Electronics and Communication", "Computational Biology");
        grad2.getItems().addAll("B.Tech", "B.Sc", "B.A.");
        post2.getItems().addAll("M.Tech", "M.Sc", "M.A.");
        class102.getItems().addAll("Andhra Pradesh Board of Intermediate Education","Andhra Pradesh Board of Secondary Education","Board of Higher Secondary Education, Delhi","Assam Board of Secondary Education","Bihar School Examination Board","Board of Youth Education India","Board of School Education, Haryana","Board of Secondary Education, Madhya Pradesh","Board of Secondary Education Madhya Bharat Gwalior","Board of Secondary Education, Rajasthan","Chhattisgarh Board of Secondary Education","Central Board of Secondary Education","Central Board Of Patna, Bihar","Central Board Of Education Ajmer New Delhi","Goa Board of Secondary & Higher Secondary Education","Gujarat Secondary Education Board","Himachal Pradesh Board of School Education","Indian Board of School Education","Indian Board of Computer Education","J&K State Board of School Education","Jharkhand Academic Council","Karnataka Board of the Pre-University Education","Karnataka Secondary Education Examination Board","Kerala Board of Public Examinations","Maharashtra State Board of Secondary and Higher Secondary Education","Manipur Board of Secondary Education","Manipur Council of Higher Secondary Education","Meghalaya Board of School Education","Mizoram Board of School Education","North East National Board Of School Education","Northwest Accreditation Commission","Nagaland Board of School Education","National Institute of Open Schooling","Orissa Board of Secondary Education","Orissa Council of Higher Secondary Education","Punjab School Education Board","Rajasthan Board of Secondary Education","Tamil Nadu Board of Higher Secondary Education","Tamil Nadu Board of Secondary Education","Tamilnadu Council for Open and Distance Learning","Tripura Board of Secondary Education","Telangana Board of Intermediate Education","Telangana Board of Secondary Education","Uttar Pradesh Board of High School and Intermediate Education","Sampurnanand Sanskrit Vishwavidyalaya Varanasi Uttar Pradesh","Uttarakhand Board of School Education","West Bengal Board of Secondary Education","West Bengal Council of Higher Secondary Education","West Bengal State Council of Vocational Education and Training","Board of Secondary Education Kant Shahjahanpur Uttar Pradesh","The West Bengal Council of Rabindra Open Schooling");
        class122.getItems().addAll("Andhra Pradesh Board of Intermediate Education","Andhra Pradesh Board of Secondary Education","Board of Higher Secondary Education, Delhi","Assam Board of Secondary Education","Bihar School Examination Board","Board of Youth Education India","Board of School Education, Haryana","Board of Secondary Education, Madhya Pradesh","Board of Secondary Education Madhya Bharat Gwalior","Board of Secondary Education, Rajasthan","Chhattisgarh Board of Secondary Education","Central Board of Secondary Education","Central Board Of Patna, Bihar","Central Board Of Education Ajmer New Delhi","Goa Board of Secondary & Higher Secondary Education","Gujarat Secondary Education Board","Himachal Pradesh Board of School Education","Indian Board of School Education","Indian Board of Computer Education","J&K State Board of School Education","Jharkhand Academic Council","Karnataka Board of the Pre-University Education","Karnataka Secondary Education Examination Board","Kerala Board of Public Examinations","Maharashtra State Board of Secondary and Higher Secondary Education","Manipur Board of Secondary Education","Manipur Council of Higher Secondary Education","Meghalaya Board of School Education","Mizoram Board of School Education","North East National Board Of School Education","Northwest Accreditation Commission","Nagaland Board of School Education","National Institute of Open Schooling","Orissa Board of Secondary Education","Orissa Council of Higher Secondary Education","Punjab School Education Board","Rajasthan Board of Secondary Education","Tamil Nadu Board of Higher Secondary Education","Tamil Nadu Board of Secondary Education","Tamilnadu Council for Open and Distance Learning","Tripura Board of Secondary Education","Telangana Board of Intermediate Education","Telangana Board of Secondary Education","Uttar Pradesh Board of High School and Intermediate Education","Sampurnanand Sanskrit Vishwavidyalaya Varanasi Uttar Pradesh","Uttarakhand Board of School Education","West Bengal Board of Secondary Education","West Bengal Council of Higher Secondary Education","West Bengal State Council of Vocational Education and Training","Board of Secondary Education Kant Shahjahanpur Uttar Pradesh","The West Bengal Council of Rabindra Open Schooling");
        deptgrad2.getItems().addAll("Civil Engineering","Computer Science and Engineering","Electrical and Electronics Engineering","Electronics and Communication Engineering","Information Technology","Mechanical Engineering","Architecture","Mathematics","Computer Applications","Physics","Chemistry","English");
        deptpost2.getItems().addAll("Civil Engineering","Computer Science and Engineering","Electrical and Electronics Engineering","Electronics and Communication Engineering","Information Technology","Mechanical Engineering","Architecture","Mathematics","Computer Applications","Physics","Chemistry","English");
        stategrad2.getItems().addAll("Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal");
        statepost2.getItems().addAll("Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal");
    }
}