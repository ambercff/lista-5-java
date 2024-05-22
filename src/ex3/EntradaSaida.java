package ex3;

import java.util.Scanner;

public class EntradaSaida {
    double salario = 0;
    double qtdeEmprestada = 0;

    Scanner ler = new Scanner(System.in);
    public void recebeDados(){
        System.out.println("Qual seu salário atual?");
        this.salario = Double.parseDouble(ler.nextLine());

        System.out.println("Quanto quer de empréstimo?");
        this.qtdeEmprestada = Double.parseDouble(ler.nextLine());

        Calculo calculo = new Calculo();

        calculo.calcularParcelas(salario, qtdeEmprestada);
    }
}
