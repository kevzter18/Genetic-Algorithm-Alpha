/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithmdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Kevin James T Kramer
 */
public class GeneticAlgorithmDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initializing Faculty members
        ArrayList<Faculty> facultyList = new ArrayList<Faculty>();
       

        
        //Adding Sir Solomon See
        Faculty professorA = new Faculty("151", "Solomon See", 12);
        professorA.addPreferredCourses("INTROSE");
        professorA.addPreferredCourses("INTESYS");
        professorA.addPreferredCourses("DASALGO");

        for(int i = 0; i<3; i++){
             Timeslot pTimeslot = new Timeslot(i, i); //Used to transfer to pTimeslot
           
             professorA.addPreferredTimeslots(pTimeslot);
        }
  
        
        //Test Print of data
        System.out.println(professorA.getFaculty());
        System.out.println(professorA.getName());
        System.out.println(professorA.getUnits());
        System.out.println(professorA.getPreferredCourses().get(0));
        System.out.println(professorA.getPreferredCourses().get(1));
        System.out.println(professorA.getPreferredCourses().get(2));
         
        System.out.println(professorA.getTimeslot().get(0).getDay());
        System.out.println(professorA.getTimeslot().get(0).getTime());
        System.out.println(professorA.getTimeslot().get(1).getDay());
        System.out.println(professorA.getTimeslot().get(1).getTime());
         System.out.println(professorA.getTimeslot().get(2).getDay());
        System.out.println(professorA.getTimeslot().get(2).getTime());
        //Adding Sir Ryan Dimaunahan
        Faculty professorB = new Faculty("150", "Ryan Dimaunahan", 12);

        Faculty professorC = new Faculty("101", "Rafael Cabredo", 6);
        
        facultyList.add(professorA);
        facultyList.add(professorB);
        facultyList.add(professorC);
        //End of Faculty initialization
        
        
        ArrayList<Course> courseList = new ArrayList<Course>();
        ArrayList<Room> roomList = new ArrayList<Room>();
        
    }
    
    public double fitnessFunction(ArrayList<Offering> member){
       double test =  50.4;
        return test;
    }
    public void sortPopulation (ArrayList<ArrayList<Offering>> population){
        
    }
    
    public void selectParent (ArrayList<ArrayList<Offering>> population){
        //made it void so it wouldn't be annoying 
    }
    
  
}
