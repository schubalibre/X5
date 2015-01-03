package x5.api;

import cs101.lang.Animate;

/**
 * Schnittstelle für alle Sender.
 */
public interface Sender extends Animate {
	
	/**
	 * Liefert den Namen eines Senders zurück.
	 * 
	 * @return Der Name.
	 */
	String getName();
	
	/**
	 * Methode die bei Animate aufgerufen wird.
	 * 
	 * */
	public void act();
}
