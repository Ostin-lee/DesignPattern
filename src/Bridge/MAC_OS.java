package Bridge;

public class MAC_OS implements JavaAPI {

	public void displayScreen() {
		System.out.println("Called MAC's Kernel for Screen.");
	}

	public void beepSound() {
		System.out.println("Called MAC's Kernel for Sound.");
	}

}
