package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerExceptions.DeckExceptions;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if((eRank != eRank.JOKER) && (eSuit != eSuit.JOKER)) {
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
			 
		}
		Collections.shuffle(deckCards);
	}
	
	
	public Deck(int NbrOfJokers) {
		this(); 
		
		for(int i = 0; i < NbrOfJokers; i++) {
			deckCards.add(new Card(eSuit.JOKER, eRank.JOKER, 99));
		}
		Collections.shuffle(deckCards);
	}
	
	
	public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {
		this(NbrOfJokers);	
		for(Card dCard: deckCards) {
			for(Card WildCard : Wilds) {
				if((dCard.geteSuit() == WildCard.geteSuit()) && (dCard.geteRank() == WildCard.geteRank()))
				{
					dCard.setbWild(true);
				}
			}
		}
		Collections.shuffle(deckCards);
	}
	
	
	public Card Draw() throws DeckExceptions {
		if(deckCards.size()==0) {
			
			throw new DeckExceptions(this);
		}
		return deckCards.remove(0);
	}
	
	public int getTotalCards() {
		return deckCards.size();
	}
}
