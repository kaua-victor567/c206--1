package Pacote;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Facebook");
    }
    @Override
    public void postarVideo() {
        System.out.println("Video postado no Facebook");
    }
    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Facebook");
    }
    @Override
    public void compartilhar() {
        System.out.println("Compartilhado no Facebook");
    }
    @Override
    public void fazStreaming() {
        System.out.println("Streaming no Facebook");
    }
}