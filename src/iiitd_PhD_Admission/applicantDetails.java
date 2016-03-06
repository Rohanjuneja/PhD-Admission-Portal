/**
 * 
 * @author 
 * 
 * akash aggarwal 2014008
 * rohan juneja 2014156
 *
 */

package iiitd_PhD_Admission;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class applicantDetails implements Serializable {
	Integer enrollmentid;
	String email;
	String name;
	String correspondanceAddress;
	String permanentAddress;
	String mobile;
	String phdstream;
	String phDPreference1;
	String phDPreference2;
	String phDPreference3;
	String gender1;
	String category1;
	String phydis1;
	LocalDate dateOfBirth;
	LocalDate timeStamp;
	String warwidow1;
	Integer XthMarks;
	String XthBoard;
	String XIIthBoard;
	Integer XIIthMarks;
	String fatherName;
	String yearOfPassingXth;
	String yearOfPassingXIIth;
	String degree;
	String department;
	String collegeName;
	String universityName;
	String city;
	String state;
	String pinCode;
	String nationality;
	String yearOfGraduation;
	String cgpa;
	String gotCGPA;
	String outOfCGPA;
	Integer gotMarks;
	
	String preference1;
	String preference2;
	String preference3;
	String preference4;
	
	String nameofcolege22;
	String nameofcity22;
	String nameofstate22;
	String dept22;
	String degree22;
	String thesis22;
	String year22;
	
	String cgpa22;
	String gotCGPA22;
	String outOfCGPA22;
	Integer marks22;
	
	
	String examname23;
	String sub23;
	String year23;
	String score23;
	String rank23;
	
	String area24;
	String year24;
	String marks24;
	Integer score24;
	String rank24;
	
	String achievements;

	String CV;
	
	public Integer getEnrollmentid() {
		return enrollmentid;
	}
	public void setEnrollmentid(Integer enrollmentid) {
		this.enrollmentid = enrollmentid;
	}
	public String getCV() {
		return CV;
	}
	public void setCV(String cV) {
		CV = cV;
	}
	public String getSOP() {
		return SOP;
	}
	public void setSOP(String sOP) {
		SOP = sOP;
	}
	public String getAchievements() {
		return achievements;
	}
	String SOP;
	
	public String achievements() {
		return achievements;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCorrespondanceAddress() {
		return correspondanceAddress;
	}
	public void setCorrespondanceAddress(String correspondanceAddress) {
		this.correspondanceAddress = correspondanceAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhdstream() {
		return phdstream;
	}
	public void setPhdstream(String phdstream) {
		this.phdstream = phdstream;
	}
	public String getPhDPreference1() {
		return phDPreference1;
	}
	public void setPhDPreference1(String phDPreference1) {
		this.phDPreference1 = phDPreference1;
	}
	public String getPhDPreference2() {
		return phDPreference2;
	}
	public void setPhDPreference2(String phDPreference2) {
		this.phDPreference2 = phDPreference2;
	}
	public String getPhDPreference3() {
		return phDPreference3;
	}
	public void setPhDPreference3(String phDPreference3) {
		this.phDPreference3 = phDPreference3;
	}
	public String getGender1() {
		return gender1;
	}
	public void setGender1(String gender1) {
		this.gender1 = gender1;
	}
	public String getCategory1() {
		return category1;
	}
	public void setCategory1(String category1) {
		this.category1 = category1;
	}
	public String getPhydis1() {
		return phydis1;
	}
	public void setPhydis1(String phydis1) {
		this.phydis1 = phydis1;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDate getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getWarwidow1() {
		return warwidow1;
	}
	public void setWarwidow1(String warwidow1) {
		this.warwidow1 = warwidow1;
	}
	public Integer getXthMarks() {
		return XthMarks;
	}
	public void setXthMarks(Integer xthMarks) {
		XthMarks = xthMarks;
	}
	public String getXthBoard() {
		return XthBoard;
	}
	public void setXthBoard(String xthBoard) {
		XthBoard = xthBoard;
	}
	public String getXIIthBoard() {
		return XIIthBoard;
	}
	public void setXIIthBoard(String xIIthBoard) {
		XIIthBoard = xIIthBoard;
	}
	public Integer getXIIthMarks() {
		return XIIthMarks;
	}
	public void setXIIthMarks(Integer xIIthMarks) {
		XIIthMarks = xIIthMarks;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getYearOfPassingXth() {
		return yearOfPassingXth;
	}
	public void setYearOfPassingXth(String yearOfPassingXth) {
		this.yearOfPassingXth = yearOfPassingXth;
	}
	public String getYearOfPassingXIIth() {
		return yearOfPassingXIIth;
	}
	public void setYearOfPassingXIIth(String yearOfPassingXIIth) {
		this.yearOfPassingXIIth = yearOfPassingXIIth;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getYearOfGraduation() {
		return yearOfGraduation;
	}
	public void setYearOfGraduation(String yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	public String getGotCGPA() {
		return gotCGPA;
	}
	public void setGotCGPA(String gotCGPA) {
		this.gotCGPA = gotCGPA;
	}
	public String getOutOfCGPA() {
		return outOfCGPA;
	}
	public void setOutOfCGPA(String outOfCGPA) {
		this.outOfCGPA = outOfCGPA;
	}
	public Integer getGotMarks() {
		return gotMarks;
	}
	public void setGotMarks(Integer gotMarks) {
		this.gotMarks = gotMarks;
	}
	public String getPreference1() {
		return preference1;
	}
	public void setPreference1(String preference1) {
		this.preference1 = preference1;
	}
	public String getPreference2() {
		return preference2;
	}
	public void setPreference2(String preference2) {
		this.preference2 = preference2;
	}
	public String getPreference3() {
		return preference3;
	}
	public void setPreference3(String preference3) {
		this.preference3 = preference3;
	}
	public String getPreference4() {
		return preference4;
	}
	public void setPreference4(String preference4) {
		this.preference4 = preference4;
	}
	public String getNameofcolege22() {
		return nameofcolege22;
	}
	public void setNameofcolege22(String nameofcolege22) {
		this.nameofcolege22 = nameofcolege22;
	}
	public String getNameofcity22() {
		return nameofcity22;
	}
	public void setNameofcity22(String nameofcity22) {
		this.nameofcity22 = nameofcity22;
	}
	public String getNameofstate22() {
		return nameofstate22;
	}
	public void setNameofstate22(String nameofstate22) {
		this.nameofstate22 = nameofstate22;
	}
	public String getDept22() {
		return dept22;
	}
	public void setDept22(String dept22) {
		this.dept22 = dept22;
	}
	public String getDegree22() {
		return degree22;
	}
	public void setDegree22(String degree22) {
		this.degree22 = degree22;
	}
	public String getThesis22() {
		return thesis22;
	}
	public void setThesis22(String thesis22) {
		this.thesis22 = thesis22;
	}
	public String getYear22() {
		return year22;
	}
	public void setYear22(String year22) {
		this.year22 = year22;
	}
	public Integer getMarks22() {
		return marks22;
	}
	public void setMarks22(Integer marks22) {
		this.marks22 = marks22;
	}
	public String getCgpa22() {
		return cgpa22;
	}
	public void setCgpa22(String cgpa22) {
		this.cgpa22 = cgpa22;
	}
	public String getOutOfCGPA22() {
		return outOfCGPA22;
	}
	public void setOutOfCGPA22(String outOfCGPA22) {
		this.outOfCGPA22 = outOfCGPA22;
	}
	public String getGotCGPA22() {
		return gotCGPA22;
	}
	public void setGotCGPA22(String gotCGPA22) {
		this.gotCGPA22 = gotCGPA22;
	}
	public String getExamname23() {
		return examname23;
	}
	public void setExamname23(String examname23) {
		this.examname23 = examname23;
	}
	public String getSub23() {
		return sub23;
	}
	public void setSub23(String sub23) {
		this.sub23 = sub23;
	}
	public String getYear23() {
		return year23;
	}
	public void setYear23(String year23) {
		this.year23 = year23;
	}
	public String getScore23() {
		return score23;
	}
	public void setScore23(String score23) {
		this.score23 = score23;
	}
	public String getRank23() {
		return rank23;
	}
	public void setRank23(String rank23) {
		this.rank23 = rank23;
	}
	public String getArea24() {
		return area24;
	}
	public void setArea24(String area24) {
		this.area24 = area24;
	}
	public String getYear24() {
		return year24;
	}
	public void setYear24(String year24) {
		this.year24 = year24;
	}
	public String getMarks24() {
		return marks24;
	}
	public void setMarks24(String marks24) {
		this.marks24 = marks24;
	}
	public Integer getScore24() {
		return score24;
	}
	public void setScore24(Integer score24) {
		this.score24 = score24;
	}
	public String getRank24() {
		return rank24;
	}
	public void setRank24(String rank24) {
		this.rank24 = rank24;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	
}