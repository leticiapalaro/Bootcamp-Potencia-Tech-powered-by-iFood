package estudandojava.bootcamp.desafios.modulo4;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SomandoMultiplos {

    public static void main(String[] args) {
        //TODO: Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        int A = 0;
        int N = 0;
        int soma = 0;

        /* Estrutura de repetição:
           Caso o usuário insira algo diferente de um número inteiro,
           irá repetir até executar corretamente.*/
        while(true) {

            //Criando o objeto scanner.
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            try {
                System.out.println("Digite o primeiro número:");
                A = scanner.nextInt();

                System.out.println("\nDigite o segundo número:");
                N = scanner.nextInt();
                break;

            // Tratamento de exceção caso o usuário insira algo diferente de um número inteiro.
            } catch (InputMismatchException e) {
                System.out.println( "\nEntrada de dados inválida, entrada esperada: NÚMERO INTEIRO. " +
                                    "Tente novamente.");
            }
        }

        for (int i = A; i <= N; i++){
            int restoDivisao = i % A;
            if (restoDivisao == 0) { soma += i; }
        }

        System.out.println("\nValor da soma de todos múltiplos do primeiro número, com limite no segundo número: " + soma);
    }
}
