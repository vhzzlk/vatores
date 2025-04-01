package vetores;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[6];
        double soma = 0.0;

        System.out.println("Digite as 6 notas do aluno:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / 6;
        System.out.println("\nNotas: ");
        for (double nota : notas) {
            System.out.printf("%.1f ", nota);
        }
        System.out.printf("\n\nMédia: %.1f\n", media);

        System.out.println("Resultado: " + (media >= 7 ? "Aprovado" : "Reprovado"));

        sc.close();
    }
}
