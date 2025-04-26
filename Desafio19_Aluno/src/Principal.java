public class Principal {
    public static void main(String[] args) {

        Aluno student = new Aluno();
        student.setNome("Yori");

        student.somarNotas(9);
        student.somarNotas(8);
        student.somarNotas(7);
        student.somarNotas(7);

        System.out.println("\nQuantidade de notas: "  + student.getTotalDeNotas());
        System.out.println("Média das notas: "  + student.obterMedia());

    }
}
