package ex3;

public class Calculo {
    public void calcularParcelas(double salario, double qtdeEmprestada){
        double valorTotal = (qtdeEmprestada * 0.35) + qtdeEmprestada;
        double valorParcela = (valorTotal) / 24;

        Validacao validacao = new Validacao();

        boolean verifica = validacao.verificarValores(valorParcela, salario, qtdeEmprestada);

        if (verifica == false) {
            System.out.println("Você não pode realizar o empréstimo!");
            return;
        }

        System.out.println("**** VALORES ****");
        System.out.printf("Valor parcela: %.2f\n", valorParcela);
        System.out.printf("Valor total: %.2f", valorTotal);
    }
}
