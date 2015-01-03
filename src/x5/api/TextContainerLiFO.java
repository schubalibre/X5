package x5.api;

public class TextContainerLiFO implements TextContainer {
	
	private String[] queue;
	private int size, next=0, count=0, last=0;
	
	public TextContainerLiFO(){
		this(25);
	}
	
	public TextContainerLiFO(int size){
		this.size = size;
		queue = new String[size];
	}

	@Override
	public void enter(String s) {
		if (count>=size) 
			throw new FullException();
		
		queue[next] = s;
		next = (next+1) % size; // modulo
		count ++;

	}

	@Override
	public String remove() throws EmptyException {
		if (count==0) 
			throw new EmptyException();
		String s = queue[last];
		count --;
		last = (last+1)%size; // pos.
		return s;
	}

	@Override
	public boolean empty() {
		return count == 0;
	}

}
