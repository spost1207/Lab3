package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerExceptions.DeckExceptions;
import pokerExceptions.HandExceptions;
import pokerEnums.eHandStrength;

public class Deck_Test {

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
	public void DeckBuildTest() throws DeckExceptions
	{
		int deck_size = 52;
		int deck_size_draw1 = 51;
		
		Deck d = new Deck();
		assertTrue(d.getTotalCards() == deck_size);
		
		d.Draw();
		
		assertTrue(d.getTotalCards() == deck_size_draw1);	
	}
}

