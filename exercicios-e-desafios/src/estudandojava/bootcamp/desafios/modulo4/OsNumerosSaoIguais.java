package estudandojava.bootcamp.desafios.modulo4;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class OsNumerosSaoIguais {
    public static void main(String[] args) {
        //TODO: Imprima se os valores numéricos passados são iguais ou não.

        /*
         * Estrutura de repetição WHILE:
         * Caso o usuário insira algo diferente de um número inteiro,
         * irá repetir até executar corretamente.
         */

        while(true) {

            //Criando o objeto scanner.
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


            // Tratamento de exceção caso o usuário insira algo diferente de um número inteiro.
            try {
                System.out.println("Digite o primeiro número:");
                int A = scanner.nextInt();

                System.out.println("\nDigite o segundo número:");
                int B = scanner.nextInt();

                System.out.println((A == B) ? "\nSão iguais!" : "\nNão são iguais!");
                break;
            } catch (InputMismatchException e) {
                System.out.println(
                    "\nEntrada de dados inválida, entrada esperada: NÚMERO INTEIRO. " +
                    "Tente novamente."
                );
            }

        }
    }
}
