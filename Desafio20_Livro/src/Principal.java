public class Principal {
    public static void main(String[] args) {

        Livro book = new Livro();
        book.setTitulo("A Cabana");
        book.setAutor("William P. Young");
        book.setPrefacio("""
        \nA Cabana é um livro do escritor canadense William P. Young, lançado em 2007 nos Estados Unidos.
        Chegou ao Brasil pela Editora Sextante em 2008. No ano de 2009 ganhou o Diamond Awards por ter vendido 10 milhões de cópias nos EUA.
        Até então já vendeu mais de 20 milhões de livros.")
                """);

        book.exibirDetalhes();

    }
}
