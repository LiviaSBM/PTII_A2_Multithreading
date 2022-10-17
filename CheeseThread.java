public class CheeseThread extends A2 implements Runnable{

//Thread of Cheese machine
    @Override
    public synchronized void run(){

        while (x>0){ //while there're still mice alive...
            
            if(x>0){
                cheese += 10; //add up 10g to cheese quantity
                System.out.println("[Action] Cheese Machine add 10 grams of cheese\n");
                System.out.println("[Status] cheese left: "+cheese+"\n"); //printing pattern
            }

            System.out.println("surviving mice "+x);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            
        }

    }
}
