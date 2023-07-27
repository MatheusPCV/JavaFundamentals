package exerciciosGpt;

public class Exercicio01 {

	public static void main (String[]args) {
		int [] [] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		int aux01 = 0;
		int aux02;
		
		for(int[] linha : matriz) {
			for(int numeros : linha) {
				aux02 = numeros;
				if(aux01 > aux02);
				else
					aux01 = aux02;
			}
		}
	System.out.println(aux01);
	}

}
