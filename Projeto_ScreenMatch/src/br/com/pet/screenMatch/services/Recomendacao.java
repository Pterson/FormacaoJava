package br.com.pet.screenMatch.services;

public class Recomendacao {
    private String recomendacao;

    public void filtrar (Classificacao classificacao) {
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("\nCLASSIFICAÇÃO DO FILME:");
            System.out.println("Está entre os melhores do momento");
        } else if (classificacao.getClassificacao() >= 2 || classificacao.getClassificacao() < 4) {
            System.out.println("\nCLASSIFICAÇÃO DO FILME:");
            System.out.println("Muito bem avaliado neste momento");
        } else {
            System.out.println("\nCLASSIFICAÇÃO DO FILME:");
            System.out.println("Inclua em sua lista para assistir mais tarde!");
        }
    }
}
