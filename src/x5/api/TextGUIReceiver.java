package x5.api;

import cs101.lang.AnimatorThread;

/**
 * Empfänger der prüft ob eine Nachricht vorliegt und diese über die {@link TextGUI} ausgibt.
 * 
 * @see Übung X5 Versuchsaufbau 4.
 */
public class TextGUIReceiver implements Receiver {
	
	private final String name;
	
	private final TextContainer textContainer;
	
	private final TextGUI gui;
	
	public TextGUIReceiver(String name, TextContainer textContainer) {
		this.name = name;
		this.textContainer = textContainer;
		this.gui = new TextGUI(name);
	}

	@Override
	public void act() {
		if (!textContainer.empty()) {
			try {
				String text = textContainer.remove();
				System.out.println(name + ": writing text '" + text + "' to gui");
				gui.write(text);
			} catch (EmptyException e) {
				System.err.println(name + ": Concurrent read exception... ");
				e.printStackTrace();
			}
		}
	}

	public String getName() {
		return name;
	}

	public TextContainer getTextContainer() {
		return textContainer;
	}
	
	// Nur zum Test
	public static void main(String[] args) {
		TextContainer textContainer = new TextContainerPrototype();
		textContainer.enter("Test text");
		textContainer.enter("hallo robert");
		
		TextGUIReceiver receiver = new TextGUIReceiver("Receiver 1", textContainer);
		new AnimatorThread(receiver).startExecution();
	}

}
