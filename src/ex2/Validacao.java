package ex2;

public class Validacao {
    public boolean verificarSalario(double salario) {
        if (salario < 500 || salario > 30000){
            return false;
        }
        return true;
    }
}
