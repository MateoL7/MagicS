package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicSTest {
	
	private MagicS magicS;
	
	private void setupScenary1() {
		
	}
	private void setupScenary2() {
		magicS = new MagicS(3);
	}

	@Test
	void testMagicS() {
		setupScenary1();
		
		int pMode = 3;
		
		MagicS mS = new MagicS(pMode);
		
		assertNotNull("The new magic square is null", mS);
		assertTrue("The new magic square is not empty", mS.getSquare().length > 0);
	}
	
	@Test
	void testGetMagicS() {
		
	}

}
