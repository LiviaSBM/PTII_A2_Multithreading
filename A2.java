//Student Name: Livia Menezes
//Student ID: 261066016

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A2 {
    public static int cheese= 10; //initial cheese quantity
    static int x = 2; //initial mice qty
    static int y = 3; //Initial qty of traps
    //static int index = 0; //initial index
    static int lost_cheese = 0; //initial qty of lost cheese
    static List mice_list = new ArrayList(); //List of mouses
    static List dead_mice_list = new ArrayList(); //List of dead mouses


    public static void statusOfMouses(){

    }
        







    public static void main(String[] args) {
        for (int a=0; a<x; a++){ //fulfilling the list of mouse
            mice_list.add(a+1);
        }

        MousesThread my_Thread = new MousesThread();

        //CHAMAR NO STATUS?????????????????????????
        //for (int a=1; a<x+1; a++){
        //     Thread mouseThread = new Thread(my_Thread);
        //     mouseThread.start();
        // }

         CheeseThread my_cheeseThread = new CheeseThread();
         Thread cheesethread = new Thread(my_cheeseThread);
         cheesethread.start();

    }
}
