package br.com.pet.screenMatch.models;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodio;
    private boolean ativa;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }
    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodio;
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("\nNome da série: " + getNome());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Episódios por temporada: " + getEpisodiosPorTemporadas());
        System.out.println("Minutos por episódio: " + getMinutosPorEpisodio());
        System.out.println("Está ativa: " + (isAtiva() ? "Sim" : "Não"));
        System.out.println("Duração: " + getDuracaoEmMinutos() + " minutos");
    }


}
