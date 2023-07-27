package palindromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op = 1;
		String word;
		do {
			System.out.println("Digite uma palavra:");
			word = in.next();
			int firstPosition = 0;
			int lastPosition = word.length() - 1;
			boolean isPalindrome = true;
			
			while(firstPosition < lastPosition) {
				if(word.charAt(firstPosition) != word.charAt(lastPosition))
					isPalindrome = false;

					firstPosition++;
					lastPosition--;
				}
			
			if(isPalindrome) 
				System.out.println("A palavra digitada é um palindromo.");
			else
				System.out.println("A palavra digitada NÃO é um palindromo.");
			
			System.out.println("Deseja testar outra palavra? 1-Sim || 2-Não");
			in.nextLine();
			op = in.nextInt();
		}while(op == 1);
		
		in.close();
	}
}


