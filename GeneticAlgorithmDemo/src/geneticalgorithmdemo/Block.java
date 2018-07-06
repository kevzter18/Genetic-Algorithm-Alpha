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
public class Block {
    protected String blockID;
    protected ArrayList<Timeslot> timeslots;   // (contains offeringID)
    
    public Block(String blockID){
        this.blockID = blockID;
    }
    
    //GETTERS
    public String getBlockID(){
        return blockID;
    }
    
    public ArrayList<Timeslot> getTimeSlots(){
        return timeslots;
    }
    //SETTERS
    
    public void setBlockID(String newValue){
        this.blockID = newValue;
    }
    
    public void addBlockTimeslots(Timeslot newTimeslot){
        this.timeslots.add(newTimeslot);
    }
}
