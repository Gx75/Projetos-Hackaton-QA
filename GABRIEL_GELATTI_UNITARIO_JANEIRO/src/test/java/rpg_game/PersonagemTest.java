package rpg_game;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class PersonagemTest {
	
	/*
	 * Ao equipar no personagem uma bota com atributos maiores que 0
	 * os gets dos atributos afetados por ela apresentam valores que 
	 * seriam errados em um jogo rpg normal (nao sao valorPersonagem+valorBota), 
	 * porem como nao tenho os requisitos deste projeto eu nao tenho
	 * como saber se isso seria algo intencional ou um bug
	 */
	
	Personagem personagem;

	@Before
	public void setUp() {
		personagem = new Personagem();
	}

	@Test
	public void testGetSetNome() {
		personagem.setNome("Mario");
		
		assertEquals(personagem.getNome(), "Mario");
	}

	@Test
	public void testGetSetFuncao() {
		personagem.setFuncao("Encanador");
		
		assertEquals(personagem.getFuncao(), "Encanador");
	}

	@Test
	public void testGetSetHp() {
		personagem.setHp(123);
		
		assertEquals(personagem.getHp(), 123);
	}

	@Test
	public void testGetSetLevel() {
		personagem.setLevel(10);
		
		assertEquals(personagem.getLevel(), 10);
	}

	@Test
	public void testGetSetForcaSemBota() {
		personagem.setForca(5);
		
		assertEquals(personagem.getForca(), 5);
	}

	@Test
	public void testGetSetForcaComBota() {
		Bota botaMock = Mockito.mock(Bota.class);
		personagem.setForca(5);
		
		Mockito.when(botaMock.getForca()).thenReturn(1);
		personagem.EquiparBota(botaMock);
		
		
		assertEquals(personagem.getForca(), 8);
	}

	@Test
	public void testGetSetAgilidadeSemBota() {
		personagem.setAgilidade(3);
		
		assertEquals(personagem.getAgilidade(), 3);
	}

	@Test
	public void testGetSetAgilidadeComBota() {
		Bota botaMock = Mockito.mock(Bota.class);
		personagem.setAgilidade(3);
		
		Mockito.when(botaMock.getAgilidade()).thenReturn(1);
		personagem.EquiparBota(botaMock);
		
		assertEquals(personagem.getAgilidade(), 5);
	}

	@Test
	public void testGetSetInteligenciaSemBota() {
		personagem.setInteligencia(1);
		
		assertEquals(personagem.getInteligencia(), 1);
	}

	@Test
	public void testGetSetInteligenciaComBota() {
		Bota botaMock = Mockito.mock(Bota.class);
		personagem.setInteligencia(1);
		
		Mockito.when(botaMock.getInteligencia()).thenReturn(1);
		personagem.EquiparBota(botaMock);
		
		assertEquals(personagem.getInteligencia(), 3);
	}

	@Test
	public void testGetSetManaSemBota() {
		personagem.setInteligencia(1);
		
		assertEquals(personagem.getMana(), 100);
	}

	@Test
	public void testGetSetManaComBota() {
		Bota botaMock = Mockito.mock(Bota.class);
		personagem.setInteligencia(1);
		
		personagem.EquiparBota(botaMock);
		
		assertEquals(personagem.getMana(), 100);
	}
	
	@Test
	public void testEquiparBota() { 
		Bota botaMock = Mockito.mock(Bota.class);
		personagem.setForca(5);
		personagem.setAgilidade(3);
		personagem.setInteligencia(1);
		
		personagem.EquiparBota(botaMock);

		assertEquals(personagem.getForca(), 5);
		assertEquals(personagem.getAgilidade(), 3);
		assertEquals(personagem.getInteligencia(), 1);
	}

	@Test
	public void testAtaque() {
		assertEquals(personagem.ataque(), 0);
	}

	@Test
	public void testexibirDadosInicialJogador() {
		personagem.setNome("Gabriel");
		personagem.setLevel(5);
		personagem.setHp(225);
		personagem.setMana(1000);
		personagem.setForca(3);
		personagem.setAgilidade(5);
		personagem.setInteligencia(10);
		final ByteArrayOutputStream conteudoSaida = new ByteArrayOutputStream();
		final PrintStream saidaOriginal = System.out;
		System.setOut(new PrintStream(conteudoSaida));
		String resultado = "***********************************\r\n" + 
						   "*Dados inicial do jogador*\r\n" + 
						   "Nome Personagem: " + "Gabriel" + "\r\n" + 
						   "Level inicial: " + 5 + "\r\n" + 
						   "HP inicial: " + 225 + "\r\n" + 
						   "Mana inicial: " + 1000 + "\r\n" + 
						   "Força inicial: " + 3 + "\r\n" + 
						   "Agilidade inicial: " + 5 + "\r\n" + 
						   "Inteligencia inicial: " + 10 + "\r\n" + 
						   "***********************************\r\n";
		
		
		personagem.exibirDadosInicialJogador();
		
		
		assertEquals(resultado, conteudoSaida.toString());
		
		System.setOut(saidaOriginal);
	}

	@Test
	public void exibirNovosDadosJogador() {
		personagem.setLevel(6);
		personagem.setHp(250);
		personagem.setMana(1200);
		personagem.setForca(4);
		personagem.setAgilidade(6);
		personagem.setInteligencia(12);
		final ByteArrayOutputStream conteudoSaida = new ByteArrayOutputStream();
		final PrintStream saidaOriginal = System.out;
		System.setOut(new PrintStream(conteudoSaida));
		String resultado = "***********************************\r\n" + 
						   "*Novos dados do jogador*\r\n" + 
						   "Novo Level: " + 6 + "\r\n" + 
						   "Novo HP: " + 250 + "\r\n" + 
						   "Novo Mana: " + 1200 + "\r\n" + 
						   "Nova Força: " + 4 + "\r\n" + 
						   "Nova Agilidade: " + 6 + "\r\n" + 
						   "Nova Inteligencia: " + 12 + "\r\n" + 
						   "***********************************\r\n";
		
		
		personagem.exibirNovosDadosJogador();
		
		
		assertEquals(resultado, conteudoSaida.toString());
		
		System.setOut(saidaOriginal);
	}
	
	

}
