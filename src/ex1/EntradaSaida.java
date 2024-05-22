package ex1;


import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSaida {

    private Scanner ler = new Scanner(System.in);
    private boolean loop = true;
    private double nota;
    private Validacao validacao = new Validacao();
    private ArrayList<Double> notas = new ArrayList<>();
    private ArrayList<Double> pesos = new ArrayList<>();

    private Calculo calculo = new Calculo();
    public ArrayList<Double> recebeNotas(){
            while (loop){
                System.out.println("Insira a nota: ");
                nota = Double.parseDouble(ler.nextLine());

                if (validacao.verificaNota(nota) == false) {
                    System.out.println("Nota inválida! Insira uma nota de 0 a 10.");
                    continue;
                }

                notas.add(nota);

                System.out.println("Deseja continuar? Insira sim ou nao.");
                String continua = ler.nextLine();

                if (continua.equals("nao")){
                    System.out.println("Qual média deseja calcular?\n1 - aritmética \n2 - Ponderada");
                    int tipoMedia = Integer.parseInt(ler.nextLine());

                    if (tipoMedia == 1) {
                        calculo.mediaAritmetica(notas);
                    } else if (tipoMedia == 2) {
                        recebePesos();
                    }

                    loop = false;
                } else if(!continua.equals("sim")){
                    System.out.println("opção incorreta! tente novamente.");
                }
            }
        return notas;
    }

    public void recebePesos(){
        int i = 0;
        System.out.println("tamanho array notas: " + this.notas.size());
        while (i < this.notas.size()) {
            System.out.println("Insira o peso: ");
            double peso = Double.parseDouble(ler.nextLine());

            pesos.add(peso);
            i++;

        }
        calculo.mediaPonderada(notas, pesos);
    }
}
