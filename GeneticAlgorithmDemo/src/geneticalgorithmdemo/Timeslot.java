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
public class Timeslot {
    //the Timeslot class has 2 fields
    protected int day;
    protected int time;
    
    // the Timeslot class has one constructor
    public Timeslot(int nDay, int nTime) {
        this.day = nDay;
        this.time = nTime;
        
    }
        
    // the Timeslot class has four methods
    public void setDay(int newValue) {
      this.day = newValue;
    }
        
    public void setTime(int newValue) {
      this.time = newValue;
    }
        
    public int getDay() {
    return day;
    }
        
    public int getTime() {
    return time;
    }
}
