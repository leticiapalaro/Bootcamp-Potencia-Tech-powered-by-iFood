package estudandojava.desafios.modulo4;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.*;

public class FizzBuzz {
    public static void main(String[] args) {

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".

        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

        /*
         * DESCRIÇÃO DO EXERCÍCIO:
         * Você receberá um número onde:
         * Se o número for um múltiplo de 3 e 5 -> "FizzBuzz"
         * Se o número for apenas múltiplo de 3 -> "Fizz"
         * Se o número for apenas múltiplo de 5 -> "Buzz"
         * Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido.
         */

        int numero = 0; // Variável utilizada para entrada do usuário.
        final int NUMERO_BASE_FIZZ = 3; // Número para calcular o resto da divisão.
        final int NUMERO_BASE_BUZZ = 5; // Número para calcular o resto da divisão.


        /*
         * Estrutura de repetição WHILE:
         * Caso o usuário insira algo diferente de um número inteiro,
         * irá repetir até executar corretamente.
         */

        while(true) {

            //Criando o objeto scanner.
            Scanner scanner = new Scanner(in).useLocale(Locale.US);

            // Tratamento de exceção caso o usuário insira algo diferente de um número inteiro.
            try {
                out.println("Digite um número:");
                numero = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                out.println( "" +
                    "\nEntrada de dados inválida, entrada esperada: NÚMERO INTEIRO. " +
                    "Tente novamente."
                );
            }
        }

        // Parte do código que verifica o resultado final:
        String fizz = (numero % NUMERO_BASE_FIZZ == 0) ? "Fizz" : "";
        String buzz = (numero % NUMERO_BASE_BUZZ == 0) ? "Buzz" : "";

        if (fizz == "" && buzz == "") {
            out.println(numero);
        }else{
            out.println(fizz + buzz);
        }
    }
}
