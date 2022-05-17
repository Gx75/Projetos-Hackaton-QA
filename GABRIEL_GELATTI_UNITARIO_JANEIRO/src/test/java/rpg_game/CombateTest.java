package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CombateTest {

	Combate combate;
	Personagem persona1Mock;
	Personagem persona2Mock;

	@Before
	public void setUp()  {
		combate = new Combate();
		persona1Mock = Mockito.mock(Personagem.class);
		persona2Mock = Mockito.mock(Personagem.class);
	}

	@Test
	public void testLutaCorporal() {
		Personagem persona2 = new Personagem();
		int persona2HP = persona2.getHp();
		Mockito.when(persona1Mock.ataque()).thenReturn(10);
		
		combate.lutaCorporal(persona1Mock, persona2);
		
		assertEquals(persona2.getHp(), persona2HP - 10);
	}

	@Test
	public void testEmbateXadrezVitoriaPersona1() {
		String resultado;
		Mockito.when(persona1Mock.getInteligencia()).thenReturn(10);
		Mockito.when(persona1Mock.getNome()).thenReturn("Joao");
		Mockito.when(persona2Mock.getInteligencia()).thenReturn(0);
		
		resultado = combate.embateXadrez(persona1Mock, persona2Mock);
		
		assertEquals(resultado, "Joao ganhou");
	}

	@Test
	public void testEmbateXadrezEmpate() {
		String resultado;
		Mockito.when(persona1Mock.getInteligencia()).thenReturn(5);
		Mockito.when(persona2Mock.getInteligencia()).thenReturn(5);
		
		resultado = combate.embateXadrez(persona1Mock, persona2Mock);
		
		assertEquals(resultado, "Disputa no cara ou coroa");
	}

	@Test
	public void testEmbateXadrezVitoriaPersona2() {
		String resultado;
		Mockito.when(persona1Mock.getInteligencia()).thenReturn(0);
		Mockito.when(persona2Mock.getInteligencia()).thenReturn(10);
		Mockito.when(persona2Mock.getNome()).thenReturn("Maria");
		
		resultado = combate.embateXadrez(persona1Mock, persona2Mock);
		
		assertEquals(resultado, "Maria ganhou");
	}

}
