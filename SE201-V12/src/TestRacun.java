

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRacun {

	@Test
	void testTransfer() {
		System.out.println("Test I");
		Racun racun = new Racun("15-256-35", 250);
		//CentralniSistem.simulateFail = false;
		boolean result = racun.transfer("20-564-2", 550);
		boolean expResult = false;
		assertEquals(expResult, result);
	}

}
