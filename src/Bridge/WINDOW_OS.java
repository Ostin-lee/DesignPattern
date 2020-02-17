package Bridge;

public class WINDOW_OS implements JavaAPI {

	public void displayScreen() {
		System.out.println("Called WINDOW's Kernel for Screen.");
	}

	public void beepSound() {
		System.out.println("Called WINDOW's Kernel for Sound.");
	}

}
