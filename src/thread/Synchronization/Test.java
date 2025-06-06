package thread.Synchronization;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
	
	public static void main(String[] args) {
	Map<String,Integer> conMap=new HashMap<>();
	conMap.put("count", 0);
	Runnable r1=()->{
		for(int i=0;i<100;i++) {
			conMap.compute("count", (key,value)->value+1);
		}
	};
	
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r1);
	
	t1.start();
	t2.start();
	
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("count value in hashmap"+conMap.get("count"));
	
	
	
	
	
	}
	

}
