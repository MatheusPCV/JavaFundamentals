package exerciciosGpt;

import java.util.Random;

public class ResolucaoCaina {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3][3];
		
		Random valores = new Random();
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = valores.nextInt(100);
			}
		}
		
		int maior = matriz[0][0];
		System.out.println("Matriz Original:");
		for(int [] vetor: matriz) {
			int soma = 0;
			for(int n : vetor) {
				System.out.print(n + ", ");
				if(n>maior)
					maior=n;
				soma+=n;
			}
			System.out.println("\tSoma = " + soma);
		}
		
		System.out.print("\nMaior numero da matriz:");
		System.out.print(maior);
		
		System.out.print("\n\nDiagonal principal: ");
		int soma=0;
		for(int i=0;i<matriz.length;i++) {
			System.out.print(matriz[i][i]+", ");
			soma+=matriz[i][i];
		}
		System.out.println("\nMedia da diagonal principal = "+ (double)soma/matriz.length);
		
		System.out.print("\nDiagonal secundaria: ");
		soma=0;
		for(int i=0;i<matriz.length;i++) {
			System.out.print(matriz[i][(matriz[0].length-1)-i]+", ");
			soma+=matriz[i][(matriz[0].length-1)-i];
		}
		System.out.println("\nMedia da diagonal secundaria = "+ (double)soma/matriz.length);
		
		
		System.out.println("\nGiro de 90°");
		for(int col=0;col<matriz[0].length;col++){
			for(int lin=matriz.length-1;lin>=0;lin--) {
				System.out.print(matriz[lin][col]+ ", ");
			}
			System.out.println(" ");
		}
		
		
	}
}
