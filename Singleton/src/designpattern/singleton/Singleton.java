package designpattern.singleton;

public class Singleton {

	public static void main(String[] args) {
		
		ManagerSingleton m1 = ManagerSingleton.getInstance();
		ManagerSingleton m2 = ManagerSingleton.getInstance();
		ManagerSingleton m3 = ManagerSingleton.getInstance();
		ManagerSingleton m4 = ManagerSingleton.getInstance();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
	}

}
