/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithmdemo;

import java.util.ArrayList;

/**
 *
 * @author Kevin James T Kramer
 */
public class Room {
    
        protected String roomID;
	protected String roomCode;// (G102)
	protected String roomtype; //(Computer Lab, Lecture)
	// protected String location; (Taft, STC)
        protected ArrayList<Timeslot> timeslots;   // (contains offeringID)

   

    public Room(String roomID, String roomCode, String roomtype) {
        this.roomID = roomID;
        this.roomCode = roomCode;
        this.roomtype = roomtype;   
    }
    
    //GETTERS
    public String getRoomID() {
        return roomID;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public String getRoomtype() {
        return roomtype;
    }
  
    public ArrayList<Timeslot> getTimeslots() {
        return timeslots;
    }

    //SETTERS
    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public void setTimeslots(ArrayList<Timeslot> timeslots) {
        this.timeslots = timeslots;
    }

    
    
}
