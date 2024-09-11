package ex2.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String st = sc.nextLine();

        st = st.toLowerCase();
        int count = 0;

        for (int i =0; i< st.length(); i++){
            if (st.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
