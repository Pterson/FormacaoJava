package br.com.pet.screenMatch.services;

import br.com.pet.screenMatch.models.Filme;
import br.com.pet.screenMatch.models.Serie;
import br.com.pet.screenMatch.models.Titulo;

import java.lang.reflect.Field;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void incluirVideo(Filme tempoF) {
//        this.tempoTotal = tempoTotal + tempoF.getDuracaoEmMinutos();
//    }
//    public void incluirVideo(Serie tempoS) {
//        this.tempoTotal = tempoTotal + tempoS.getDuracaoEmMinutos();
//    }

    public void incluirVideo (Titulo titulo) {
        this.tempoTotal = tempoTotal + titulo.getDuracaoEmMinutos();
    }


}
