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
    public int day;
    public int time;
    
    // the Timeslot class has one constructor
    public Timeslot(int nDay, int nTime) {
        day = nDay;
        time = nTime;
        
    }
        
    // the Timeslot class has four methods
    public void setDay(int newValue) {
      day = newValue;
    }
        
    public void setTime(int newValue) {
      time = newValue;
    }
        
    public int getDay() {
    return day;
    }
        
    public int getTime() {
    return time;
    }
}
