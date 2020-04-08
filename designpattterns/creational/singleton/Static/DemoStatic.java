package creational.singleton.Static;

public class DemoStatic {

	public static void main(String[] args) {
		
		
		SingletonStatic Obj = SingletonStatic.getObj();
		System.out.println(Obj);
		System.out.println("-------------------------");
		SingletonStatic Obj1 = SingletonStatic.getObj();		
		System.out.println(Obj1);
		
	}

}
