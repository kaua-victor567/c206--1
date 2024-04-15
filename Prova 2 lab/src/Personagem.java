public class Personagem {
    protected String nome;
    protected int vida;
    protected int energia;
    protected int poder;

    Personagem(String nome,int vida,int energia,int poder){
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
    }
    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Energia: " + energia);
        System.out.println("Porder: " + poder);
    }
    void usarHabilidade(){
        System.out.println("Hablidade sendo conjurada");
    }
}
