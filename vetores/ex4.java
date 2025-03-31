package vetores;

import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        Random random = new Random();
        int pares = 0;

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
            System.out.print(vetor[i] + " ");
            if (vetor[i] % 2 == 0) pares++;
        }
        System.out.println("\nQuantidade de números pares: " + pares);
    }
}
