//Student Name: Livia Menezes
//Student ID: 261066016

public class MiceThread extends A2 implements Runnable{
    
    @Override
    public synchronized void run(){
        boolean aliveMouse = true; //setting default alive mode to true
        int mouse = (int) miceList.remove(0); //once the method grabs one mouse from the current mice list, removes it from the list of available mice

        while (x>0 && aliveMouse){ //while the chosen mouse is still alive

            //Call Trap method - 50% chance of mouse getting caught
            aliveMouse = mouseFate(mouse); //getting result if mouse is alive or not

            if (x<=0){ //and if there's no more mouse alive
                    System.out.println("[Status] Total cheese lost: "+lostCheese); //print pattern
                } else if (x>0&&aliveMouse) {
                    mouseFeeding(mouse);//if mouse is still alive, call mouse feeding method
                } else {
                }
                try {
                    Thread.sleep(1000); //Run it every 1 sec
                } catch (InterruptedException e) {
                }
                        
        }
    }
}
