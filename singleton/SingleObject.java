package singleton;

public class SingleObject {

	
	public static SingleObject instance;
	
	private SingleObject() {};
	
	public static SingleObject getInstance() {
		if(instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}
	public void showMessage() {
		System.out.println("Hello world");
	}
		
}

