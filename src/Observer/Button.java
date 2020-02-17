package Observer;

public class Button {

	private OnClickListener onClickListener;
	
	public void setOnClickListener(OnClickListener onClickListener){
		this.onClickListener = onClickListener;
	}
	
	public void onClick(){
		//if(onClickListener!=null)
			onClickListener.onClick(this);
	}

}
