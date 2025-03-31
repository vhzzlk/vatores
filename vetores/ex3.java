package vetores;

import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        int[] vetor = new int[8];
        Random random = new Random();
        int maior = 0;
        int menor = 100;  

        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
            System.out.print(vetor[i] + " ");
            
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("\nMaior número: " + maior + "\nMenor número: " + menor);
    }
}
