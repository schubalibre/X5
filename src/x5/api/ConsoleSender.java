package x5.api;

import cs101.io.Console;
import cs101.lang.AnimatorThread;

/**
 * Implementierung eines Senders, der Nachrichten von der Console einliest und versendet.
 * 
 * @see Übung X5 Versuchsaufbau Schritt 3.
 */
public class ConsoleSender implements Sender {
	
	private final String name;
	
	private final TextContainer textContainer;
	
	public ConsoleSender(String name, TextContainer textContainer) {
		this.name = name;
		this.textContainer = textContainer;
		System.out.println(name + ": Bitte geben Sie einen Text ein und bestätigen Sie mit Enter:");
	}

	@Override
	public void act() {
		String text = Console.readln();
    	textContainer.enter(text);
    	System.out.println(name + ": Text gesendet... Weitere Eingabe:");
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
		ConsoleSender sender = new ConsoleSender("Test", textContainer);
		new AnimatorThread(sender).startExecution();
	}

}
