package vetores;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int[] rotacionado = new int[5];


        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }


        rotacionado[0] = vetor[4];
        for (int i = 1; i < 5; i++) {
            rotacionado[i] = vetor[i - 1];
        }


        System.out.println("\nVetor original: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nVetor rotacionado: ");
        for (int num : rotacionado) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
