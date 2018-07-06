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
          ArrayList<Block> blockList = new ArrayList<>();
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
          
           
         //Initializating Offerings
         ArrayList<ArrayList<Offering>> population = new ArrayList<>();
         ArrayList<Offering> tempOfferingList;
         Offering tempOffering;
         
        for (int i = 0; i < 100; i++){
            tempOfferingList = new ArrayList<>();
             for(int j = 0; j<8; j++){
             switch(tempOfferingList.size()){
                 case 0: tempOffering = new Offering("1000", "1500", "S17");
                         tempOfferingList.add(tempOffering);
                        break;
                 case 1: tempOffering = new Offering("1001", "1500", "S18");
                         tempOfferingList.add(tempOffering);
                        break;
                 case 2: tempOffering = new Offering("1002", "1515", "S17");
                         tempOfferingList.add(tempOffering);
                        break;
                 case 3: tempOffering = new Offering("1003", "1515", "S18");
                         tempOfferingList.add(tempOffering);
                        break;
                 case 4: tempOffering = new Offering("1004", "1611", "S17");
                         tempOfferingList.add(tempOffering);
                        break;
                 case 5: tempOffering = new Offering("1005", "1611", "S18");
                         tempOfferingList.add(tempOffering);
                        break;
                 case 6: tempOffering = new Offering("1006", "1516", "S17");
                         tempOfferingList.add(tempOffering);
                        break;
                 case 7: tempOffering = new Offering("1007", "1516", "S18");
                         tempOfferingList.add(tempOffering);
                        break;   
             }  
         }
            population.add(tempOfferingList);
        }
        /*TEST PRINTING OF OFFERINGS 
        System.out.println(population.size());
        System.out.println(population.get(0).get(0).getCourseID());
        System.out.println(population.get(0).get(1).getCourseID());
        System.out.println(population.get(0).get(2).getCourseID());
        System.out.println(population.get(1).get(1).getCourseID());
        */
        //End of Initialization
        
        //Generating Population
        for (int i = 0; i<100; i++){
            populate(population.get(i), blockList, roomList, facultyList, courseList);
        }
         
    }
    public static void  populate(ArrayList<Offering> member, ArrayList<Block> blocks, ArrayList<Room> rooms, ArrayList<Faculty> faculty, ArrayList<Course> courses){
      int lowestUnits = 0;
      int lowestLoad = 0;
      int count = 0;
      while(member.get(0).getIsFull() != true && member.get(1).getIsFull() != true && member.get(2).getIsFull() != true && member.get(3).getIsFull() != true && member.get(4).getIsFull() != true && member.get(5).getIsFull() != true && member.get(6).getIsFull() != true && member.get(7).getIsFull() != true){
          //Choose a faculty member
           System.out.println("monkey");
          for(int i = 0; i<3; i++){
              for(int j = 0; j<lowestLoad; j++){
                  
              }
          }
         
    }
    }
    public double fitnessFunction(ArrayList<Offering> member){
       double test =  50.4;
        return test;
    }
    public static void sortPopulation (ArrayList<ArrayList<Offering>> population){
        
    }
    
    public void selectParent (ArrayList<ArrayList<Offering>> population){
        //made it void so it wouldn't be annoying 
    }
    
  
}
