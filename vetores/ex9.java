package vetores;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorOriginal = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int indicePares = 0;
        int indiceImpares = 0;

    System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            vetorOriginal[i] = sc.nextInt();
        }
    for (int i = 0; i < 10; i++) {
            if (vetorOriginal[i] % 2 == 0) {
                pares[indicePares++] = vetorOriginal[i];
            } else {
                impares[indiceImpares++] = vetorOriginal[i];
            }
        }
    System.out.println("\nVetor original:");
    for (int num : vetorOriginal) {
            System.out.print(num + " ");
        }
    System.out.println("\n\nNúmeros pares:");
    for (int i = 0; i < indicePares; i++) {
            System.out.print(pares[i] + " ");
        }
    System.out.println("\n\nNúmeros ímpares:");
    for (int i = 0; i < indiceImpares; i++) {
        System.out.print(impares[i] + " ");
        }

        sc.close();
    }
}
