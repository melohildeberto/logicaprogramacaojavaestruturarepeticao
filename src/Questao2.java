import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        String nome = "";
        String senha = "";
        
        Scanner entradas = new Scanner(System.in);
        while (nome.equals(senha) == true) {
            System.out.println("Informe o nome");
            nome = entradas.next();
            System.out.println("Informe a senha");
            senha = entradas.next();
            if (nome.equals(senha) == true) {
                System.out.println("Os valores para o nome e a senha devem ser diferentes");
            }
        }
        System.out.println("Fim do loop");
    }
}
