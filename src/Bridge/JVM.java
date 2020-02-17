package Bridge;

public class JVM {
	
	public JavaAPI caller;
	
	public JVM(JavaAPI newcaller){
		caller = newcaller;
	}
	
	public void callkernelScreen(){
		caller.displayScreen();
	}
	
	public void callkernelSound(){
		caller.beepSound();
	}
	
}
