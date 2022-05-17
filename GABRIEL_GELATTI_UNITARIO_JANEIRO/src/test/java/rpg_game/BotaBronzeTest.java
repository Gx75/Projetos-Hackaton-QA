package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaBronzeTest {

	@Test
	public void testInicializacao() {
		BotaBronze botaPrata = new BotaBronze();
		assertEquals(botaPrata.getForca(), 1);
		assertEquals(botaPrata.getNomeBota(), "Bota bronze");
	}

}
