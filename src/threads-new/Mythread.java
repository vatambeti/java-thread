class Mythreads extends Thread{

    Mythreads(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            try{
          System.out.println("Child thread is running:"+" : "+Thread.currentThread().getName()+": "+i);
          Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
                break;
            }
        }
       
    }   
}
public class Mythread{
    public static void main(String[] args) throws InterruptedException{
       
       Mythreads t1 = new Mythreads("t1");

        // System.out.println("Before start: " + t1.isAlive());

        // t1.start();

        // System.out.println("After start: " + t1.isAlive());
        // t1.interrupt();

        // t1.join();

        // System.out.println("After join: " + t1.isAlive());
        // t1.join();
        // t1.setName("Child Thread");
        // System.out.println("Thread name: " + t1.getName());

        t1.start();

        Thread.sleep(1000);

        t1.interrupt();

        t1.join();
         System.out.println("Main completed");
    }
}