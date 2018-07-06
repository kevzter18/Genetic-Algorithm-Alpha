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
       this.facultyID = "000";
       this.roomID = "0000";
       this.fTimeslot = new Timeslot(9,9);
       this.sTimeslot = new Timeslot(9,9);
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
     
     public Timeslot getFTimeslot(){
         return fTimeslot;
     }
     
     public Timeslot getSTimeslot(){
         return sTimeslot;
     } 
     public boolean getIsFull(){

         if(!roomID.equals("0000") && !facultyID.equals("000") && sTimeslot.getDay() != 9 && sTimeslot.getTime() != 9 && fTimeslot.getDay() != 9 && fTimeslot.getTime() != 9){
          return true;
         }
        
         else
             return false;
         
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
