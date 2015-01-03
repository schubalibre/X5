package x5.api;

public interface TextContainer {
	
	public void enter(String s); // evtl. RuntimeException

	public String remove() throws EmptyException;

	public boolean empty();
}
