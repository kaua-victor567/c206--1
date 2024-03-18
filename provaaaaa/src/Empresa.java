public class Empresa {
    String nome = "empresa top";
    String cnpj = "165465-75654";
    String endereco = "Rua 1 ao lado da Rua 2";
    Funcionario funcionario[] = new Funcionario[5];
    int funcionariosDisponiveis;

    void mostraInfo(){
    System.out.println("Nome empresa: "+this.nome);
    System.out.println("Cnpj empresa: "+this.cnpj);
    System.out.println("Endereco empresa: "+this.endereco);

    }
    //void adicionarFuncionario(funcionario:Funcionario){

    //}
    void alocarFuncionario(int i){
        funcionario[i].disponivel = false;
}
    float contarFuncionariosDisponiveis(){
        for (int i = 0; i < funcionario.length; i++) {
            if (funcionario[i].disponivel == true){
                funcionariosDisponiveis++;
            }
        }
        return funcionariosDisponiveis;
    }

}

