package creational.singleton.threadsafe;

import creational.singleton.Static.SingletonStatic;

public class DemoThread {

	public static void main(String[] args) {
		
		
		SingletonThreadSafe Obj = SingletonThreadSafe.getInstance();
		System.out.println(Obj);
		System.out.println("-------------------------");
		SingletonThreadSafe Obj1 = SingletonThreadSafe.getInstance();
		System.out.println(Obj1);
		
	}

}
