package Adapter;

public class TestMain {

	public static void main(String[] args) {
		
		Adaptor adaptor = new High_ver();
		adaptor.call_Low_A_Function();
		adaptor.call_Low_B_Function();
		
	}
}
