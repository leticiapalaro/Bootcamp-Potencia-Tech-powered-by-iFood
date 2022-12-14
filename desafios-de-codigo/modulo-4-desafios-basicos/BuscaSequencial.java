package estudandojava.desafios.modulo4;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.*;

public class BuscaSequencial {
    public static void main(String[] args) {

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int numero = 0; // Variável utlizada para entrada do usuário.


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
                out.println(
                    "\nEntrada de dados inválida, entrada esperada: NÚMERO INTEIRO. " +
                    "Tente novamente."
                );
            }
        }


        /*
         * String posicao - informará o resultado da busca.
         * Por padrão ela irá vir com resultado não encontrado.
         * A estrutura de repetição FOR irá alterar o resultado se necessário.
         */

        String posicao = "\nNúmero " + numero + " não encontrado!";

        for (int i = 0; i < elementos.length; i++) {
            posicao = (elementos[i] == numero) ? "\nAchei " + numero + " na posição " + i +"!": posicao;
        }

        out.println(posicao);
    }
}
