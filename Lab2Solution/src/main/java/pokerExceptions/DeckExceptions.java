package pokerExceptions;

import pokerBase.Deck;

public class DeckExceptions extends Exception {
	private Deck d;
	public DeckExceptions(Deck d) {
		super();
		this.d = d;
	}
	public Deck getDeck() {
		return d;
	}
}
