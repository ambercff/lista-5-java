package ex1;

import java.util.ArrayList;

public class Calculo {
    double mediaAritmetica = 0;
    double mediaPonderada = 0;
    Resultado resultado = new Resultado();

    public void mediaAritmetica(ArrayList<Double> notas){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
            mediaAritmetica = soma / notas.size();
        }

//        System.out.println("A média aritmética das notas é: " + mediaAritmetica);
        resultado.mostrarResultado(mediaAritmetica, mediaPonderada);

    }

    public void mediaPonderada(ArrayList<Double> notas, ArrayList<Double> pesos) {
        double somaPesos = 0;
        double somaNotas= 0;

        for(int i = 0; i < notas.size(); i++) {
            double nota = notas.get(i);
            double peso = pesos.get(i);

            somaNotas += nota * peso;
            somaPesos += peso;
        }

        mediaPonderada = somaNotas / somaPesos;
//        System.out.printf("A média ponderada das notas é: %.2f", mediaPonderada);

        resultado.mostrarResultado(mediaAritmetica, mediaPonderada);
    }

}
