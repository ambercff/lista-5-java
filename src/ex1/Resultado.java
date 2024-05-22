package ex1;

public class Resultado {
    public void mostrarResultado(double mediaAritmetica, double mediaPonderada){
        if (mediaAritmetica >= 7 || mediaPonderada >= 7) {
            System.out.println("O aluno está aprovado! :)");
        } else {
            System.out.println("O aluno está reprovado! :(");
        }
    }
}
