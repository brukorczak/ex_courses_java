package classes;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        //calculator
        System.out.println("Digite o num1 op num2 (2 * 4): ");

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        char op = scanner.next().charAt(0);
        double num2 = scanner.nextDouble();

        if(op == '+'){
            System.out.println((int) num1 + num2);
        } else if (op == '-') {
            System.out.println((int) num1 - num2);
        } else if (op == '*') {
            System.out.println((int) num1 * num2);
        } else if (op == '/'){
            System.out.println((int) num1 / num2);
        } else {
            System.out.println("Operação inválida");
        }

        // outros exercicios
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();

        if(n % 2 == 1)
            System.out.println("Impar");
        else {
            if(n>=2 && n <=5){
                System.out.println("A");
            } else if (n>= 6 && n <=20) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
         */

        /*
       //ex1
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */
    }
}
