package classes;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        //calcula soma
        Scanner num1Scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1 = num1Scanner.nextDouble();
        Scanner num2Scanner = new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        double num2 = num2Scanner.nextDouble();
        double total = num1 +num2;

        System.out.println("O resultado é : " + total);
    }
}

