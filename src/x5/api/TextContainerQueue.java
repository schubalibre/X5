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

}
