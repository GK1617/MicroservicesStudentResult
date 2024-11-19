package model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "results")
public class Result {
    @Id
    private String rollNumber;
    private String studentName;
    private int mathematicsMarks;
    private int englishMarks;
    private int scienceMarks;
    private double average;
    private String status;
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMathematicsMarks() {
		return mathematicsMarks;
	}
	public void setMathematicsMarks(int mathematicsMarks) {
		this.mathematicsMarks = mathematicsMarks;
	}
	public int getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	public int getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	} 
    
    
    
}