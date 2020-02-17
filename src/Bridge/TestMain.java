package Bridge;

public class TestMain {

	public static void main(String[] args) {
		
		JVM jvm = new JVM(new LINUX_OS());
		jvm.callkernelScreen();
		jvm.callkernelSound();
		
		jvm = new JVM(new MAC_OS());
		jvm.callkernelScreen();
		jvm.callkernelSound();
		
		jvm = new JVM(new WINDOW_OS());
		jvm.callkernelScreen();
		jvm.callkernelSound();
		
	}

}
