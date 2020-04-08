package singleton.Static;

public class SingletonStatic {
	
	private static SingletonStatic obj = new SingletonStatic();

	private SingletonStatic() {
		
	   
	}

	public static SingletonStatic getObj() {
		return obj;
	}	

}
