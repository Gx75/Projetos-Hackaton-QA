package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GuerreiroTest {
	
	Guerreiro guerreiro;

	@Before
	public void setUp() {
		guerreiro = new Guerreiro("Aragorn");
	}
	
	
	
	@Test
	public void testInicializacao() {
		assertEquals(guerreiro.getForca(), 10);
		assertEquals(guerreiro.getAgilidade(), 5);
		assertEquals(guerreiro.getInteligencia(), 2);
		assertEquals(guerreiro.getHp(), 300);
		assertEquals(guerreiro.getFuncao(), "Guerreiro");
		assertEquals(guerreiro.getNome(), "Aragorn");
	}
	

	@Test
	public void testLvlUp() {
		guerreiro.lvlUp();
		assertEquals(guerreiro.getLevel(), 2);
		assertEquals(guerreiro.getForca(), 13);
		assertEquals(guerreiro.getAgilidade(), 6);
		assertEquals(guerreiro.getInteligencia(), 3);
	}
	

	@Test
	public void testAtaques() {
		assertEquals(guerreiro.ataque(), 12);
		assertEquals(guerreiro.ataque2(), 18);
	}

}
