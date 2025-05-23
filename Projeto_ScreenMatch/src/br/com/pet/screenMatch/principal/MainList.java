package br.com.pet.screenMatch.principal;

import br.com.pet.screenMatch.models.Filme;
import br.com.pet.screenMatch.models.Serie;
import br.com.pet.screenMatch.models.Titulo;
import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {

        //Lista de Filmes
        Filme movie = new Filme("O Poderoso Chefão", 1970);
        Filme movie2 = new Filme("Velozes e Furiosos", 2015);
        Filme movie3 = new Filme("The Matrix", 1999);

        //Lista de Series
        Serie lost = new Serie("Lost", 2000);
        Serie laCasaDePapel = new Serie("La Casa de Papel",2017);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(movie);
        listaDeTitulos.add(movie2);
        listaDeTitulos.add(movie3);
        listaDeTitulos.add(lost);
        listaDeTitulos.add(laCasaDePapel);

        System.out.println("\n------------------ Lista de Filmes ------------------");
        for (Titulo item : listaDeTitulos) {
            if (item instanceof Filme filme) {
                // if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Filme: " + filme.getNome());
                System.out.println("Classificação: " + filme.getClassificacao());
                System.out.println("-------------------------------------------");
            }
        }

        System.out.println("\n------------------ Lista de Series ------------------");
        for (Titulo item: listaDeTitulos) {
            if (item instanceof Serie serie) {
                System.out.println("Série: " + serie.getNome());
                System.out.println("Ano Lançamento: " + serie.getAnoDeLancamento());
                System.out.println("-------------------------------------------");
            }
        }

    }
}
