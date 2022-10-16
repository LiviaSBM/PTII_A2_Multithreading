public class MiceThread extends A2 implements Runnable{
    
    @Override
    public void run(){
        boolean aliveMouse = true;
        int mouse = 1;

        while (x>0 && aliveMouse){ //while there's still mouses alive
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            //Call Trap method - 50% chance of mouse getting caught
            aliveMouse = mouseFate(mouse); //getting result if mouse is alive or not

            if (x<=0){ //and if there's no more mouse alive
                    System.out.println("Total cheese lost: "+lostCheese); //print pattern
                } else if (x>0&&aliveMouse) {
                    mouseFeeding(mouse);//if mouse is still alive, call mouse feeding method
                } else {
                }
                        
        }
    }
}
