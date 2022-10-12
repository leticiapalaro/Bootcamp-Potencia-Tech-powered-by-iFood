package estudandojava.bootcamp.desafios.modulo4;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".

        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

        /*
        Você receberá um número onde:
        Se o número for um múltiplo de 3 e 5 -> "FizzBuzz"
        Se o número for apenas múltiplo de 3 -> "Fizz"
        Se o número for apenas múltiplo de 5 -> "Buzz"
        Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido;
        */

        int numero = 0; // variavel utlizada para entrada do usuário
        final int NUMERO_BASE_FIZZ = 3; // numero para calcular o resto da divisao
        final int NUMERO_BASE_BUZZ = 5; // numero para calcular o resto da divisao

        /*
        Estrutura de repetição:
        Caso o usuário insira algo diferente de um número inteiro,
        irá repetir até executar corretamente.
        */

        while(true) {

            //Criando o objeto scanner.
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            try {
                System.out.println("Digite um número:");
                numero = scanner.nextInt();
                break;

            // Tratamento de exceção caso o usuário insira algo diferente de um número inteiro.
            } catch (InputMismatchException e) {
                System.out.println( "\nEntrada de dados inválida, entrada esperada: NÚMERO INTEIRO. " +
                        "Tente novamente.");
            }
        }

        String fizz = (numero % NUMERO_BASE_FIZZ == 0) ? "Fizz" : "";
        String buzz = (numero % NUMERO_BASE_BUZZ == 0) ? "Buzz" : "";

        if (fizz == "" && buzz == "") {
            System.out.println(numero);
        }else{
            System.out.println(fizz + buzz);
        }
    }
}