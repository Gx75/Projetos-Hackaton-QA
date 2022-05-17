package rpg_game;

import rpg_game.Personagem;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome){
        this.setForca(5);
        this.setAgilidade(10);
        this.setInteligencia(5);
        this.setHp(250);
        this.setFuncao("Arqueiro");
        this.setNome(nome);
    }
    
    
    public void lvlUp(){
        int level = this.getLevel();
        this.setLevel(level+1);
        
        int forca = this.getForca();
        this.setForca(forca+1);
        
        int agilidade = this.getAgilidade();
        this.setAgilidade(agilidade+3);
        
        int inteligencia = this.getInteligencia();
        this.setInteligencia(inteligencia+1);
    }
    
    public int ataque() {
    	return this.getForca()+3;
    }
    
    public int ataque2() {
    	return this.getForca()+5;
    }
}
