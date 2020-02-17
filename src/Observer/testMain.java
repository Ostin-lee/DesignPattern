package Observer;

/*
 * 이벤트 객체 모델에 사용
 * 이벤트 발생 후 객체 외부에서 처리가 가능
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
