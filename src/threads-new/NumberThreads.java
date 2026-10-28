class NumberThread extends Thread {
    NumberThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread is running: " + Thread.currentThread().getName()+" : "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class NumberThreads{
    public static void  main(String[] args){
        NumberThread t1= new NumberThread("t1");
         NumberThread t2= new NumberThread("t2");
        t1.start();
        t2.start();
    }
}