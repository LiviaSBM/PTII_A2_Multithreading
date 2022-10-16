public class MousesThread extends A2 implements Runnable{
    
    @Override
    public void run(){

        for(int i=0; i<5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    System.out.println(cheese);

        


    }
}
