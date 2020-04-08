package singleton.lazy;

import singleton.Static.SingletonStatic;

public class DemoLazy {

	public static void main(String[] args) {

		SingletonStatic Obj = SingletonStatic.getObj();
		System.out.println(Obj);
		System.out.println("-------------------------");
		SingletonStatic Obj1 = SingletonStatic.getObj();		
		System.out.println(Obj1);
	}

}
