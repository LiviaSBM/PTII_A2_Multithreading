//Student Name: Livia Menezes
//Student ID: 261066016

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A2 {
    static int cheese= 10; //initial cheese quantity
    static int x = 5; //initial mice qty
    static int y = 3; //Initial qty of traps
    //static int index = 0; //initial index
    static int lostCheese = 0; //initial qty of lost cheese
    static List miceList = new ArrayList(); //Creation of mice list
    static List deadMiceList = new ArrayList(); //List of dead mouses
    static Random liveordie = new Random(); //Creation of random boolean for deciding the mouse's fate

    //METHOD FOR DEFINING IF MOUSE LIVES OR DIES
    public static synchronized boolean mouseFate(int mouse){
        boolean mousefate = liveordie.nextBoolean(); //Sorting the boolean

        if(!mousefate && y>0){ //If false && there're traps available, mouse is caught
            System.out.println("[Action] mouse-"+mouse+" get caught by trap\n");
            x--; //decrement of qty of mouses
            y--; //decrement of available traps
            deadMiceList.add(mouse); //adding dead mouse to dead mice list
            return mousefate; //returning boolean with the mouse's fate
        }
        return mousefate; //else, just return boolean with the mouse's fate
    }
        
    //METHOD FOR FEEDING THE MOUSE WITH AVAILABLE CHEESE
    public static synchronized void mouseFeeding(int mouse){
        if (cheese<= 0 || x<=0){ //If there's no cheese or no mouse alive, do nothing
        } else if (cheese>0 && cheese<=3){ //If there's less than 3g of cheese
        System.out.println("[Action] mouse-"+mouse+" eat "+cheese+" grams of cheese\n"); //only 1 rat gets to eat it
        lostCheese += cheese; //lost cheese increment
        cheese = 0; //cheese gets zeroed out
        System.out.println("[Status] cheese left: "+cheese+"\n");
        } else { //else (more than 3g), eat 3g
            System.out.println("[Action] mouse-"+mouse+" eat 3 grams of cheese\n");
                lostCheese += 3; //increment of lost cheese
                cheese -= 3; //cheese decrement
                System.out.println("[Status] cheese left: "+cheese+"\n");
        }
    }

    //MAIN METHOD FOR CALLING THREADS
    public static void main(String[] args) {
        
        MiceThread my_Thread = new MiceThread(); //Mouse Thread

        for (int a=0; a<x; a++){ //fulfilling the list of mice
            miceList.add(a+1);
        }

         for (int a=0; a<x; a++){ //running each mouse thread according to mice quantity
              Thread mouseThread = new Thread(my_Thread);
              mouseThread.start();
              
          }

        CheeseThread my_cheeseThread = new CheeseThread(); //Cheese thread for generating 10g of cheese each 2s
        Thread cheesethread = new Thread(my_cheeseThread);
        cheesethread.start(); //running cheese thread

        TrapsThread my_trapThread = new TrapsThread(); //thread for cleaning the traps every 5s
        Thread trapsthread = new Thread(my_trapThread);
        trapsthread.start(); //running trap cleaning thread


    }
}
