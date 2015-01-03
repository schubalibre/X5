package x5.api;
import java.util.*;

public class TextContainerQueue implements TextContainer {
	
	Queue<String> queue = new LinkedList<String>();

	@Override
	public void enter(String s) {
		queue.add(s);
	}

	@Override
	public String remove() throws EmptyException {
		return queue.remove();
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return queue.isEmpty();
	}

}
