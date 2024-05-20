import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();
        Arquivo arquivo = new Arquivo();
        ArrayList<Jogo> jogos = new ArrayList<>();
        double precomin = 0;
        boolean a = true;
        while (a){
            jogos = arquivo.ler();
            if(jogos.size() == 0){
                System.out.println("lista vazia");
            }
        }
        int opcao;
        System.out.println("Seleciona uma opcao: \n" +
                "1. Cadastrar jogo\n" +
                "2. mostra info\n" +
                "3. Ordenar os jogos em ordem crescente\n" +
                "4. Ordenar os jogos em ordem decrescente\n" +
                "5. Sai");
        do {
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case (1):
                    System.out.println("Nome: ");
                    jogo.setNome(sc.nextLine());
                    System.out.println("Genero: ");
                    jogo.setGenero(sc.nextLine());
                    System.out.println("Preco: ");
                    try {
                        precomin = sc.nextInt();
                        if (precomin <= 0) {
                            throw new PrecoNegativoException();
                        }
                        jogo.setPreco(precomin);
                    }
                    catch(PrecoNegativoException e){
                        System.out.println(e);
                        break;
                    }
                    Arquivo.escrever(jogo);
                    break;
                case (2):
                    System.out.println("Lista de jogos:");
                    for(Jogo j : jogos) {
                        System.out.println("| Nome: " + j.getNome());
                        System.out.println("| Genero: " + j.getGenero());
                        System.out.println("| Preco: " + j.getPreco());
                        System.out.println("| ---------------");
                    }
                    System.out.println();
                    break;
                case (3):
                    Collections.sort(jogos);

                    System.out.println("Em ordem crescente:");
                    for(Jogo j : jogos) {
                        System.out.println("| Nome: " + j.getNome());
                        System.out.println("| Genero: " + j.getGenero());
                        System.out.println("| Preco: " + j.getPreco());
                        System.out.println("| ---------------");
                    }
                    System.out.println();
                    break;
                case (4):
                    Collections.sort(jogos, Collections.reverseOrder());
                    System.out.println("Em ordem decrescente: ");

                    System.out.println("| <---------------");
                    for(Jogo j : jogos) {
                        System.out.println("| Nome: " + j.getNome());
                        System.out.println("| Genero: " + j.getGenero());
                        System.out.println("| Preco: " + j.getPreco());
                        System.out.println("| ---------------");
                    }
                    System.out.println();
                    break;
                case(5):
                    System.out.println("Saindo....");
                    a = false;
                    break;
                default:
                    System.out.println("Opcao indisponivel");
                    break;
            }
        }while (opcao !=5);
        sc.close();
    }
}