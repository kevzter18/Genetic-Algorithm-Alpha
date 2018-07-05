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
    protected String professorID; //Professor ID
    protected String roomID; //Room ID
    protected Timeslot fTimeslot; //First Timeslot
    protected Timeslot sTimeslot; //Second Timeslot
    
    public Offering (String offeringID, String courseID) {
       this.offeringID = offeringID;
       this.courseID = courseID;
    }
    
    //GETTERS
    public String getOfferingID (){
        return offeringID;
    }
    
     public String getCourseID (){
        return courseID;
    }
     
    public String getProfessorID (){
        return professorID;
    }
    
     public String getRoomID (){
        return roomID;
    }
     
    //SETTERS
    public void setProfessor(String professorID){
        this.professorID = professorID;
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
