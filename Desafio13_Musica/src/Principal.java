public class Principal {
    public static void main(String[] args) {

        Musica music = new Musica();
        music.titulo = "Peita do Coringão";
        music.artista = "Depay" ;
        music.anoDeLancamento = 2025;

        music.exibirFichaTecnica();

        music.avaliarMusica(7);
        music.avaliarMusica(8);
        music.avaliarMusica(9);

        System.out.println("Soma das notas: " + music.somaDasAvaliacoes);
        System.out.println("Total das notas: " + music.totalDasAvaliacoes);
        System.out.println("Media das notas: " + music.obterMedia());



    }
}
