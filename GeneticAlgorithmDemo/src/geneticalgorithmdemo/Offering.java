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
    
    protected int offeringID;
    protected int course; //Course ID
    protected int professor; //Professor ID
    protected int room; //Room ID
    protected Timeslot fTimeslot; //First Timeslot
    protected Timeslot sTimeslot; //Second Timeslot
    
    public Offering (int offeringID, int course) {
       this.offeringID = offeringID;
       this.course = course;
    }
    
    public void setProfessor(int professor){
        this.professor = professor;
    }
     public void setRoom(int room){
        this.room = room;
    }
     
    public void setFTimeslot (Timeslot fTimeslot){
        this.fTimeslot = fTimeslot;
    }
      public void setSTimeslot (Timeslot sTimeslot){
        this.sTimeslot = sTimeslot;
    }
    
}
