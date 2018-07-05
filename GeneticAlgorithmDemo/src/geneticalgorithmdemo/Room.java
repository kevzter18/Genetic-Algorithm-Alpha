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
    
        protected int roomID;
	protected String roomCode;// (G102)
	protected int roomtype; //(Computer Lab, Lecture)
	protected String location; //(Taft, STC)
        protected ArrayList<Timeslot> timeslots;   // (contains offeringID)

   

    public Room(int roomID, String roomCode, int roomtype, String location) {
        this.roomID = roomID;
        this.roomCode = roomCode;
        this.roomtype = roomtype;
        this.location = location;
       
    }


    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public void setRoomtype(int roomtype) {
        this.roomtype = roomtype;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRoomID() {
        return roomID;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public int getRoomtype() {
        return roomtype;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Timeslot> getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(ArrayList<Timeslot> timeslots) {
        this.timeslots = timeslots;
    }

    
    
}
