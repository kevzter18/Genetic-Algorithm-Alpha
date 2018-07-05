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
public class Faculty {
    
    protected String facultyID;
    protected String name;
    protected int units;
    protected ArrayList<String> load;
    protected ArrayList<String> preferredCourse;
    protected ArrayList<Timeslot> preferredTimeslots;
       
    //constructor
        public Faculty(String facultyID, String name, int units){
              this.facultyID=facultyID;
              this.name=name;
              this.units=units;
              this.preferredCourse = new ArrayList<String>();
              this.preferredTimeslots = new ArrayList<Timeslot>(); 
         }
   
        //GETTERS
        
        public String getFaculty() {
            return facultyID;
        }
        public String getName() {
            return name;
        }
        public int getUnits() {
            return units;
        }
        public ArrayList<String> getLoad() {
            return load;
        }
        public ArrayList<String> getPreferredCourses() {
            return preferredCourse;
        }
          public ArrayList<Timeslot> getTimeslot() {
            return preferredTimeslots;
        }
          
        //SETTERS
        public void setFaculty(String facultyID) {
            this.facultyID = facultyID;
        }

        
        public void setName(String name) {
            this.name = name;
        }

        
        public void setUnits(int units) {
            this.units = units;
        }

       
        public void setLoad(ArrayList<String> load) {
        this.load = load;
        }
        
    
        public void addPreferredCourses(String pCourse){
             this.preferredCourse.add(pCourse);
        }

      
        
        public void addPreferredTimeslots(Timeslot timeslots) {
        this.preferredTimeslots.add(timeslots);
        }

      

    }

