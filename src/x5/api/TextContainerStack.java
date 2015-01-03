package x5.api;
import java.util.*;

public class TextContainerStack implements TextContainer {
	
	Stack<String> stack = new Stack<String>();

	@Override
	public void enter(String s) {
		stack.add(s);
	}

	@Override
	public String remove() throws EmptyException {
		// TODO Auto-generated method stub
		return stack.pop();
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return stack.empty();
	}

}
