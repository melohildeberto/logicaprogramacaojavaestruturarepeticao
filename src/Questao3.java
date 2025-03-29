
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        String nome = "";
        int idade = -1;
        float salario = 0;
        char sexo = 'a';
        char estadoCivil = 'a';

        Scanner entradas = new Scanner(System.in);
       
        while (nome.length() < 3) {
            System.out.println("Informe o nome:");
            nome = entradas.next();
            nome = nome.trim();
            if(nome.length() < 3){
                System.out.println("Nome inválido");
            }
        }
        
        while (idade < 0 || idade > 150) {
            System.out.println("Informe a idade entre 1 e 150:");
            idade = entradas.nextInt();
            if(idade <= 0 || idade > 150){
                System.out.println("Idade inválida");
            }
        }
        while (salario <= 0) {
            System.out.println("Informe o salário:");
            salario = entradas.nextFloat();
            if(salario <= 0){
                System.out.println("Salário inválido");
            }
        }

        while ((sexo == 'f' || sexo == 'm') == false) {
            System.out.println("Informe o sexo 'm' ou 'f':");
            String valor = entradas.next();
            //convertendo a entrada para minúsculo
            valor = valor.toLowerCase();
            sexo = valor.charAt(0);
            if((sexo == 'f' || sexo == 'm') == false){
                System.out.println("Sexo inválido");
            }
        }
        while ((estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') == false) {
            System.out.println("Informe o estado civil 's', 'c', 'v', 'd':");
            String valor = entradas.next();
            //convertendo a entrada para minúsculo
            valor = valor.toLowerCase();
            estadoCivil = valor.charAt(0);
            if((estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') == false) {
                System.out.println("Estado civil inválido");
            }
        }



        // System.out.println("Fim");
        // boolean nomeValido = false;
        // boolean idadeValida = false;
        // while (nomeValido == false || idadeValida == false) {
        //     if (nomeValido == false) {
        //         System.out.println("Informe o nome:");
        //         nome = entradas.nextLine();
        //         if(nome.length() >=3){
        //             nomeValido = true;
        //         }else{
        //             continue;
        //         }
        //     }
        //     if (idadeValida == false) {
        //         System.out.println("Informe a idade:");
        //     }
        //     System.out.println("Informe o salario:");
        //     System.out.println("Informe o sexo:");

        // }

    }
}
