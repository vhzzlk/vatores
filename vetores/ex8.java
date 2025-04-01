package vetores;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int vetor [] = {1,7,3,4,5};
        for (int i= 0; i <5; i++) {
        System.out.print("Digite o " + (i+1) + "° número: ");
        vetor[i] = sc.nextInt();
    }
System.out.println("\n");
    int vetorx [] = {1,2,3,4,5};
        for (int i= 0; i <5; i++) {
        System.out.print("Digite o " + (i+1) + "° número: ");
        vetor[i] = sc.nextInt();
    }System.out.println("\n");
        for (int i = 0; i< 5; i++) {
            System.out.print(vetor[i]+ ", ");
        }System.out.println("\n");
        for (int i = 0; i< 5; i++) {
            System.out.print(vetorx[i]+ ", ");

        }for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == vetorx[i]) {
                System.out.print("\n");
                System.out.print("Posição " + (i+1) + ": " + vetor[i]);

            }

        }


        sc.close();
    }
}

