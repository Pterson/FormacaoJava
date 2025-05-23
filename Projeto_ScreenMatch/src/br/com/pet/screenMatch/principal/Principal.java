package br.com.pet.screenMatch.principal;

import br.com.pet.screenMatch.models.Episodio;
import br.com.pet.screenMatch.models.Filme;
import br.com.pet.screenMatch.models.Serie;
import br.com.pet.screenMatch.services.CalculadoraDeTempo;
import br.com.pet.screenMatch.services.Recomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        System.out.println("\n------------------ Filmes ------------------");
        Filme movie = new Filme("O Poderoso Chefão", 1970);
        //movie.setNome("O Poderoso Chefão");
        //movie.setAnoDeLancamento(1970);
        movie.setDuracaoEmMinutos(180);
        movie.setDiretor("Francis Ford Coppola");

        movie.avaliar(8);
        movie.avaliar(5);
        movie.avaliar(10);

        movie.exibirFichaTecnica();
        System.out.println("Duração do Filme: " + movie.getDuracaoEmMinutos());
        System.out.println("Média das notas: "  + movie.obterMedia());
        System.out.println("Total de avaliações: "  + movie.getTotalDeAvaliacoes());


        Filme movie2 = new Filme("Velozes e Furiosos", 2015);
        //movie2.setNome("Velozes e Furiosos");
        //movie2.setAnoDeLancamento(2015);
        movie2.setDuracaoEmMinutos(130);
        movie2.setIncluidoNoPlano(true);

        movie2.avaliar(8);
        movie2.avaliar(8);
        movie2.avaliar(8);

        movie2.exibirFichaTecnica();
        System.out.println("Duração do Filme: " + movie2.getDuracaoEmMinutos());
        System.out.println("Média das notas: "  + movie2.obterMedia());
        System.out.println("Total de avaliações: "  + movie2.getTotalDeAvaliacoes());


        Filme movie3 = new Filme("The Matrix", 1999);
        //movie3.setNome("The Matrix");
        //movie3.setAnoDeLancamento(1999);
        movie3.setDuracaoEmMinutos(135);
        movie3.setIncluidoNoPlano(true);

        movie3.avaliar(10);
        movie3.avaliar(10);
        movie3.avaliar(10);

        movie3.exibirFichaTecnica();
        System.out.println("Duração do Filme: " + movie3.getDuracaoEmMinutos());
        System.out.println("Média das notas: "  + movie3.obterMedia());
        System.out.println("Total de avaliações: "  + movie3.getTotalDeAvaliacoes());


        //System.out.println("Soma das notas: "  + movie.somaDasAvaliacoes);
        //System.out.println("Total das notas: " + movie.totalDeAvaliacoes);


        System.out.println("\n------------------ Série ------------------");

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.setIncluidoNoPlano(true);
        lost.setAtiva(true);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibirFichaTecnica();
        System.out.println("Duração total em minutos: " + lost.getDuracaoEmMinutos());

        Serie laCasaDePapel = new Serie("La Casa de Papel",2017);
        //laCasaDePapel.setNome("La Casa de Papel");
        //laCasaDePapel.setAnoDeLancamento(2017);
        laCasaDePapel.setIncluidoNoPlano(true);
        laCasaDePapel.setAtiva(true);
        laCasaDePapel.setTemporadas(5);
        laCasaDePapel.setEpisodiosPorTemporadas(10);
        laCasaDePapel.setMinutosPorEpisodio(45);
        laCasaDePapel.exibirFichaTecnica();
        System.out.println("Duração total em minutos: " + laCasaDePapel.getDuracaoEmMinutos());

        CalculadoraDeTempo timeCalculator = new CalculadoraDeTempo();
        timeCalculator.incluirVideo(movie);
        timeCalculator.incluirVideo(movie2);
        timeCalculator.incluirVideo(movie3);
        timeCalculator.incluirVideo(lost);
        timeCalculator.incluirVideo(laCasaDePapel);


        int totalMinutos = timeCalculator.getTempoTotal();
        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println("\nTempo total assistido: " + horas + "h e " + minutos + "min (" + totalMinutos + " minutos)");

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtrar(movie);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        recomendacao.filtrar(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(movie);
        listaDeFilmes.add(movie2);
        listaDeFilmes.add(movie3);

        System.out.println("\n------------------ Lista de Filmes ------------------");
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());

        for (int i = 0; i < listaDeFilmes.size(); i++) {
            System.out.println((i + 1) + "º da lista: " + listaDeFilmes.get(i).getNome());
        }

        System.out.println(listaDeFilmes);

    }
}
