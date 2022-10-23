package estudandojava.desafios.modulo4;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.*;

public class SomandoMultiplos {

    public static void main(String[] args) {
        //TODO: Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        int A = 0;
        int N = 0;
        int soma = 0;

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
                out.println("Digite o primeiro número:");
                A = scanner.nextInt();

                out.println("\nDigite o segundo número:");
                N = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                out.println(
                    "\nEntrada de dados inválida, entrada esperada: NÚMERO INTEIRO. " +
                    "Tente novamente."
                );
            }

        }

        // Estrutura de repetição FOR, irá verificar os múltiplos e realizar o somatório.
        for (int i = A; i <= N; i++){
            int restoDivisao = i % A;
            if (restoDivisao == 0) soma += i;
        }

        out.println(
            "\nValor da soma de todos múltiplos de " + A + " encontrados entre " + A + " e " + N + ": "  + soma + "."
        );
    }
}
