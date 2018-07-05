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
    
    protected int faculty;
    protected String name;
    protected int units;
    protected ArrayList<String> preferredCourse;
    protected ArrayList<String> load;
    protected ArrayList<Timeslot> preferredTimeslots;
       
    //constructor
        public Faculty(int faculty, String name, int units){
              this.faculty=faculty;
              this.name=name;
              this.units=units;
              this.preferredCourse = new ArrayList<String>();
              this.preferredTimeslots = new ArrayList<Timeslot>(); 
         }
   
        
        public int getFaculty() {
            return faculty;
        }

        public void setFaculty(int faculty) {
            this.faculty = faculty;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getUnits() {
            return units;
        }

        public void setUnits(int units) {
            this.units = units;
        }

        public ArrayList<String> getLoad() {
            return load;
        }

        public void setLoad(ArrayList<String> load) {
        this.load = load;
        }
        
        public ArrayList<String> getPreferredCourses() {
            return preferredCourse;
        }
        
        public void addPreferredCourses(String pCourse){
             this.preferredCourse.add(pCourse);
        }

        public ArrayList<Timeslot> getTimeslot() {
            return preferredTimeslots;
        }
        
        public void addPreferredTimeslots(Timeslot timeslots) {
        this.preferredTimeslots.add(timeslots);
        }

      

    }

