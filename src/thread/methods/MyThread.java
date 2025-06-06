package thread.methods;

public class MyThread extends Thread {
	
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		int i=0;
		while(i<10) {
			i++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-priority"+Thread.currentThread().getPriority());
		}
	}
	
	public static void main(String[] args) {
		MyThread t1=new MyThread("thread1");
		MyThread t2=new MyThread("thread2");
		MyThread t3=new MyThread("thread3");
		
		t1.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
    
	
	
}
