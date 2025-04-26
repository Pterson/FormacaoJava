package br.com.petMusics.models;

public class Favoritos {

    public void incluir(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + "é considerado sucesso absoluto" +
                    "e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " este é dos que todos estão " +
                    "curtindo");
        }
    }
}
