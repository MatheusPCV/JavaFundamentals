package estoque;

import java.util.Scanner;

public class ProdutoTester {

	public static void main(String[] args) {

		
		int tempIdProduto;
		int tempQuantidade;
		String tempNome = "";
		double tempPreco;
		int maxSize = -1;
		
		Scanner in = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Insira um número de produtod que gostaria de adicionar:");
				System.out.println("Insira 0 (zero) se nao quiser adicioonar produtos");
			
				maxSize = in.nextInt();
				
				if(maxSize < 0)
					throw new Exception();
			}
			catch(InputMismatchException e) {
				in.nextLine()
;				System.out.println("Tipo incorreto de dado inserido!");
			}
			catch(Exception e){
				in.nextLine();
				System.err.println("O número de produtos não pode ser negativo!");
			}
			
		}while(maxSize < 0);
		
		Produto [] produtos = new Produto[maxSize];
		
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("Digite o ID do seu produto "+ (i+1)+ " :");
			tempIdProduto = in.nextInt();
			in.nextLine();
			
			System.out.println("Digite a quantidade do seu produto"+ (i+1)+ " :");
			tempQuantidade = in.nextInt();
			in.nextLine();
			
			System.out.println("Digite o nome do seu produto "+ (i+1)+ " :");
			tempNome = in.nextLine();
			
			System.out.println("Digite o preço do seu produto "+ (i+1)+ " :");
			tempPreco = in.nextDouble();
			in.nextLine();
			
			
			
			produtos[i] = new Produto(tempIdProduto, tempNome, tempPreco, tempQuantidade);
			System.out.println(produtos[i]);
			
		}
		in.close();
	}

}
