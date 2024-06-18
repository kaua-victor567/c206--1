package Pacote;

public class Instagram extends RedeSocial {
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no instagram");
    }
    @Override
    public void postarVideo() {
        System.out.println("Video postado no instagram");
    }
    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no instagram");
    }
}