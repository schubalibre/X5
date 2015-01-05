package x5;

import cs101.lang.AnimatorThread;
import x5.api.*;

/**
 * Startet den Versuchsaufbau.
 * 
 * @author Inga Schwarze
 */
public class Main {
	
	public static void main(String[] args) {
		startOneSenderAndOneReceiver();
	}
	
	/**
	 * Einfacher Versuchsaufbau mit einem Sender und Empfänger.
	 */
	private static void startOneSenderAndOneReceiver() {
		final TextContainer queue = new TextContainerQueue();
		Sender sender = new ConsoleSender("Sender 1", queue);
		
		Receiver receiver = new TextGUIReceiver("Receiver 1", queue);
		
		AnimatorThread senderThread = new AnimatorThread(sender);
		senderThread.startExecution();
		AnimatorThread receiverThread = new AnimatorThread(receiver);
		receiverThread.startExecution();
		receiverThread.setSleepRange(5000);
		
	}
	
	/**
	 * Einfacher Versuchsaufbau mit einem Sender und zwei Empfängern.
	 */
	private static void startOneSenderAndTwoReceiver() {
		final TextContainer queue = new TextContainerQueue();
		Sender sender = new ConsoleSender("Sender 1", queue);
		Receiver receiver1 = new TextGUIReceiver("Receiver 1", queue);
		Receiver receiver2 = new TextGUIReceiver("Receiver 2", queue);
		
		new AnimatorThread(sender).startExecution();
		new AnimatorThread(receiver1).startExecution();
		new AnimatorThread(receiver2).startExecution();
	}

}
