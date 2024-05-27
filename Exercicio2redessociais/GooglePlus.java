package EX2_Redes_Sociais;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void postarFoto() {
        System.out.println("Foto postada no GooglePlus");
    }
    
    @Override
    public void postarVideo() {
        System.out.println("Video postado no  GooglePlus");
    }
    
    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no GooglePlus");
    }
    
    @Override
    public void compartilhar() {
        System.out.println("Compartilhado no GooglePlus");
    }
    
    @Override
    public void fazStreaming() {
        System.out.println("Streaming no GooglePlus");
    }
}
