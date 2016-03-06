/**
 * 
 * @author 
 * 
 * akash aggarwal 2014008
 * rohan juneja 2014156
 *
 */

package iiitd_PhD_Admission;

import java.awt.geom.GeneralPath;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javax.swing.text.TabExpander;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

public class ApplicantController implements Initializable{

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField universityName;

    @FXML
    private TextField marks22;

    @FXML
    private TabPane admissionPhDTabPane;

    @FXML
    private TextField fatherName;

    @FXML
    private TextField gotCGPA22;

    @FXML
    private TextField achievements;

    @FXML
    private TextField score2;

    @FXML
    private ComboBox<String> year23;

    @FXML
    private Tab feedbackTab;

    @FXML
    private ToggleGroup feedbacktoggle;

    @FXML
    private ComboBox<String> outOfCGPA22;

    @FXML
    private ComboBox<String> nameofstate2;

    @FXML
    private RadioButton pysicallyDisabledYes;

    @FXML
    private Tab educationInformationTab;

    @FXML
    private Button statementOfPurpose;

    @FXML
    private TextArea correspondanceAddress;

    @FXML
    private TextField XIIthMarks;

    @FXML
    private RadioButton computationalBiology;

    @FXML
    private ToggleGroup cgpa22;

    @FXML
    private Tab submitTab;

    @FXML
    private ComboBox<String> state;

    @FXML
    private RadioButton female;

    @FXML
    private ComboBox<String> yearOfGraduation;

    @FXML
    private ChoiceBox<String> preference3;

    @FXML
    private ChoiceBox<String> preference4;

    @FXML
    private ToggleGroup category1;

    @FXML
    private ToggleGroup gender1;

    @FXML
    private TextField degree;

    @FXML
    private Button CV_Resume;

    @FXML
    private ChoiceBox<String> preference1;

    @FXML
    private ChoiceBox<String> preference2;

    @FXML
    private TextField dep2;

    @FXML
    private RadioButton pysicallyDisabledNo;

    @FXML
    private ToggleGroup warwidow1;

    @FXML
    private TextField collegeName;

    @FXML
    private ComboBox<String> nationality;

    @FXML
    private TextField pinCode;

    @FXML
    private TextField name;

    @FXML
    private ComboBox<String> yearOfPassingXth;

    @FXML
    private ComboBox<String> phDPreference3;

    @FXML
    private ComboBox<String> phDPreference2;

    @FXML
    private ComboBox<String> phDPreference1;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton defenceChildrenYes;

    @FXML
    private ToggleGroup phdstream;

    @FXML
    private TextField XIIthBoard;

    @FXML
    private TextField nameofcolege2;

    @FXML
    private TextField sub2;

    @FXML
    private RadioButton defenseChildrenNo;

    @FXML
    private TextField city;

    @FXML
    private TextField XthMarks;

    @FXML
    private RadioButton CGPA;

    @FXML
    private TextField year2;

    @FXML
    private TextField examname2;

    @FXML
    private TextField degree2;

    @FXML
    private RadioButton SC;

    @FXML
    private RadioButton OBC;

    @FXML
    private RadioButton general;

    @FXML
    private TextField gotMarks;

    @FXML
    private Tab personalInformationTab;

    @FXML
    private Text soplabel;

    @FXML
    private TextArea permanentAddress;

    @FXML
    private TextField department;

    @FXML
    private TextField nameofcity2;

    @FXML
    private TextField email;

    @FXML
    private RadioButton ST;

    @FXML
    private Button submitButton;

    @FXML
    private Text cvlabel;

    @FXML
    private TextField mobile;

    @FXML
    private TextField thesis2;

    @FXML
    private ComboBox<String> yearOfPassingXIIth;
    
    @FXML
    private ComboBox<String> year24;

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private RadioButton marks;

    @FXML
    private RadioButton computerScience;

    @FXML
    private TextField gotCGPA;

    @FXML
    private ToggleGroup phydis1;

    @FXML
    private ComboBox<String> outOfCGPA;

    @FXML
    private TextField XthBoard;

    @FXML
    private TextField rank2;
    
    @FXML
    private TextField area24;
    
    @FXML
    private TextField marks24;
    

    @FXML
    private RadioButton electronicsAndCommunication;

    @FXML
    private TextField score24;

    @FXML
    private ToggleGroup cgpa;

    @FXML
    private TextField rank24;
    
    @FXML
    private Label generateid;
    
    @FXML
    private Label fillLabel;
    
    FileChooser chooser1, chooser2;
    File file1, file2;
    
   
    int flag = 0, flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0;
    
    @FXML
    void cvbutton(ActionEvent event) {
    	chooser1 = new FileChooser();
    	file1 = chooser1.showOpenDialog(Applicant.copy1);
    	if(file1 != null) {
    		//System.out.println(file.getPath().toString());
    		cvlabel.setText(file1.getName());
    	}
    	
    }
    
    @FXML
    void sopbutton(ActionEvent event) {
    	chooser2 = new FileChooser();
    	file2 = chooser2.showOpenDialog(Applicant.copy1);
    	if(file2 != null) {
    		//System.out.println(file.getPath().toString());
    		soplabel.setText(file2.getName());
    	}
    }
    
    @FXML
    void handleSubmitAction(Event event) {
    	fillLabel.setText("");
    	generateid.setText("");
    	flag = 0;
    	flag1 = 0;
    	flag2 = 0;
    	flag3 = 0;
    	flag4 = 0;
		  applicantDetails apdt = new applicantDetails();
		  ObjectOutputStream objout = null;
			BufferedWriter brout = null;
			StringBuilder fcontent = new StringBuilder();
    	  try {
    		  objout = new ObjectOutputStream(new FileOutputStream("./src/applicant.dat",true));
    		  // TODO enrollment
    		  if(email.getText().equals("") || name.getText().equals("") || mobile.getText().equals("") || phdstream.getSelectedToggle() == null || gender1.getSelectedToggle() == null || category1.getSelectedToggle() == null || phydis1.getSelectedToggle() == null || dateOfBirth.getValue() == null || warwidow1.getSelectedToggle() == null || fatherName.getText().equals("") || nationality.getValue() == null || permanentAddress.getText().equals("") || XthBoard.getText().equals("") || XthMarks.getText().equals("") || yearOfPassingXth.getValue() == null || XIIthBoard.getText().equals("") || XIIthMarks.getText().equals("") || yearOfPassingXIIth.getValue() == null || degree.getText().equals("") || department.getText().equals("") || collegeName.getText().equals("") || universityName.getText().equals("") || city.getText().equals("") || state.getValue() == null || yearOfGraduation.getValue() == null || cgpa.getSelectedToggle() == null || file1==null || file2==null) {
    			  flag = 0;
    		  }
    		  else {
    			  flag = 1;
    			  LocalDate dtdate = LocalDate.now();
	    		  apdt.setEmail(email.getText());
	    		  fcontent.append("Email: " + email.getText());
	    		  apdt.setName(name.getText());
	    		  fcontent.append("\nName: " + name.getText());
	    		  apdt.setCorrespondanceAddress(correspondanceAddress.getText());
	    		  fcontent.append("\nCorrespondance Address: " + correspondanceAddress.getText());
	    		  apdt.setMobile(mobile.getText());
	    		  fcontent.append("\nMobile: " + mobile.getText());
	    		  apdt.setPhdstream(phdstream.getSelectedToggle().getUserData().toString());
	    		  fcontent.append("\nPhD Stream: " + phdstream.getSelectedToggle().getUserData().toString());
	    		  apdt.setPhDPreference1(phDPreference1.getValue().toString());
	    		  fcontent.append("\nPhD Preference 1: " + phDPreference1.getValue().toString());
	    		  apdt.setPhDPreference2(phDPreference2.getValue().toString());
	    		  fcontent.append("\nPhD Preference 2: " + phDPreference2.getValue().toString());
	    		  apdt.setPhDPreference3(phDPreference3.getValue().toString());
	    		  fcontent.append("\nPhD Preference 3: " + phDPreference3.getValue().toString());
	    		  apdt.setGender1(gender1.getSelectedToggle().getUserData().toString());
	    		  fcontent.append("\nGender: " + gender1.getSelectedToggle().getUserData().toString());
	    		  apdt.setCategory1(category1.getSelectedToggle().getUserData().toString());
	    		  fcontent.append("\nCategory: " + category1.getSelectedToggle().getUserData().toString());
	    		  apdt.setPhydis1(phydis1.getSelectedToggle().getUserData().toString());
	    		  fcontent.append("\nPhysically Disabled: " + phydis1.getSelectedToggle().getUserData().toString());
	    		  apdt.setDateOfBirth(dateOfBirth.getValue());
	    		  fcontent.append(dateOfBirth.getValue().toString());
	    		  if(dateOfBirth.getValue().compareTo(dtdate) >= 0)
	    			  flag = 0;
	    		  apdt.setWarwidow1(warwidow1.getSelectedToggle().getUserData().toString());
	    		  fcontent.append("\nDefense: " + warwidow1.getSelectedToggle().getUserData().toString());
	    		  apdt.setFatherName(fatherName.getText());
	    		  fcontent.append("\nFather Name: " + fatherName.getText());
	    		  apdt.setNationality(nationality.getValue().toString());
	    		  fcontent.append("\nNationality: " + nationality.getValue().toString());
	    		  apdt.setPermanentAddress(permanentAddress.getText());
	    		  fcontent.append("\nPermanent Address: " + permanentAddress.getText());
	    		  apdt.setPinCode(pinCode.getText());
	    		  fcontent.append("\nPin Code: " + pinCode.getText());
	    		  apdt.setXthBoard(XthBoard.getText());
	    		  fcontent.append("\nXth Board: " + XthBoard.getText());
	    		  apdt.setXthMarks(Integer.parseInt(XthMarks.getText()));
	    		  fcontent.append("\nXth Marks: " + XthMarks.getText());
	    		  if(!(apdt.XthMarks >=0 && apdt.XthMarks <= 100))
	    			  flag = 0;
	    		  apdt.setYearOfPassingXth(yearOfPassingXth.getValue().toString());
	    		  fcontent.append("\nYear of Passing Xth: " + yearOfPassingXth.getValue().toString());
	    		  apdt.setXIIthBoard(XIIthBoard.getText());
	    		  fcontent.append("\nXIIth Board: " + XIIthBoard.getText());
	    		  apdt.setXIIthMarks(Integer.parseInt(XIIthMarks.getText()));
	    		  fcontent.append("\nXIIth Marks: " + XIIthMarks.getText());
	    		  if(!(apdt.XIIthMarks >=0 && apdt.XIIthMarks <= 100))
	    			  flag = 0;
	    		  apdt.setYearOfPassingXIIth(yearOfPassingXIIth.getValue().toString());
	    		  fcontent.append("\nYear of Passing XIIth: " + yearOfPassingXIIth.getValue().toString());
	    		  apdt.setDegree(degree.getText());
	    		  fcontent.append("\nDegree: " + degree.getText());
	    		  apdt.setDepartment(department.getText());
	    		  fcontent.append("\nDepartment: " + department.getText());
	    		  apdt.setCollegeName(collegeName.getText());
	    		  fcontent.append("\nCollege Name: " + collegeName.getText());
	    		  apdt.setUniversityName(universityName.getText());
	    		  fcontent.append("\nUniversity Name: " + universityName.getText());
	    		  apdt.setCity(city.getText());
	    		  fcontent.append("\nCity: " + city.getText());
	    		  apdt.setState(state.getValue().toString());
	    		  fcontent.append("\nState: " + state.getValue().toString());
	    		  apdt.setYearOfGraduation(yearOfGraduation.getValue().toString());
	    		  fcontent.append("\nYear of Graduation: " + yearOfGraduation.getValue().toString());
	    		  apdt.setYearOfGraduation(achievements.getText());
	    		  fcontent.append("\nAchievements: " + achievements.getText());
	    		  if(cgpa.getSelectedToggle().toString().contains("CGPA")) {
	    			  apdt.setCgpa("CGPA");
	    			  if(gotCGPA.getText().equals("") || outOfCGPA.getValue() == null)
	    				  flag = 0;
	    			  else {
	    			  apdt.setGotCGPA(gotCGPA.getText());
	    			  apdt.setOutOfCGPA(outOfCGPA.getValue().toString());}
	    		  }
				  else if(cgpa.getSelectedToggle().toString().contains("MARKS")) {
					  apdt.setCgpa("Marks");
					  if(gotMarks.getText().equals(""))
	    				  flag = 0;
	    			  else {
	    			  apdt.setGotMarks(Integer.parseInt(gotMarks.getText()));
	    			  if(!(apdt.gotMarks >=0 && apdt.gotMarks <= 100))
		    			  flag = 0;
	    			  }
	    		  }
				  else 
					  flag = 0;
	    		  apdt.setAchievements(achievements.getText());
    		  }
    	      if(preference1.getValue() != null && preference2.getValue() != null && preference3.getValue() != null && preference4.getValue() != null) {
    	    	  flag1 = 1;
    	    	  apdt.preference1 = preference1.getValue().toString();
    	    	  apdt.preference2 = preference2.getValue().toString();
    	          apdt.preference3 = preference3.getValue().toString();
    	          apdt.preference4 = preference4.getValue().toString();
    	      }
    	      
    	      else if(preference1.getValue() != null || preference2.getValue() != null || preference3.getValue() != null || preference4.getValue() != null)
    	    	  flag1 = 2;
    	       if(!nameofcolege2.getText().equals("") && !nameofcity2.getText().equals("") && nameofstate2.getValue() != null && !dep2.getText().equals("") && !degree2.getText().equals("") && !thesis2.getText().equals("") && !year2.getText().equals("") && cgpa22.getSelectedToggle() != null) {
    	    	  flag2 = 1;
    	    	  apdt.nameofcolege22 = nameofcolege2.getText();
    	    	  apdt.nameofcity22 = nameofcity2.getText();
    	    	  apdt.nameofstate22 = nameofstate2.getValue().toString();
    	    	  apdt.dept22 = dep2.getText();
    	    	  apdt.degree22 = degree2.getText();
    	    	  apdt.thesis22 = thesis2.getText();
    	    	  apdt.year22 = year2.getText();
    	    	  if(cgpa22.getSelectedToggle().toString().contains("CGPA")) {
	    			  apdt.setCgpa22("CGPA");
	    			  if(gotCGPA22.getText().equals("") || outOfCGPA22.getValue() == null)
	    				  flag = 0;
	    			  else {
	    			  apdt.setGotCGPA22(gotCGPA22.getText());
	    			  apdt.setOutOfCGPA22(outOfCGPA22.getValue().toString());
	    			  }
	    		  }
				  else if(cgpa22.getSelectedToggle().toString().contains("MARKS")) {
					  apdt.setCgpa22("Marks");
					  if(marks22.getText().equals(""))
	    				  flag = 0;
	    			  else {
	    			  apdt.setMarks22(Integer.parseInt(marks22.getText()));
	    			  if(!(apdt.marks22 >=0 && apdt.marks22 <= 100))
		    			  flag = 0;
	    			  }
				  }
				  else 
					  flag2 = 2;
    	    	  
    	      }
    	       else if(!nameofcolege2.getText().equals("") || !nameofcity2.getText().equals("") || nameofstate2.getValue() != null || !dep2.getText().equals("") || !degree2.getText().equals("") || !thesis2.getText().equals("") || !year2.getText().equals("") || cgpa22.getSelectedToggle() != null)
    	    	   		flag2 = 2;
    	      if(!examname2.getText().equals("") && !sub2.getText().equals("") && year23.getValue() != null && !score2.getText().equals("") && !rank2.getText().equals("")) {
    	    	  flag3 = 1;
    	    	  apdt.examname23 = examname2.getText();
    	    	  apdt.sub23 = sub2.getText();
    	    	  apdt.year23 = year23.getValue().toString();
    	    	  apdt.score23 = score2.getText();
    	    	  apdt.rank23 = rank2.getText();
    	      }
    	      else if(!examname2.getText().equals("") || !sub2.getText().equals("") || year23.getValue() != null || !score2.getText().equals("") || !rank2.getText().equals(""))
    	    	  flag3 = 2;
    	    	  if(!area24.getText().equals("") && year24.getValue() != null && !marks24.getText().equals("") && !score24.getText().equals("") && !rank24.getText().equals("")) {
    	    	  flag4 = 1;
    	    	  apdt.area24 = area24.getText();
    	    	  apdt.year24 = year24.getValue().toString();
    	    	  apdt.marks24 = marks24.getText();
    	    	  apdt.score24 = Integer.parseInt(score24.getText());
    	    	  if(!(apdt.score24 >=0 && apdt.score24 <= 100))
	    			  flag = 0;
    	    	  apdt.rank24 = rank24.getText();
    	      }
    	    	  else if(!area24.getText().equals("") || year24.getValue() != null || !marks24.getText().equals("") || !score24.getText().equals("") || !rank24.getText().equals(""))
    	    		  flag4 = 2;
    	    	 if(flag == 1 && (flag1 == 0 || flag1 == 1) && (flag2 == 0 || flag2 == 1) && (flag3 == 0 || flag3 == 1) && (flag4 == 0 || flag4 == 1)){
    	    	  Integer temp = null;
    	    	  LocalDate dt = LocalDate.now();
    	    	  apdt.setTimeStamp(dt);
    	    	  apdt.setCV(file1.getAbsolutePath().toString());
    	    	  apdt.setSOP(file2.getAbsolutePath().toString());
    	    	  BufferedReader br = null;
    	  		  String line;
    	  		  try {
    	  			  br = new BufferedReader(new FileReader("./src/enrollment.txt"));
    	  			  line = br.readLine();
    	  			  temp = Integer.parseInt(line);
    	  		  } catch (FileNotFoundException e) {
    	  			  e.printStackTrace();
    	  		  } catch (IOException e) {
    	  			  e.printStackTrace();
    	  		  } 
    	  		  finally {
    	  			  try {
    	  				  br.close();
    	  			  } catch (IOException e) {
    	  				  e.printStackTrace();
    	  			  }
    	  		  }
    	  		  temp++;
    	  		  apdt.setEnrollmentid(temp);
    	  		generateid.setText("Your Enrollment Id is " + temp);
    	  		BufferedWriter br1 = null;
    			String line1;
    			try {
    				br1 = new BufferedWriter(new FileWriter("./src/enrollment.txt"));
    				brout = new BufferedWriter(new FileWriter("./src/" + apdt.enrollmentid));
    				br1.write(temp.toString());
    				brout.write(fcontent.toString());
    			} catch (FileNotFoundException e) {
    				e.printStackTrace();
    			} catch (IOException e) {
    				e.printStackTrace();
    			} 
    			finally {
    				try {
    					br1.close();
    				} catch (IOException e) {
    					e.printStackTrace();
    				} 
    			}
    			objout.writeObject(apdt);
    	      }
    	    	 else
    	    		 fillLabel.setText("Please fill all the fields");
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		  finally {
				try {
					objout.close();
				} catch (IOException e) { 
					e.printStackTrace();
				}
		  }
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		  assert universityName != null : "fx:id=\"universityName\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert marks22 != null : "fx:id=\"marks22\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert admissionPhDTabPane != null : "fx:id=\"admissionPhDTabPane\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert fatherName != null : "fx:id=\"fatherName\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert gotCGPA22 != null : "fx:id=\"gotCGPA22\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert achievements != null : "fx:id=\"achievements\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert score2 != null : "fx:id=\"score2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert year24 != null : "fx:id=\"year24\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert year23 != null : "fx:id=\"year23\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert feedbackTab != null : "fx:id=\"feedbackTab\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert feedbacktoggle != null : "fx:id=\"feedbacktoggle\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert outOfCGPA22 != null : "fx:id=\"outOfCGPA22\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert nameofstate2 != null : "fx:id=\"nameofstate2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert marks24 != null : "fx:id=\"marks24\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert pysicallyDisabledYes != null : "fx:id=\"pysicallyDisabledYes\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert educationInformationTab != null : "fx:id=\"educationInformationTab\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert statementOfPurpose != null : "fx:id=\"statementOfPurpose\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert correspondanceAddress != null : "fx:id=\"correspondanceAddress\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert XIIthMarks != null : "fx:id=\"XIIthMarks\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert computationalBiology != null : "fx:id=\"computationalBiology\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert cgpa22 != null : "fx:id=\"cgpa22\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert submitTab != null : "fx:id=\"submitTab\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert state != null : "fx:id=\"state\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert female != null : "fx:id=\"female\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert yearOfGraduation != null : "fx:id=\"yearOfGraduation\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert preference3 != null : "fx:id=\"preference3\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert preference4 != null : "fx:id=\"preference4\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert category1 != null : "fx:id=\"category1\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert gender1 != null : "fx:id=\"gender1\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert degree != null : "fx:id=\"degree\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert CV_Resume != null : "fx:id=\"CV_Resume\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert preference1 != null : "fx:id=\"preference1\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert preference2 != null : "fx:id=\"preference2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert dep2 != null : "fx:id=\"dep2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert pysicallyDisabledNo != null : "fx:id=\"pysicallyDisabledNo\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert warwidow1 != null : "fx:id=\"warwidow1\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert collegeName != null : "fx:id=\"collegeName\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert nationality != null : "fx:id=\"nationality\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert pinCode != null : "fx:id=\"pinCode\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert yearOfPassingXth != null : "fx:id=\"yearOfPassingXth\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert phDPreference3 != null : "fx:id=\"phDPreference3\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert phDPreference2 != null : "fx:id=\"phDPreference2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert phDPreference1 != null : "fx:id=\"phDPreference1\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert male != null : "fx:id=\"male\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert defenceChildrenYes != null : "fx:id=\"defenceChildrenYes\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert phdstream != null : "fx:id=\"phdstream\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert XIIthBoard != null : "fx:id=\"XIIthBoard\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert nameofcolege2 != null : "fx:id=\"nameofcolege2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert sub2 != null : "fx:id=\"sub2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert defenseChildrenNo != null : "fx:id=\"defenseChildrenNo\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert city != null : "fx:id=\"city\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert XthMarks != null : "fx:id=\"XthMarks\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert CGPA != null : "fx:id=\"CGPA\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert year2 != null : "fx:id=\"year2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert examname2 != null : "fx:id=\"examname2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert degree2 != null : "fx:id=\"degree2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert SC != null : "fx:id=\"SC\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert OBC != null : "fx:id=\"OBC\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert general != null : "fx:id=\"general\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert gotMarks != null : "fx:id=\"gotMarks\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert personalInformationTab != null : "fx:id=\"personalInformationTab\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert soplabel != null : "fx:id=\"soplabel\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert permanentAddress != null : "fx:id=\"permanentAddress\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert department != null : "fx:id=\"department\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert nameofcity2 != null : "fx:id=\"nameofcity2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert ST != null : "fx:id=\"ST\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert cvlabel != null : "fx:id=\"cvlabel\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert mobile != null : "fx:id=\"mobile\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert thesis2 != null : "fx:id=\"thesis2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert yearOfPassingXIIth != null : "fx:id=\"yearOfPassingXIIth\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert dateOfBirth != null : "fx:id=\"dateOfBirth\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert marks != null : "fx:id=\"marks\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert computerScience != null : "fx:id=\"computerScience\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert gotCGPA != null : "fx:id=\"gotCGPA\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert phydis1 != null : "fx:id=\"phydis1\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert outOfCGPA != null : "fx:id=\"outOfCGPA\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert XthBoard != null : "fx:id=\"XthBoard\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert rank2 != null : "fx:id=\"rank2\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert area24 != null : "fx:id=\"area24\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert electronicsAndCommunication != null : "fx:id=\"electronicsAndCommunication\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert score24 != null : "fx:id=\"score24\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert cgpa != null : "fx:id=\"cgpa\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert rank24 != null : "fx:id=\"rank24\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert generateid != null : "fx:id=\"generateid\" was not injected: check your FXML file 'Applicant.fxml'.";
	        assert fillLabel != null : "fx:id=\"fillLabel\" was not injected: check your FXML file 'Applicant.fxml'.";
	        
        computerScience.setUserData("Computer Science");
        electronicsAndCommunication.setUserData("Electronics And Communication");
        computationalBiology.setUserData("Computational Biology");
        
        male.setUserData("Male");
        female.setUserData("Female");
        
        general.setUserData("General");
        SC.setUserData("SC");
        ST.setUserData("ST");
        OBC.setUserData("OBC");
        
        pysicallyDisabledYes.setUserData("Yes");
        pysicallyDisabledNo.setUserData("No");
        
        defenceChildrenYes.setUserData("Yes");
        defenseChildrenNo.setUserData("No");
        
        state.getItems().addAll("Andhra Pradesh", "Arunachal Pradesh", "Assam","Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra","Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan","Sikkim", "Tamil Nadu", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal");
        nameofstate2.getItems().addAll("Andhra Pradesh", "Arunachal Pradesh", "Assam","Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra","Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan","Sikkim", "Tamil Nadu", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal");
        nationality.getItems().addAll("Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda","Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas","Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin","Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Antarctic Territory", "British Indian Ocean Territory", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia","Cameroon", "Canada", "Canton and Enderbury Islands", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island","Cocos [Keeling] Islands", "Colombia", "Comoros", "Congo - Brazzaville", "Congo - Kinshasa", "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic","Dronning Maud Land", "East Germany", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji","Finland", "France", "French Guiana", "French Polynesia", "French Southern Territories", "French Southern and Antarctic Territories", "Gabon", "Gambia","Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada","Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau","Guyana", "Haiti", "Heard Island and McDonald Islands", "Honduras", "Hong Kong SAR China", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Isle of Man","Israel", "Italy", "Jamaica", "Japan", "Jersey", "Johnston Island", "Jordan","Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon","Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau SAR China", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta","Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Metropolitan France", "Mexico", "Micronesia", "Midway Islands", "Moldova", "Monaco", "Mongolia","Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar [Burma]","Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "Neutral Zone","New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "North Vietnam", "Northern Mariana Islands", "Norway","Oman", "Pacific Islands Trust Territory", "Pakistan", "Palau", "Palestinian Territories","Panama", "Panama Canal Zone", "Papua New Guinea", "Paraguay", "People's Democratic Republic of Yemen", "Peru", "Philippines", "Pitcairn Islands", "Poland","Portugal", "Puerto Rico", "Qatar", "Romania", "Russia", "Rwanda", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin","Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Saudi Arabia", "Senegal", "Serbia", "Serbia and Montenegro", "Seychelles","Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia","South Africa", "South Georgia and the South Sandwich Islands", "South Korea","Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland","Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan","Tanzania", "Thailand", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu","U.S. Minor Outlying Islands", "U.S. Miscellaneous Pacific Islands", "U.S. Virgin Islands", "Uganda", "Ukraine", "Union of Soviet Socialist Republics", "United Arab Emirates", "United Kingdom", "United States", "Unknown or Invalid Region","Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Wake Island", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe");
        yearOfPassingXIIth.getItems().addAll( "1950", "1951", "1952", "1953", "1954", "1955","1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966","1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977","1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988","1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010","2011", "2012", "2013", "2014", "2015");
        yearOfPassingXth.getItems().addAll( "1950", "1951", "1952", "1953", "1954", "1955","1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966","1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977","1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988","1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010","2011", "2012", "2013", "2014", "2015");
        year24.getItems().addAll( "1950", "1951", "1952", "1953", "1954", "1955","1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966","1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977","1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988","1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010","2011", "2012", "2013", "2014", "2015");
        year23.getItems().addAll( "1950", "1951", "1952", "1953", "1954", "1955","1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966","1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977","1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988","1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010","2011", "2012", "2013", "2014", "2015");
        preference1.getItems().addAll("Artificial Intelligents - CSE","Biophysics- CB","Compilers -CSE","Computer Architecture and System Design -ECE","Computer Architecture and System Design -CSE","Computer Graphics - CSE","Computer Vision - CSE","Control and Robotics - ECE","Digital And analogue VLSI - ECE","Electromagnetics - ECE","Embedded and VLSI System Design -ECE","Embedded System - ECE","Fiber Wireless Architecture - CSE","Image Analysis And Biometrics - CSE","Data Engineering - CSE","Machine Learning -ECE","Massively Parallel System- CSE","Program Analysis - CSE","Software Engineering - CSE","Security And Privacy - CSE","Program Analysis - CSE");
        preference2.getItems().addAll("Artificial Intelligents - CSE","Biophysics- CB","Compilers -CSE","Computer Architecture and System Design -ECE","Computer Architecture and System Design -CSE","Computer Graphics - CSE","Computer Vision - CSE","Control and Robotics - ECE","Digital And analogue VLSI - ECE","Electromagnetics - ECE","Embedded and VLSI System Design -ECE","Embedded System - ECE","Fiber Wireless Architecture - CSE","Image Analysis And Biometrics - CSE","Data Engineering - CSE","Machine Learning -ECE","Massively Parallel System- CSE","Program Analysis - CSE","Software Engineering - CSE","Security And Privacy - CSE","Program Analysis - CSE");
        preference3.getItems().addAll("Artificial Intelligents - CSE","Biophysics- CB","Compilers -CSE","Computer Architecture and System Design -ECE","Computer Architecture and System Design -CSE","Computer Graphics - CSE","Computer Vision - CSE","Control and Robotics - ECE","Digital And analogue VLSI - ECE","Electromagnetics - ECE","Embedded and VLSI System Design -ECE","Embedded System - ECE","Fiber Wireless Architecture - CSE","Image Analysis And Biometrics - CSE","Data Engineering - CSE","Machine Learning -ECE","Massively Parallel System- CSE","Program Analysis - CSE","Software Engineering - CSE","Security And Privacy - CSE","Program Analysis - CSE");
        preference4.getItems().addAll("Artificial Intelligents - CSE","Biophysics- CB","Compilers -CSE","Computer Architecture and System Design -ECE","Computer Architecture and System Design -CSE","Computer Graphics - CSE","Computer Vision - CSE","Control and Robotics - ECE","Digital And analogue VLSI - ECE","Electromagnetics - ECE","Embedded and VLSI System Design -ECE","Embedded System - ECE","Fiber Wireless Architecture - CSE","Image Analysis And Biometrics - CSE","Data Engineering - CSE","Machine Learning -ECE","Massively Parallel System- CSE","Program Analysis - CSE","Software Engineering - CSE","Security And Privacy - CSE","Program Analysis - CSE");
        phDPreference1.getItems().addAll("Artificial Intelligents - CSE","Biophysics- CB","Compilers -CSE","Computer Architecture and System Design -ECE","Computer Architecture and System Design -CSE","Computer Graphics - CSE","Computer Vision - CSE","Control and Robotics - ECE","Digital And analogue VLSI - ECE","Electromagnetics - ECE","Embedded and VLSI System Design -ECE","Embedded System - ECE","Fiber Wireless Architecture - CSE","Image Analysis And Biometrics - CSE","Data Engineering - CSE","Machine Learning -ECE","Massively Parallel System- CSE","Program Analysis - CSE","Software Engineering - CSE","Security And Privacy - CSE","Program Analysis - CSE");
        phDPreference2.getItems().addAll("Artificial Intelligents - CSE","Biophysics- CB","Compilers -CSE","Computer Architecture and System Design -ECE","Computer Architecture and System Design -CSE","Computer Graphics - CSE","Computer Vision - CSE","Control and Robotics - ECE","Digital And analogue VLSI - ECE","Electromagnetics - ECE","Embedded and VLSI System Design -ECE","Embedded System - ECE","Fiber Wireless Architecture - CSE","Image Analysis And Biometrics - CSE","Data Engineering - CSE","Machine Learning -ECE","Massively Parallel System- CSE","Program Analysis - CSE","Software Engineering - CSE","Security And Privacy - CSE","Program Analysis - CSE");
        phDPreference3.getItems().addAll("Artificial Intelligents - CSE","Biophysics- CB","Compilers -CSE","Computer Architecture and System Design -ECE","Computer Architecture and System Design -CSE","Computer Graphics - CSE","Computer Vision - CSE","Control and Robotics - ECE","Digital And analogue VLSI - ECE","Electromagnetics - ECE","Embedded and VLSI System Design -ECE","Embedded System - ECE","Fiber Wireless Architecture - CSE","Image Analysis And Biometrics - CSE","Data Engineering - CSE","Machine Learning -ECE","Massively Parallel System- CSE","Program Analysis - CSE","Software Engineering - CSE","Security And Privacy - CSE","Program Analysis - CSE");
        yearOfGraduation.getItems().addAll("1950", "1951", "1952", "1953", "1954", "1955","1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966","1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977","1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988","1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999","2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010","2011", "2012", "2013", "2014", "2015");
        outOfCGPA.getItems().addAll("4","10");
        outOfCGPA22.getItems().addAll("4","10");

	}
}