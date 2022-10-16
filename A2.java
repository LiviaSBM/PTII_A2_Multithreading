//Student Name: Livia Menezes
//Student ID: 261066016

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A2 {
    static int cheese= 10; //initial cheese quantity
    static int x = 3; //initial mice qty
    static int y = 2; //Initial qty of traps
    //static int index = 0; //initial index
    static int lostCheese = 0; //initial qty of lost cheese
    //static List miceList = new ArrayList(); //AINDA NECESSARIO????????????????????????????????????????????????????
    //?????????????????????????????????
    static List deadMiceList = new ArrayList(); //List of dead mouses
    static List emptyList = new ArrayList();
    static Random liveordie = new Random();
    static int mousenumber = 1;


    public static boolean mouseFate(int mouse){
        boolean mousefate = liveordie.nextBoolean();

        if(!mousefate && y>0){ //If false && there're traps available, mouse is caught
            System.out.println("[Action] mouse-"+mouse+" get caught by trap\n");
            x--; //decrement of qty of mouses
            y--; //decrement of available traps
            deadMiceList.add(mouse);
            return mousefate;
        }
        return mousefate;
    }
        

    public static void mouseFeeding(int mouse){
        if (cheese<= 0 || x<=0){
        } else if (cheese>0 && cheese<=3){ //If there's less than 3g of cheese
        System.out.println("[Action] mouse-"+mouse+" eat "+cheese+" grams of cheese"); //only 1 rat gets to eat it
        lostCheese += cheese;
        cheese = 0; //cheese gets zeroed out
        System.out.println("[Status] cheese left: "+cheese+"\n");
        } else {
            System.out.println("[Action] mouse-"+mouse+" eat 3 grams of cheese");
                lostCheese += 3; //increment of lost cheese
                cheese -= 3; //cheese decrement
                System.out.println("[Status] cheese left: "+cheese+"\n");
        }
    }

    public static void main(String[] args) {
        
        MiceThread my_Thread = new MiceThread();
        // Thread mouseThread = new Thread(my_Thread);
        // mouseThread.start();

         for (int a=0; a<x; a++){
              Thread mouseThread = new Thread(my_Thread);
              mouseThread.start();
              mousenumber++;
          }

        CheeseThread my_cheeseThread = new CheeseThread();
        Thread cheesethread = new Thread(my_cheeseThread);
        cheesethread.start();

        TrapsThread my_trapThread = new TrapsThread();
        Thread trapsthread = new Thread(my_trapThread);
        trapsthread.start();


    }
}
