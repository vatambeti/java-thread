package thread;

public class Test {

	
	public static void main(String[] args) {
		World w=new World();
		Runnable r1=()->{
			for(int i=0;i<1000;i++) {
				   System.out.println("World");
				   System.out.println(Thread.currentThread().getName());
			   }
		};
		Thread t1=new Thread(r1);
		t1.start();
		for(int i=0;i<1000;i++) {
		System.out.println("Hello world");
		System.out.println(Thread.currentThread().getName());
		}
	}
}
