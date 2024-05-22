package ex2;

import java.util.Scanner;

public class EntradaSaida {

    Scanner ler = new Scanner(System.in);
    Validacao validacao = new Validacao();

    public boolean recebeSalario(){
        while(true){
            System.out.println("Informe o salário bruto: ");
            double salario = Double.parseDouble(ler.nextLine());

            if (validacao.verificarSalario(salario) == false) {
                System.out.println("O salário deve ser entre 500 e 30.000!");
                continue;
            }

            System.out.println("Quantas horas extras você fez?");
            int horas = Integer.parseInt(ler.nextLine());

            Calculo calculo = new Calculo(salario);

            calculo.calcularINSS();
            calculo.calcularIRPF();
            calculo.calcularPlanoSaude();
            calculo.acrescimoHoras(horas, salario);
            calculo.calcularSalarioLiquido();

            return false;

        }

    }

}
