package rpg_game;

public class Combate {
	
	public void lutaCorporal(Personagem persona1, Personagem persona2) {
		persona2.setHp(persona2.getHp()-persona1.ataque());
	}
	
	public String embateXadrez(Personagem persona1, Personagem persona2) {
		if(persona1.getInteligencia() > persona2.getInteligencia()) {
			String resultado = persona1.getNome()+" ganhou";
			return resultado;
		}else if(persona1.getInteligencia() == persona2.getInteligencia() ) {
			String resultado = "Disputa no cara ou coroa";
			return resultado;
		}else {
			return persona2.getNome()+ " ganhou";
		}
	}
	
}
