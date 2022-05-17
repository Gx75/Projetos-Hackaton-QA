package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArqueiroTest {
	
	Arqueiro arqueiro;

	@Before
	public void setUp() {
		arqueiro = new Arqueiro("Legolas");
	}
	
	
	
	@Test
	public void testInicializacao() {
		assertEquals(arqueiro.getForca(), 5);
		assertEquals(arqueiro.getAgilidade(), 10);
		assertEquals(arqueiro.getInteligencia(), 5);
		assertEquals(arqueiro.getHp(), 250);
		assertEquals(arqueiro.getFuncao(), "Arqueiro");
		assertEquals(arqueiro.getNome(), "Legolas");
	}
	

	@Test
	public void testLvlUp() {
		arqueiro.lvlUp();
		assertEquals(arqueiro.getLevel(), 2);
		assertEquals(arqueiro.getForca(), 6);
		assertEquals(arqueiro.getAgilidade(), 13);
		assertEquals(arqueiro.getInteligencia(), 6);
	}
	

	@Test
	public void testAtaques() {
		assertEquals(arqueiro.ataque(), 8);
		assertEquals(arqueiro.ataque2(), 10);
	}

}
