public class Cliente {
    String nome = "Cliente bom de pagamento";
    float total;
    long cpf = 1233211233;

    float calculaTotalCompra(float m){
        total += m;
        return total;
    }
}
