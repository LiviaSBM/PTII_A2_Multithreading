//Student Name: Livia Menezes
//Student ID: 261066016

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A2 {
    public static int cheese= 10; //initial cheese quantity
    static int x = 5; //initial mice qty
    static int y = 3; //Initial qty of traps
    static int index = 1; //initial index
    static int lost_cheese = 0; //initial qty of lost cheese
    static List mice_list = new ArrayList(); //List of mouses
    static List dead_mice_list = new ArrayList(); //List of dead mouses

    public static void main(String[] args) {
        for (int a=0; a<x; a++){ //fulfilling the list of mouse
            mice_list.add(a+1);
        }

        MousesThread mousesthread = new MousesThread();
        Thread myThread = new Thread(mousesthread);

        myThread.start();
    }
}
