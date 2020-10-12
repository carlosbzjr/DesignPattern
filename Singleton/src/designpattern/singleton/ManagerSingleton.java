package designpattern.singleton;

public class ManagerSingleton {

	private static ManagerSingleton managerSingleton = null;

	private ManagerSingleton() {
	}
	
	public static ManagerSingleton getInstance() {
		if(managerSingleton == null) {
			managerSingleton = new ManagerSingleton();
		}
		return managerSingleton;
	}

}
