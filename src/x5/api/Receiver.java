package x5.api;

import cs101.lang.Animate;

/**
 * Schnittstelle für alle Empfünger.
 */
public interface Receiver extends Animate {
	
	/**
	 * Der Name des Empfängers.
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
