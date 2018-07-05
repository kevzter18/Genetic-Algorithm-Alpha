/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithmdemo;

/**
 *
 * @author Kevin James T Kramer
 */
public class Course {
    
    	protected String courseID;
	protected String courseCode;
	protected int units;
	protected String courseType;// (ex. Lecture, Lab)

    public Course(String courseID, String courseCode, int units, String courseType) {
        this.courseID = courseID;
        this.courseCode = courseCode;
        this.units = units;
        this.courseType = courseType;
    }
    //GETTERS
    public String getCourseID() {
        return courseID;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getUnits() {
        return units;
    }

    public String getCourseType() {
        return courseType;
    }
    
    //SETTERS
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    
}
