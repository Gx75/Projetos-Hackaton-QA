package rpg_game;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome){
        this.setForca(10);
        this.setAgilidade(5);
        this.setInteligencia(2);
        this.setHp(300);
        this.setFuncao("Guerreiro");
        this.setNome(nome);
    }
    
    public void lvlUp(){
        int level = this.getLevel();
        this.setLevel(level+1);
        
        int forca = this.getForca();
        this.setForca(forca+3);
        
        int agilidade = this.getAgilidade();
        this.setAgilidade(agilidade+1);
        
        int inteligencia = this.getInteligencia();
        this.setInteligencia(inteligencia+1);
    }
    
    public int ataque() {
    	return this.getForca()+2;
    }
    
    public int ataque2() {
    	return this.getForca()+8;
    }
}
