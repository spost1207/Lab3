package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Hand_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		

	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestRoyalFlush() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.JACK,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.KING,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.RoyalFlush.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.ACE.getiRankNbr());
		
	}
	@Test
	public void TestStraightFlush() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.JACK,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.KING,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.NINE,1));
		
		try {
			h.EvaulateHand();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(h.getHs().getHandStrength());
		
		assertTrue(h.getHs().getHandStrength() == eHandStrength.StraightFlush.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.KING.getiRankNbr());
	} 
	
	@Test
	public void FiveOfAKind() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		
		try {
			h.EvaulateHand();
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertTrue(h.getHs().getHandStrength() == eHandStrength.FiveOfAKind.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.TEN.getiRankNbr());
	}
	
	
	@Test
	public void Test1FourOfAKind() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.ACE,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,1));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.FourOfAKind.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.TEN.getiRankNbr());
		
	} 
	
	@Test
	public void Test2FourOfAKind() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.NINE,0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		assertTrue(h.getHs().getHandStrength() == eHandStrength.FourOfAKind.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.TEN.getiRankNbr());
	}
	
	@Test
	public void Test1FullHouse() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TWO,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO,0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength() == eHandStrength.FullHouse.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.TWO.getiRankNbr());
		assertTrue(h.getHs().getLoHand() == eRank.TEN.getiRankNbr());
		
	}
	
	@Test 
	public void TestFullHouse2() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TWO,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO,0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength() == eHandStrength.FullHouse.getHandStrength());
		assertTrue(h.getHs().getHiHand() == eRank.TEN.getiRankNbr());
		assertTrue(h.getHs().getLoHand() == eRank.TWO.getiRankNbr());
	}
	
	@Test
	public void TestFlush() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TEN, 0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.JACK, 0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.QUEEN, 0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.KING, 0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.TWO, 0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength() == eHandStrength.Flush.getHandStrength());
		assertTrue(h.getHs().getHiHand()==eRank.KING.getiRankNbr());
		assertTrue(h.getHs().getLoHand()==0);
	}
	
	@Test
	public void TestStraight() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.SEVEN, 0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.EIGHT, 0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.NINE, 0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TEN, 0));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.JACK, 0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength() == eHandStrength.Straight.getHandStrength());
		assertTrue(h.getHs().getHiHand()==eRank.JACK.getiRankNbr());	
	}
	
	@Test
	public void Test1ThreeOfAKind() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.NINE, 0));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.SIX, 0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.THREE, 0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.THREE, 0));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength()== eHandStrength.ThreeOfAKind.getHandStrength());
		assertTrue(h.getHs().getHiHand()==eRank.THREE.getiRankNbr());
	}

	@Test
	public void Test2ThreeOfAKind() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.TEN, 0));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.TEN, 0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.TEN, 0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.FOUR, 0));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.THREE, 0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength()== eHandStrength.ThreeOfAKind.getHandStrength());
		assertTrue(h.getHs().getHiHand()==eRank.TEN.getiRankNbr());
	}
	
	@Test
	public void Test3ThreeOfAKind() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.HEARTS, eRank.SEVEN, 0));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.SIX, 0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS, eRank.SIX, 0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS, eRank.SIX, 0));
		h.AddToCardsInHand(new Card(eSuit.SPADES, eRank.JACK, 0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength()== eHandStrength.ThreeOfAKind.getHandStrength());
		assertTrue(h.getHs().getHiHand()==eRank.SIX.getiRankNbr());
	}
	
	@Test
	public void Test1isTwoPair() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS,eRank.TEN,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES,eRank.TWO,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS,eRank.TWO,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.ACE,0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength()== eHandStrength.TwoPair.getHandStrength());
		assertTrue(h.getHs().getHiHand()==eRank.TEN.getiRankNbr());
	}
	
	@Test
	public void Test2isTwoPair() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.TWO,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS,eRank.TWO,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES,eRank.FOUR,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS,eRank.EIGHT,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.EIGHT,0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength()== eHandStrength.TwoPair.getHandStrength());
		assertTrue(h.getHs().getHiHand()==eRank.EIGHT.getiRankNbr());
	}
	
	@Test
	public void Test3isTwoPair() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.KING,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS,eRank.THREE,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES,eRank.THREE,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS,eRank.JACK,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.JACK,0));
		
		try {
			h = Hand.EvaluateHand(h);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertTrue(h.getHs().getHandStrength()== eHandStrength.TwoPair.getHandStrength());
		assertTrue(h.getHs().getHiHand()==eRank.JACK.getiRankNbr());
	}
	
	@Test
	public void TestisPair() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.KING,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS,eRank.KING,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES,eRank.THREE,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS,eRank.QUEEN,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.JACK,0));
		
	try {
		h = Hand.EvaluateHand(h);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	assertTrue(h.getHs().getHandStrength()== eHandStrength.Pair.getHandStrength());
	assertTrue(h.getHs().getHiHand()==eRank.KING.getiRankNbr());
	}
	
	@Test
	public void Test2isPair() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.THREE,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS,eRank.KING,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES,eRank.KING,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS,eRank.QUEEN,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.JACK,0));
		
	try {
		h = Hand.EvaluateHand(h);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	assertTrue(h.getHs().getHandStrength()== eHandStrength.Pair.getHandStrength());
	assertTrue(h.getHs().getHiHand()==eRank.KING.getiRankNbr());
}
	@Test
	public void Test3isPair() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.THREE,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS,eRank.QUEEN,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES,eRank.KING,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS,eRank.KING,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.JACK,0));
		
	try {
		h = Hand.EvaluateHand(h);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	assertTrue(h.getHs().getHandStrength()== eHandStrength.Pair.getHandStrength());
	assertTrue(h.getHs().getHiHand()==eRank.KING.getiRankNbr());
}
	@Test
	public void Test4isPair() {
		Hand h = new Hand();
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.JACK,0));
		h.AddToCardsInHand(new Card(eSuit.DIAMONDS,eRank.THREE,0));
		h.AddToCardsInHand(new Card(eSuit.SPADES,eRank.QUEEN,0));
		h.AddToCardsInHand(new Card(eSuit.HEARTS,eRank.KING,0));
		h.AddToCardsInHand(new Card(eSuit.CLUBS,eRank.KING,0));
		
	try {
		h = Hand.EvaluateHand(h);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	assertTrue(h.getHs().getHandStrength()== eHandStrength.Pair.getHandStrength());
	assertTrue(h.getHs().getHiHand()==eRank.KING.getiRankNbr());
}
	}
