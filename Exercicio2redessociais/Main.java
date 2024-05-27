package EX2_Redes_Sociais;

public class Main {
    public static void main(String[] args) {
        RedeSocial[] redesSociais = {new Facebook(), new Twitter()};

        Usuario usuario = new Usuario(redesSociais);
        usuario.setNome("kaua victor");
        usuario.setEmail("frieren@gmail.com");

        usuario.redesSociais[0].senha = "shaolinmatadordeporco";
        usuario.redesSociais[0].numAmigos = 123321;
        
        usuario.redesSociais[1].senha = "flavinhodopneu";
        usuario.redesSociais[1].numAmigos = 123;

        usuario.usarRedes();
    }
}
