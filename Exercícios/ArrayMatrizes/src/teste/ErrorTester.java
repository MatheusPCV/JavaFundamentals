package teste;
import java.util.*;


public class ErrorTester {

    public static void main(String[] args ){
        String []senhas = {"p@ssw0rd", "sEnh@", "1234","admin",
                            "paralelepipedo","321","010203"};

        int i=0;

        Scanner in = new Scanner(System.in);

        do {
            try {
                System.out.println("Informe a posição da senha que deseja expor: ");
                i = in.nextInt();
                if(i>=4 && i<=6) {
                    throw new Exception("Senha restrita");
                }else if (i<0) {
                    throw new Exception("Programa encerrado");
                }
                System.out.println(senhas[i]);
            } 
            catch(InputMismatchException e) {
                in.nextLine();
                System.out.println("Entrada inválida, tente novamente.");
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Senha inexistente, tente novamente.");
            }
            catch (Exception e) {
                System.out.println(e);
            }

        }while(i>=0);
    }
}



