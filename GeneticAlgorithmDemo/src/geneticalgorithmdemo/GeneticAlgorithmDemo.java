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
        
        Faculty professorA = new Faculty(151, "Solomon See", 12);
        Faculty professorB = new Faculty(150, "Ryan Dimaunahan", 9);
        Faculty professorC = new Faculty(101, "Rafael Cabredo", 6);
        
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
