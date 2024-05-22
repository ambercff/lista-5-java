package ex1;

public class Validacao {
    public boolean verificaNota(double nota){
        if (nota < 0 || nota > 10) {
            return false;
        }
        return true;
    }
}
