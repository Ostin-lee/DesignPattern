package Observer;

/*
 * �̺�Ʈ ��ü �𵨿� ���
 * �̺�Ʈ �߻� �� ��ü �ܺο��� ó���� ����
 */

public class testMain implements OnClickListener {

	public static void main(String[] args) {
	
		Button btn = new Button();
		
		btn.setOnClickListener(new OnClickListener(){

			public void onClick(Button btn) {
				System.out.println(btn + " is clicked");
				
			}
			
		});
		
		btn.onClick();
		
	}

	public void onClick(Button btn) {
		// TODO Auto-generated method stub
		
	}

}
