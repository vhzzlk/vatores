package vetores;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor [] = new int [5];
		
		for (int i= 0; i <5; i++) {
			
			System.out.println("Digite o " + (i+1) + " número");
			vetor[i] = sc.nextInt();
			}
		
		for (int i = 0; i< 5; i++) {
			System.out.print(vetor[i]+ ", ");
		}
		sc.close();
		}
}
			
	