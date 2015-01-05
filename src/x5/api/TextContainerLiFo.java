package x5.api;

public class TextContainerLiFo implements TextContainer {
	
	private String[] stack;
	private int size, top = 0;
	
	public TextContainerLiFo(){
		this(25);
	}
	
	public TextContainerLiFo(int size){
		this.size = size;
		stack = new String[size];
	}

	@Override
	public void enter(String s) {
		if (top == size) 
			throw new FullException();
		
		stack[top] = s;
		top++;
	}

	@Override
	public String remove() throws EmptyException {
		if (top==0) 
			throw new FullException();
		
		top --;
		return stack[top];
	}

	@Override
	public boolean empty() {
		return top == 0;
	}

}
