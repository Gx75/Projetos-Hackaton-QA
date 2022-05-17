package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaPrataTest {

	@Test
	public void testInicializacao() {
		BotaPrata botaPrata = new BotaPrata();
		assertEquals(botaPrata.getForca(), 2);
		assertEquals(botaPrata.getAgilidade(), 1);
		assertEquals(botaPrata.getInteligencia(), 1);
		assertEquals(botaPrata.getNomeBota(), "Bota prata");
	}

}
