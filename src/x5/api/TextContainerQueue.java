package x5.api;
import java.util.*;

public class TextContainerQueue implements TextContainer {
	
	List<String> queue = new ArrayList<String>();

	@Override
	public void enter(String s) {
		queue.add(s);
	}

	@Override
	public String remove() throws EmptyException {
		return queue.remove(0);
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return queue.isEmpty();
	}
	
	public static void main(String[] args) {
		TextContainer queue = new TextContainerQueue();
		queue.enter("1");
		queue.enter("2");
		queue.enter("3");
		
		try {
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
		} catch (EmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
