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
public class Room {
    
        protected int roomID;
	protected String roomCode;// (G102)
	protected int roomtype; //(Computer Lab, Lecture)
	protected String location; //(Taft, STC)
        protected int Timeslot;// (contains offeringID)

   

    public Room(int roomID, String roomCode, int roomtype, String location, int Timeslot) {
        this.roomID = roomID;
        this.roomCode = roomCode;
        this.roomtype = roomtype;
        this.location = location;
        this.Timeslot = Timeslot;
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

    public int getTimeslot() {
        return Timeslot;
    }
	 public void setTimeslot(int Timeslot) {
        this.Timeslot = Timeslot;
    }
    
}
