package ex1.entities;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> list = new ArrayList<>();

    public void sequence(){
        int a = 0;
        int b = 1;
        int ax;

        for (int i=0; i < 50; i++){
            list.add(a);
            ax = a;
            a += b;
            b = ax;
        }
    }


    public void areInFibonacci(int n){

        if (list.contains(n)){
            System.out.println("Faz parte da sequencia de Fibonacci");
        } else {
            System.out.println("Nao faz parte da sequencia de Fibonacci");
        }

    }

}
