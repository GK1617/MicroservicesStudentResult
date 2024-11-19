package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    private String rollNumber;
    private String name;
    private int mathematicsMarks;
    private int englishMarks;
    private int scienceMarks;
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
    
}