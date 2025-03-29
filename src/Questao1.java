
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        float nota;
        boolean notaValida = false;
        Scanner entradas = new Scanner(System.in);
        while (notaValida == false) {
            System.out.println("Informe a nota entre 0(zero) e 10(dez)");
            nota = entradas.nextFloat();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            }else{
                notaValida = true;
            }
        }
    }
}
