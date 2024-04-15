public class Mago extends Personagem{
    public Mago(String nome, int vida, int energia, int poder) {
        super(nome, vida, energia, poder);
    }

    @Override
    void usarHabilidade(){
        System.out.println("Bola de fogo");
    }
}
