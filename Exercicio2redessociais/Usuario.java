package EX2_Redes_Sociais;
public class Usuario {
    private String nome;
    private String email;
    RedeSocial[] redesSociais;
    public Usuario(RedeSocial[] redesSociais){
        this.redesSociais = redesSociais;
    }
    public void usarRedes() {
        for (RedeSocial rede : this.redesSociais) {
            if (rede instanceof Facebook) {
                Facebook facebook = (Facebook) rede;
                facebook.fazStreaming();
                facebook.compartilhar();
                facebook.postarFoto();
            }
            else if (rede instanceof Twitter) {
                Twitter twitter = (Twitter) rede;
                twitter.postarVideo();
                twitter.postarComentario();
                twitter.curtirPublicacao();
            } 
            else if (rede instanceof GooglePlus) {
                throw new java.lang.UnsupportedOperationException();
            }
            else if (rede instanceof Instagram) {
                throw new java.lang.UnsupportedOperationException();
            }
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}