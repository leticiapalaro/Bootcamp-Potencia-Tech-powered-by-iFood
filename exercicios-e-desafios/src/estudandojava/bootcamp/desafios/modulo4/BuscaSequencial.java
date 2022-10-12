package estudandojava.bootcamp.desafios.modulo4;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int numero = 0; // variavel utlizada para entrada do usuário

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

        String posicao = "\nNúmero " + numero + " não encontrado!"; // string que informará o resultado da busca

        for (int i = 0; i < elementos.length; i++) {
            posicao = (elementos[i] == numero) ? "\nAchei " + numero + " na posição " + i +"!": posicao;
        }

        System.out.println(posicao);
    }
}
