/*
Desenvolva uma classe Livro com os atributos privados titulo e autor.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método exibirDetalhes que imprime o título e o autor do livro.
*/

public class Livro {

    private String titulo;
    private String autor;
    private String prefacio;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrefacio() {
        return prefacio;
    }
    public void setPrefacio(String prefacio) {
        this.prefacio = prefacio;
    }

    public void exibirDetalhes() {
        System.out.println("\nTitulo do Livro: " + titulo);
        System.out.println("Autor do Livro: " + autor);
        System.out.println("Prefacio do Livro: " + prefacio);

    }
}
