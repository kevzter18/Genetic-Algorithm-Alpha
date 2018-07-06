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
public class Offering {
    
    protected String offeringID;
    protected String courseID; //Course ID
    protected String blockID;
    protected String facultyID; //Professor ID
    protected String roomID; //Room ID
    protected Timeslot fTimeslot; //First Timeslot
    protected Timeslot sTimeslot; //Second Timeslot
    
    public Offering (String offeringID, String courseID, String blockID) {
       this.offeringID = offeringID;
       this.courseID = courseID;
       this.blockID = blockID;
    }
    
    //GETTERS
    public String getOfferingID (){
        return offeringID;
    }
    
    public String getBlockID (){
        return offeringID;
    }
    
     public String getCourseID (){
        return courseID;
    }
     
    public String getFacultyID (){
        return facultyID;
    }
    
     public String getRoomID (){
        return roomID;
    }
     
    //SETTERS
    public void setFacultyID(String professorID){
        this.facultyID = professorID;
    }
     public void setRoom(String roomID){
        this.roomID = roomID;
    }
     
    public void setFTimeslot (Timeslot fTimeslot){
        this.fTimeslot = fTimeslot;
    }
      public void setSTimeslot (Timeslot sTimeslot){
        this.sTimeslot = sTimeslot;
    }
    
}
