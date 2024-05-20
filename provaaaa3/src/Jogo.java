public class Jogo {
    private String nome;
    private double preco;
    private String genero;

    Jogo(){
    }
    public Jogo(String nome,double preco,String genero){
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }
    public void MostraInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Genero: "+ genero);
        System.out.println("preco: "+ preco);
    }
}
