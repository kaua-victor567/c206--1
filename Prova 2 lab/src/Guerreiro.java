public class Guerreiro extends Personagem{
    Arma arma = new Arma("Espada", 100);

    Void statusArma(){
        System.out.println("Nome: " + arma.nome);
        System.out.println("Dano " + arma.dano);
        return null;
    }
    public Guerreiro(String nome, int vida, int energia, int poder) {
        super(nome, vida, energia, poder);
    }


}
