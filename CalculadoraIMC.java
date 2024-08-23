// atividade de Java

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Qual é seu peso em kg? ");
        int peso = scanner.nextInt();

        System.out.println("Qual é sua altura em cm? ");
        int altura = scanner.nextInt();

        int contaImc = peso / altura * altura;

        if (contaImc < 18.5) {
            System.out.println(nome + ", você está abaixo do seu peso ideal");
        } 
        else if(contaImc >= 18.5 && contaImc < 25){
            System.out.println(nome + ", você está no seu peso ideal");
        }
        else if(contaImc >= 25 && contaImc < 30){
            System.out.println(nome + ", você está com sobrepeso");
        }
        else if(contaImc >= 30 && contaImc < 35){
            System.out.println(nome + ", você está com obesidade nível 1");
        }
        else if(contaImc >= 35 && contaImc < 40){
            System.out.println(nome + ", você está com obesidade nível 2");
        }
        else{
            System.out.println(nome + ", você está com obesidade nível 3");
        }

        scanner.close();
    }
}