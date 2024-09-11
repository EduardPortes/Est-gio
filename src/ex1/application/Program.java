package ex1.application;

import ex1.entities.Fibonacci;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        fib.sequence();

        System.out.print("Digite um número inteiro qualquer: ");
        int n = sc.nextInt();

        fib.areInFibonacci(n);

        sc.close();
    }
}
