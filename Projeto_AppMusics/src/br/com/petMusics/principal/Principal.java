package br.com.petMusics.principal;
import br.com.petMusics.models.Favoritos;
import br.com.petMusics.models.Musicas;
import br.com.petMusics.models.Podcasts;

public class Principal {
    public static void main(String[] args) {

        Musicas musicas = new Musicas();
        musicas.setTitulo("Forever");
        musicas.setCantor("Kiss");

        for (int i = 0; i < 2000; i++) {
            musicas.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            musicas.curtir();
        }


        Podcasts podcast = new Podcasts();
        podcast.setTitulo("BolhaDev");
        podcast.setHost("Marcos Mendes");

        for (int i = 0; i < 500; i++) {
            podcast.reproduzir();
        }
        for (int i = 0; i < 100; i++) {
            podcast.curtir();
        }


        Favoritos favoritos = new Favoritos();
        favoritos.incluir(podcast);
        favoritos.incluir(musicas);
    }
}
