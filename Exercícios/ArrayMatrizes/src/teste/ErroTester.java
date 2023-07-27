package teste;

import java.util.*;

public class ErroTester {

	public static void main(String[]args) {
		int valor = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número INTEIRO");
		try {
			valor = in.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Você digitou errado seu burro!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(valor);
	}

}
