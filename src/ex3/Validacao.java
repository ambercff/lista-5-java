package ex3;

public class Validacao {
    public boolean verificarValores(double valorParcela,double salario, double qtdeEmprestada){
        double porcentagemSalario = salario * 0.15;
        if (valorParcela > porcentagemSalario || qtdeEmprestada > 200000){
            return false;
        }
        return true;
    }
}
