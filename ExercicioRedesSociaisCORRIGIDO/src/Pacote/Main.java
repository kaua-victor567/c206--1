package Pacote;

import exception.LimiteDeAmigoException;
import exception.SenhaInvalidaException;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<RedeSocial> redesSociais = new HashSet<>();

        Facebook facebook = new Facebook();
        facebook.setSenha("shaolinmatadordeporco");
        facebook.setNumAmigos(1000000001);//estora o limite de amigos

        GooglePlus googlePlus = new GooglePlus();
        googlePlus.setSenha("Senhadotamanhodeumasenha");
        googlePlus.setNumAmigos(3000);

        Twitter twitter = new Twitter();
        twitter.setSenha("123");
        twitter.setNumAmigos(500);

        redesSociais.add(facebook);
        redesSociais.add(googlePlus);
        redesSociais.add(twitter);

        Usuario usuario = new Usuario(redesSociais);
        usuario.setNome("flavinhodopneu");
        usuario.setEmail("flavinhodopneu@hotmail.com");

        try {
            for (RedeSocial rede : redesSociais) {
                usuario.adicionarRedeSocial(rede);
            }
        } catch (LimiteDeAmigoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        usuario.usarRedes();
    }
}