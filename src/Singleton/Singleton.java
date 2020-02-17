package Singleton;

public class Singleton {

	private static Singleton firstInstance = null;
	
	Singleton(){}
	
	public static Singleton getInstance() {
		
		if(firstInstance == null){
			firstInstance = new Singleton();
		}
		
		return firstInstance;
	}
	
}
