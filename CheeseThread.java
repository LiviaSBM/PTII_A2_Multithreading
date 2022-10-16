public class CheeseThread extends A2 implements Runnable{

//Thread of Cheese machine
    @Override
    public void run(){

        while (x>0){ //while there're still mice alive...
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            if(x>0){
                cheese += 10; //add up 10g to cheese quantity
                System.out.println("[Action] Cheese Machine add 10 grams of cheese");
                System.out.println("[Status] cheese left: "+cheese); //printing pattern
            }
            
        }

    }
}
