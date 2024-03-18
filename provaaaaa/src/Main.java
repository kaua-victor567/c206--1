import java.util.Scanner;
/* o codigo compreende q voce tem 5 funcionarios e voce tem q cadastralos
logo se der o comando para ver quantos nao estao alocados ele respondera 5, apos cadastrar um funcionario
e alocalo, se der o comando dara 4.....
 */
public class Main {
    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        Empresa empresa = new Empresa();
        Scanner pedido = new Scanner(System.in);
        System.out.println("Escolha entre 1 e 4 (1: mostrar info da empresa, 2: adiciona funcionario, 3: aloca funcionario, 4: conta funcionarios disponiveis");
        int escolha = pedido.nextInt();
        empresa.funcionario[0] = new Funcionario();
        empresa.funcionario[1] = new Funcionario();
        empresa.funcionario[2] = new Funcionario();
        empresa.funcionario[3] = new Funcionario();
        empresa.funcionario[4] = new Funcionario();
        do {
            if (escolha == 1) {
                System.out.println("Voce escolheu mostrar as informacoes da empresa: ");
                empresa.mostraInfo();
                escolha = 0;
            }
            if (escolha == 2) {
                System.out.println("Voce escolheu adicionar um funcionario");
                System.out.println("Entre com nome: ");
                pedido.nextLine();
                empresa.funcionario[i].pessoa.nome= pedido.nextLine();
                System.out.println("Entre com cpf: ");
                empresa.funcionario[i].pessoa.cpf = pedido.nextLine();
                System.out.println("Entre com idade: ");
                empresa.funcionario[i].pessoa.idade = pedido.nextInt();
                System.out.println("Entre com matricula: ");
                empresa.funcionario[i].matricula = pedido.nextInt();
                i++;
                escolha = 0;
            }
            if (escolha == 3) {
                System.out.println("Voce escolheu alocar um funcionario");
                System.out.println("Qual funcionario deseja alocar");
                x = pedido.nextInt();
                empresa.alocarFuncionario(x);
                System.out.println("Funcionario: " + x + " alocado");
                escolha = 0;
            }
            if(escolha == 4){
            System.out.println("funcionarios disponiveis: ");
            System.out.println(empresa.contarFuncionariosDisponiveis());
                escolha = 0;
            }
            System.out.println("Escolha entre 1 e 4 (1: mostrar info da empresa, 2: adiciona funcionario, 3: aloca funcionario, 4: conta funcionarios disponiveis");
           escolha = pedido.nextInt();
        }while (escolha != 0);
    }
}