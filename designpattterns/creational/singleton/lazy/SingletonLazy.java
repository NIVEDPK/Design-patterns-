package creational.singleton.lazy;

public class SingletonLazy {
	
	private static  SingletonLazy obj = null;

	private SingletonLazy() {
		
	   
	}

	public static SingletonLazy getObj() {
		if(obj==null) {
			obj = new SingletonLazy();
		}
		return obj;
	}	

}
