public class Main {
    public static void main(String[] args) {
    Mago mago = new Mago("Frieren",200,500,200);
    Guerreiro guerreiro = new Guerreiro("Rimel",500,1000,80);
    Assasino assasino = new Assasino("leonard",300,500,140);

    System.out.println("Mago: ");
    mago.mostraInfo();
    System.out.println("_________________________");
    System.out.println("Guerreiro: ");
    guerreiro.mostraInfo();
    System.out.println("_________________________");
    System.out.println("Assasino: ");
    assasino.mostraInfo();
    System.out.println("_________________________");
    System.out.println("Arma do Guerreiro: ");
    guerreiro.statusArma();
    System.out.println("_________________________");
    System.out.println("Arma do assasino: ");
    assasino.statusArma();
    System.out.println("_________________________");
    System.out.println("Guerreiro usa habilidade: ");
    guerreiro.usarHabilidade();
    System.out.println("Assasino usa habilidade: ");
    assasino.usarHabilidade();
    System.out.println("Mago usa habilidade: ");
    mago.usarHabilidade();
    }
}