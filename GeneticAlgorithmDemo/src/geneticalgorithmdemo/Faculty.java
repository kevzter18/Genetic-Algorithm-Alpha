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
    protected ArrayList<String> load;
    protected int preferredCourse[];
    protected Timeslot timeslot;
       
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

        public Timeslot getTimeslot() {
            return timeslot;
        }

      

    }

