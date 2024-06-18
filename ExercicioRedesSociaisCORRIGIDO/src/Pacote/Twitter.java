package Pacote;

public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Twitter");
    }
    @Override
    public void postarVideo() {
        System.out.println("Video postado no Twitter");
    }
    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Twitter");
    }
    @Override
    public void compartilhar() {
        System.out.println("Compartilhado no Twitter");
    }
}