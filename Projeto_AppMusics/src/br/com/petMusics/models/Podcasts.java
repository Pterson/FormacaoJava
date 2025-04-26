package br.com.petMusics.models;

public class Podcasts extends Audio{
    private String host;
    private String descricaoEpisodio;

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricaoEpisodio() {
        return descricaoEpisodio;
    }
    public void setDescricaoEpisodio(String descricaoEpisodio) {
        this.descricaoEpisodio = descricaoEpisodio;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeCurtidas() > 5000) {
            return 10;
        } else {
            return 8;
        }

    }
}
