package org.example;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlantaDAO plantaDAO = new PlantaDAO();

        while (true) {
            System.out.println("1. Adicionar Planta");
            System.out.println("2. Visualizar Planta");
            System.out.println("3. Atualizar Planta");
            System.out.println("4. Deletar Planta");
            System.out.println("5. Listar Todas as Plantas");
            System.out.println("6. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (escolha) {
                case 1:
                    System.out.println("Nome da Planta:");
                    String nome = scanner.nextLine();
                    System.out.println("Tipo da Planta:");
                    String tipo = scanner.nextLine();
                    System.out.println("Preço de Venda:");
                    double precoVenda = scanner.nextDouble();
                    scanner.nextLine(); // Consumir nova linha

                    Planta planta = new Planta(0, nome, tipo, precoVenda); // ID será gerado automaticamente pelo BD
                    plantaDAO.criarPlanta(planta);
                    break;
                case 2:
                    System.out.println("ID da Planta:");
                    int idPlantas = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    Planta plantaLida = plantaDAO.lerPlanta(idPlantas);
                    if (plantaLida != null) {
                        System.out.println("Nome: " + plantaLida.getNome());
                        System.out.println("Tipo: " + plantaLida.getTipo());
                        System.out.println("Preço de Venda: " + plantaLida.getPrecoVenda());
                    } else {
                        System.out.println("Planta não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("ID da Planta a ser atualizada:");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.println("Novo Nome da Planta:");
                    String novoNome = scanner.nextLine();
                    System.out.println("Novo Tipo da Planta:");
                    String novoTipo = scanner.nextLine();
                    System.out.println("Novo Preço de Venda:");
                    double novoPrecoVenda = scanner.nextDouble();
                    scanner.nextLine(); // Consumir nova linha

                    Planta plantaAtualizar = new Planta(idAtualizar, novoNome, novoTipo, novoPrecoVenda);
                    plantaDAO.atualizarPlanta(plantaAtualizar);
                    break;
                case 4:
                    System.out.println("ID da Planta a ser deletada:");
                    int idDeletar = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    plantaDAO.deletarPlanta(idDeletar);
                    break;
                case 5:
                    List<Planta> plantas = plantaDAO.lerTodasPlantas();
                    for (Planta p : plantas) {
                        System.out.println("ID: " + p.getIdPlantas() + ", Nome: " + p.getNome() + ", Tipo: " + p.getTipo() + ", Preço de Venda: " + p.getPrecoVenda());
                    }
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
