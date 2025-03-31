package vetores;

import java.util.Random;

public class ex2 {
	
    public static void main(String[] args) {
    	
        int[] vetor = new int[10];
        Random random = new Random();
        int soma = 0;

        System.out.print("Números gerados: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
            System.out.print(vetor[i] + " ");
            soma += vetor[i];
        }
        System.out.println("\nSoma total: " + soma);
    }
}
