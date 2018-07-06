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
        Timeslot tempTimeslot;
        
        //Initializing Faculty 
        ArrayList<Faculty> facultyList = new ArrayList<>();
        Faculty tempFaculty;
        
        for(int i = 0; i<3; i++){
            switch (facultyList.size()){
                case 0: tempFaculty = new Faculty("151", "Solomon See", 12); 
                        tempFaculty.addPreferredCourses("INTROSE");
                        tempFaculty.addPreferredCourses("INTESYS");
                        tempFaculty.addPreferredCourses("DASALGO");
                        
                        for(int j = 0; j<3; j++){
                            switch(j){
                                case 0: tempTimeslot = new Timeslot(0,2);
                                        tempFaculty.addPreferredTimeslots(tempTimeslot); 
                                        break;
                                    
                                case 1: tempTimeslot = new Timeslot(1,2);
                                        tempFaculty.addPreferredTimeslots(tempTimeslot); 
                                        break;
                                case 2: tempTimeslot = new Timeslot(1,3);
                                        tempFaculty.addPreferredTimeslots(tempTimeslot);  
                                        break;
                            }
                        }
                        facultyList.add(tempFaculty);
                        break;
                    
                case 1: tempFaculty = new Faculty("150", "Ryan Dimaunahan", 12); 
                        tempFaculty.addPreferredCourses("OBJECTP");
                        tempFaculty.addPreferredCourses("INTESYS");
                        tempFaculty.addPreferredCourses("DASALGO");
                        
                        for(int j = 0; j<3; j++){
                            switch(j){
                                case 0: tempTimeslot = new Timeslot(0,2);
                                        tempFaculty.addPreferredTimeslots(tempTimeslot); 
                                        break;
                                    
                                case 1: tempTimeslot = new Timeslot(0,3);
                                        tempFaculty.addPreferredTimeslots(tempTimeslot); 
                                        break;
                                case 2: tempTimeslot = new Timeslot(1,5);
                                        tempFaculty.addPreferredTimeslots(tempTimeslot);  
                                        break;
                            }
                        }
                        facultyList.add(tempFaculty);
                        break;
                    
                case 2: tempFaculty = new Faculty("101", "Rafael Cabredo", 6); 
                        tempFaculty.addPreferredCourses("DASALGO");
                        tempFaculty.addPreferredCourses("OBJECTP");
                        
                        for(int j = 0; j<2; j++){
                            switch(j){
                                case 0: tempTimeslot = new Timeslot(0,3);
                                        tempFaculty.addPreferredTimeslots(tempTimeslot); 
                                        break;
                                    
                                case 1: tempTimeslot = new Timeslot(1,0);
                                        tempFaculty.addPreferredTimeslots(tempTimeslot); 
                                        break;  
                            }
                        }
                        facultyList.add(tempFaculty);
                        break;
            }
        }
        /* TEST PRINTING OF FACULTY LIST
        System.out.println(facultyList.get(0).getFacultyID());
        System.out.println(facultyList.get(0).getName());
        System.out.println(facultyList.get(0).getUnits());
          System.out.println(facultyList.get(0).getPreferredCourses().get(0));
          System.out.println(facultyList.get(0).getPreferredCourses().get(1));
          System.out.println(facultyList.get(0).getPreferredCourses().get(2));
            System.out.println(facultyList.get(0).getTimeslots().get(0).getDay());
            System.out.println(facultyList.get(0).getTimeslots().get(0).getTime());
            System.out.println(facultyList.get(0).getTimeslots().get(1).getDay());
            System.out.println(facultyList.get(0).getTimeslots().get(1).getTime());
            System.out.println(facultyList.get(0).getTimeslots().get(2).getDay());
            System.out.println(facultyList.get(0).getTimeslots().get(2).getTime());
        */
        //End of Initialization of Faculty
        
        //Initializing Courses
         ArrayList<Course> courseList = new ArrayList<Course>();
         Course tempCourse;
         
         for(int i = 0; i<4; i++){
            switch (courseList.size()){
                case 0:  tempCourse = new Course("1500", "OBJECTP", 3, "Laboratory"); 
                        courseList.add(tempCourse); break;
                case 1:  tempCourse = new Course("1515", "DASALGO", 3, "Lecture");
                        courseList.add(tempCourse); break;
                case 2:  tempCourse = new Course("1611", "INTROSE", 3, "Laboratory");
                        courseList.add(tempCourse); break;
                case 3:  tempCourse = new Course("1516", "INTESYS", 3, "Lecture");
                        courseList.add(tempCourse); break;
             }       
         }
         /* TEST PRINTING OF COURSE LIST
         System.out.println(courseList.size());
         System.out.println(courseList.get(0).getCourseCode());
         System.out.println(courseList.get(1).getCourseCode());
         System.out.println(courseList.get(2).getCourseCode());
         System.out.println(courseList.get(3).getCourseCode());
         */
         // End of Courses initialization
         
         //Initializing Rooms
          ArrayList<Room> roomList = new ArrayList<Room>();
          Room tempRoom;
          
          for(int i = 0; i<3; i++){
            switch (roomList.size()){
                case 0: tempRoom = new Room("021", "G301", "Laboratory");  
                        roomList.add(tempRoom);
                        break;
                case 1: tempRoom = new Room("022", "G401", "Lecture");  
                        roomList.add(tempRoom); break;
                case 2: tempRoom = new Room("023", "G403", "Lecture");  
                        roomList.add(tempRoom);  break;  
             }       
         }
          /*TEST PRINTING OF ROOM LIST
          System.out.println(roomList.size());
         System.out.println(roomList.get(0).getRoomCode());
         System.out.println(roomList.get(1).getRoomCode());
         System.out.println(roomList.get(2).getRoomCode());
          */
          //End of Room initialization
          
          //Initializing Blocks
          ArrayList<Block> blockList = new ArrayList<Block>();
          Block tempBlock;
          
           for(int i = 0; i<2; i++){
            switch (blockList.size()){
                case 0: tempBlock = new Block("S17");
                        blockList.add(tempBlock);
                        break;
                case 1: tempBlock = new Block("S18");
                        blockList.add(tempBlock);
                        break;
               
             }       
         }
         /*TEST PRINT OF BLOCK LIST
         System.out.println(blockList.size());
         System.out.println(blockList.get(0).getBlockID());
         System.out.println(blockList.get(1).getBlockID());
         */
          
           
         //GENERATING POPULATION 
         ArrayList<Offering> tempOffering;
         ArrayList<ArrayList<Offering>> population = new ArrayList<>();
        
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
