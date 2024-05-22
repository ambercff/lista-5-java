package ex2;

public class Calculo {

    double salario;
    double descontoINSS = 0, descontoIRPF = 0, descontoSaude = 0, acrescimo = 0;

    public Calculo(double salario) {
        this.salario = salario;
    }

    public void calcularINSS(){
        descontoINSS = 0.2 * this.salario;

        System.out.printf("O desconto de INSS será de: %.2f\n", descontoINSS);
    }

    public void calcularIRPF() {
        descontoIRPF = 0.1 * this.salario;

        System.out.printf("O desconto de IPRF será de: %.2f\n", descontoIRPF);
    }

    public void calcularPlanoSaude() {
        descontoSaude = 0.05 * this.salario;
        System.out.printf("O desconto do plano de saúde será de: %.2f\n", descontoSaude);
    }

    public void acrescimoHoras(int horas, double salarioBruto){
        double horaNormal = salarioBruto / 160;
        acrescimo = horaNormal + (horaNormal * 0.5);

        System.out.printf("O acréscimo será de: %.2f\n", acrescimo);
    }

    public void calcularSalarioLiquido(){
        this.salario = this.salario - (descontoINSS + descontoIRPF + descontoSaude) + acrescimo;
        System.out.printf("O valor do salário líquido é de: %.2f\n", this.salario);
    }
}
