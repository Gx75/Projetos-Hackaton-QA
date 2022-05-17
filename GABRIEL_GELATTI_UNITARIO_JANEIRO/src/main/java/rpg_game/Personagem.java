package rpg_game;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Personagem {
    private int agilidade;
    private int forca;
    private int inteligencia;
    private String funcao;
    private String nome;
    
    private int hp;
    private int mana;
    
    private int level = 1;
    
    private Bota bota;

    public int getAgilidade() {
        if(this.bota != null)
            if(this.bota.getAgilidade() > 0)
                return agilidade + this.bota.getAgilidade();
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getForca() {
        if(this.bota != null)
            if(this.bota.getForca() > 0)
                return forca + this.bota.getForca();
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        if(this.bota != null)
            if(this.bota.getInteligencia() > 0)
                return inteligencia + this.bota.getInteligencia();
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }



    public int getMana() {
        if(this.bota != null)
            setMana(100 * (inteligencia+this.bota.getInteligencia()));
        else
            setMana(100*inteligencia);
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    public int setLevel(int level) {
        return this.level = level;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void EquiparBota(Bota bota){
        this.bota = bota;
        this.setForca(this.getForca()+bota.getForca());
        this.setAgilidade(this.agilidade+bota.getAgilidade());
        this.setInteligencia(this.inteligencia+bota.getInteligencia());
    }
    
    public int ataque() {
		return 0;
    }
    
    public void exibirDadosInicialJogador(){
        System.out.println("***********************************");
        System.out.println("*Dados inicial do jogador*");
        System.out.println("Nome Personagem: "+ this.getNome());
        System.out.println("Level inicial: " + this.getLevel());
        System.out.println("HP inicial: " + this.getHp());
        System.out.println("Mana inicial: " + this.getMana());
        System.out.println("Força inicial: " + this.getForca());
        System.out.println("Agilidade inicial: " + this.getAgilidade());
        System.out.println("Inteligencia inicial: " + this.getInteligencia());
        System.out.println("***********************************");
        
    }
    
    public void exibirNovosDadosJogador(){
        System.out.println("***********************************");
        System.out.println("*Novos dados do jogador*");
        System.out.println("Novo Level: " + this.getLevel());
        System.out.println("Novo HP: " + this.getHp());
        System.out.println("Novo Mana: " + this.getMana());
        System.out.println("Nova Força: " + this.getForca());
        System.out.println("Nova Agilidade: " + this.getAgilidade());
        System.out.println("Nova Inteligencia: " + this.getInteligencia());
        System.out.println("***********************************");
    }

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getNome() {
		return nome;
	}
	
    public String setNome(String nome) {
        return this.nome = nome;
    }

}