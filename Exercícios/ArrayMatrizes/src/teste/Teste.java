package teste;

public class Teste {

	public static void main(String[] args) {
		int [] [] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		for(int n=0; n<matriz.length;n++) {
			//Diagonal principal
			System.out.println(matriz[n][n]);
		}
		for(int n=0; n<matriz.length;n++) {
			//Diagonal secundaria
			System.out.println(matriz[n][matriz[n].length -1 - n]);
		}
		for(int n=0; n<matriz.length;n++) {
			//90 graus
			
		}
		
	}
}
