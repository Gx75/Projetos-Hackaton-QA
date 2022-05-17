package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MagoTest {
	
	Mago mago;

	@Before
	public void setUp() {
		mago = new Mago("Gandalf");
	}
	
	
	
	@Test
	public void testInicializacao() {
		assertEquals(mago.getForca(), 2);
		assertEquals(mago.getAgilidade(), 5);
		assertEquals(mago.getInteligencia(), 10);
		assertEquals(mago.getHp(), 150);
		assertEquals(mago.getFuncao(), "Mago");
		assertEquals(mago.getNome(), "Gandalf");
	}
	

	@Test
	public void testLvlUp() {
		mago.lvlUp();
		assertEquals(mago.getLevel(), 2);
		assertEquals(mago.getForca(), 3);
		assertEquals(mago.getAgilidade(), 6);
		assertEquals(mago.getInteligencia(), 13);
	}
	

	@Test
	public void testAtaques() {
		assertEquals(mago.ataque(), 5);
		assertEquals(mago.ataque2(), 6);
	}

}
