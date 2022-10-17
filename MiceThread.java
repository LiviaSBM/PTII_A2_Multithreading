public class MiceThread extends A2 implements Runnable{
    
    @Override
    public synchronized void run(){
        boolean aliveMouse = true;
        int mouse = (int) miceList.remove(0);
        System.out.println("MOUSE NUMBER: "+mouse);

        while (x>0 && aliveMouse){ //while there's still mouses alive
            
            System.out.println("Alive mouse? "+aliveMouse);
            //Call Trap method - 50% chance of mouse getting caught
            aliveMouse = mouseFate(mouse); //getting result if mouse is alive or not

            if (x<=0){ //and if there's no more mouse alive
                    System.out.println("Total cheese lost: "+lostCheese); //print pattern
                } else if (x>0&&aliveMouse) {
                    mouseFeeding(mouse);//if mouse is still alive, call mouse feeding method
                } else {
                    System.out.println("Alive mouse 2? "+aliveMouse);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                        
        }
    }
}
