public class PrecoNegativoException extends  Exception {

    public PrecoNegativoException() {
        System.out.println("\n===============");
        System.out.println("o preco deve ser salvo com valor maior ou igual a zero");

    }
}