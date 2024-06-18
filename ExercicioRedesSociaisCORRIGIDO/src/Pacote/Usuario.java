package Pacote;

import exception.LimiteDeAmigoException;
import exception.SenhaInvalidaException;
import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    private Set<RedeSocial> redesSociais;
    public Usuario(Set<RedeSocial> redesSociais) {
        this.redesSociais = redesSociais;
    }
    public void usarRedes() {
        for (RedeSocial rede : redesSociais) {
            if (rede instanceof Facebook) {
                Facebook facebook = (Facebook) rede;
                facebook.postarFoto();
                facebook.postarVideo();
                facebook.fazStreaming();
            } else if (rede instanceof Twitter) {
                Twitter twitter = (Twitter) rede;
                twitter.postarFoto();
                twitter.postarVideo();
                twitter.compartilhar();
            } else if (rede instanceof GooglePlus) {
                GooglePlus googlePlus = (GooglePlus) rede;
                googlePlus.postarFoto();
                googlePlus.postarVideo();
                googlePlus.compartilhar();
            } else if (rede instanceof Instagram) {
                Instagram instagram = (Instagram) rede;
                instagram.postarFoto();
                instagram.postarVideo();
                instagram.postarComentario();
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
    public void adicionarRedeSocial(RedeSocial rede) throws LimiteDeAmigoException, SenhaInvalidaException {
        if (rede.getNumAmigos() > 50000) {
            throw new LimiteDeAmigoException("Quantidade de amigos passou dos limites!!!");
        }
        if (rede.getSenha() == null || rede.getSenha().length() < 5) {
            throw new SenhaInvalidaException("Senha invalida!!!");
        }
        redesSociais.add(rede);
    }
}