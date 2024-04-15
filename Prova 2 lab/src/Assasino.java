public class Assasino extends Personagem {
    Arma arma = new Arma("Adaga",75);
    public Assasino(String nome, int vida, int energia, int poder) {
        super(nome, vida, energia, poder);
    }
    Void statusArma(){
        System.out.println("Nome: " + arma.nome);
        System.out.println("Dano " + arma.dano);
        return null;
    }
}
