public class CheeseThread extends A2 implements Runnable{


    @Override
    public void run(){

        while (x>0){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            cheese += 10;
            System.out.println("[Action] Cheese Machine add 10 grams of cheese");
            System.out.println("[Status] cheese left: "+cheese);
        }

    }
}
