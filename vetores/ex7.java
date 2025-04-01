package vetores;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor [] = new int [5];
        int mult, resul;

        for (int i= 0; i <5; i++) {

            System.out.println("Digite o " + (i+1) + "° número");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Digite o Numero que deseja que faça a multplicação: ");
                mult = sc.nextInt();

        for (int i = 0; i< 5; i++) {
            resul = vetor[i] * mult;
            System.out.print(resul + ", ");
        }
        sc.close();
    }
}

