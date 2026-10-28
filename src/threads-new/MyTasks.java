class MyTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }   
}
public class MyTasks{
    public static void main(String[] args){
        MyTask t1= new MyTask();
        Thread thread = new Thread(t1);
        thread.start();
    }
}