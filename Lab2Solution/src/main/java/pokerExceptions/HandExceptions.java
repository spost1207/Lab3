package pokerExceptions;

import pokerBase.Hand;

public class HandExceptions extends Exception {
	private Hand h;
	public HandExceptions(Hand h) {
		super();
		this.h = h;
	}
	
	public Hand getH() {
		return h;
	}
}
