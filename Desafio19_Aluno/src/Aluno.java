/*
Desenvolva uma classe Aluno com os atributos privados nome e notas.
Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um método calcularMedia que retorna a média das notas do aluno.
*/

public class Aluno {
    private String nome;
    private double notas;
    private double somaDasNotas;
    private int totalDeNotas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }
    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double getSomaDasNotas() {
        return somaDasNotas;
    }
    public void setSomaDasNotas(double somaDasNotas) {
        this.somaDasNotas = somaDasNotas;
    }

    public int getTotalDeNotas() {
        return totalDeNotas;
    }
    public void setTotalDeNotas(int totalDeNotas) {
        this.totalDeNotas = totalDeNotas;
    }

    public void somarNotas(double notas){
        somaDasNotas = somaDasNotas + notas;
        totalDeNotas++;
    }

    public double obterMedia() {
        return somaDasNotas / totalDeNotas;
    }

}
