package estudandojava.bootcamp.desafios.modulo4;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class UmaChamadaRecursiva {
    public static void main(String[] args) {
        //TODO: Imprima o somatório de N (utilize o método "somatorio").

        int N = 0;
        int soma = 0;

        /* Estrutura de repetição:
           Caso o usuário insira algo diferente de um número inteiro,
           irá repetir até executar corretamente.*/
        while(true) {

            //Criando o objeto scanner.
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            try {
                System.out.println("\nDigite um número:");
                N = scanner.nextInt();
                break;

            // Tratamento de exceção caso o usuário insira algo diferente de um número inteiro.
            } catch (InputMismatchException e) {
                System.out.println( "\nEntrada de dados inválida, entrada esperada: NÚMERO INTEIRO. " +
                        "Tente novamente.");
            }
        }

        for (int i = N; i > 0; i--){
            soma += i;
        }

        System.out.println("\nA soma de todos os números de 1 até "+ N + " é: " + soma + ".");
    }
}
