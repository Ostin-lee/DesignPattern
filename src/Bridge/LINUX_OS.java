package Bridge;

public class LINUX_OS implements JavaAPI {

	public void displayScreen() {
		System.out.println("Called LINUX's Kernel for Screen.");
	}

	public void beepSound() {
		System.out.println("Called LINUX's Kernel for Sound.");
	}

}
