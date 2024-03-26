import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Computador computador = new Computador();
        Cliente cliente = new Cliente();
        int[] carrinho = new int[15]; // max 15 pc
        int z = 0;
        int opcao;
        do {
            opcao = entrada.nextInt();
            if (z < carrinho.length) {
                if (opcao == 1) {
                    cliente.calculaTotalCompra(computador.preco[0]);
                    carrinho[z] = 1;
                    z++;
                }
                if (opcao == 2) {
                    cliente.calculaTotalCompra(computador.preco[1]);
                    carrinho[z] = 2;
                    z++;
                }
                if (opcao == 3) {
                    cliente.calculaTotalCompra(computador.preco[2]);
                    carrinho[z] = 3;
                    z++;
                }
            } else {
                System.out.println("Carrinho cheio!");
                break; // sair do loop
            }
            }while (opcao != 0) ;
        System.out.println("Nome cliente: " + cliente.nome);
        System.out.println("Cpf: " + cliente.cpf);
        System.out.println("________________________________________________________");
        for (int x = 0; x < z; x++) {
            int item = carrinho[x];
            if (item != 0) {
                computador.mostraPCConfigs(item - 1); // ajusta o índice subtraindo 1
                System.out.println("________________________________________________________");
            }
        }
        System.out.println("Preço total: "+cliente.total);
    }
}