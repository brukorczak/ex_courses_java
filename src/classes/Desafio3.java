package classes;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if(num < 9 && num >= 1 ){
            System.out.println("Este número tem 1 digitos");
        } else if(num < 100 && num >=10){
            System.out.println("Este númetro tem 2 digitos");
        } else if(num <1000 && num >=100){
            System.out.println("Este número tem 3 digitos");
        } else if(num <10000 && num >= 1000){
            System.out.println("Este número tem 4 digitos");
        } else if(num <100000 && num >= 10000){
            System.out.println("Este número tem 5 digitos.");
        } else {
            System.out.println("Este número tem 5 digitos ou mais.");
        }
    }
}
