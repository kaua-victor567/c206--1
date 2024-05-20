import java.util.ArrayList;

public class Main {
    public static arraylist List<Jogo> = new arraylist<>;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();
        int opcao;
        do {
            opcao = sc.nextint;
            sc.nextLine();
            switch (opcao) {
                case (1):
                    jogo.setNome(sc.nextstring);
                    jogo.setGenero(sc.nextstring);
                    jogo.setPreco(sc.nextdouble);
                    break;
                case (2):
                    MostraInfo();
                    break;
                case (3):
                    OrdenaCrescente();
                    break;
                case (4):
                    OrdenaDecrescente();
                    break;
                case(5):
                    System.out.println("Saindo....")
                    break;
                default:
                    System.out.println("Opcao indisponivel");
                    break;
            }
        }while (opcao !=5);
    }
}