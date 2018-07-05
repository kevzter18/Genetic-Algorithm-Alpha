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
    protected int preferredCourse[];
    protected ArrayList<String> load;
    protected ArrayList<Timeslot> preferredTimeslots;
       
    //constructor
        public Faculty(int faculty, String name, int units){
              this.faculty=faculty;
              this.name=name;
              this.units=units;
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


        public int[] getPreferredCourse() {
            return preferredCourse;
        }

        public ArrayList<Timeslot> getTimeslot() {
            return preferredTimeslots;
        }

    public void setLoad(ArrayList<String> load) {
        this.load = load;
    }

    public void setTimeslots(ArrayList<Timeslot> timeslots) {
        this.preferredTimeslots = timeslots;
    }

      

    }

