//Student Name: Livia Menezes
//Student ID: 261066016

public class TrapsThread extends A2 implements Runnable{
    //Thread of Trap Cleaning action
    @Override
    public synchronized void run(){
        
        while (x>0){ //while there're still mice alive...
            if(deadMiceList.size()>0 && x>0){
                System.out.println("========================================================"); //printing pattern
                for (int j=0; j<deadMiceList.size();j++){ //Loop for printing the removal of the mice from traps
                    System.out.println("[Action] Store owner remove mouse-"+deadMiceList.get(j));
                    y ++; //Increment of available traps
                }
                deadMiceList.clear(); //zeroing out dead mouses list
                System.out.println ("========================================================\n"); //printing pattern
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
        
    }
}
