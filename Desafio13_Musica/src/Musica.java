public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double totalDasAvaliacoes;
    double somaDasAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avaliarMusica(double nota){
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDasAvaliacoes++;
    }

    double obterMedia() {
        return somaDasAvaliacoes/totalDasAvaliacoes;
    }
}
