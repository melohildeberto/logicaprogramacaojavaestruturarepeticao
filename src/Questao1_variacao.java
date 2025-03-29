
import java.util.Scanner;

public class Questao1_variacao {
    public static void main(String[] args) {
        float nota = -1;
        Scanner entradas = new Scanner(System.in);
        while (nota < 0 || nota > 10) {
            System.out.println("Informe a nota entre 0(zero) e 10(dez)");
            nota = entradas.nextFloat();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida");
            }
        }
    }
}
