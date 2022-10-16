package estudandojava.bootcamp.desafios.modulo7;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

public class ValidacaoDeParenteses {
    public static void main(String[] args) {

        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.

        /*
         * Dada uma string com apenas os seguintes caracteres:
         * '(', ')', '{', '}', '[', ']'
         * determine se uma determinada string é válida.
         * Uma string é considerada válida se os caracteres de abertura
         * forem fechados fechadas pelo mesmo tipo.
         */


        // Criando o objeto scanner:
        Scanner scanner = new Scanner(in);


        // Criando uma lista para validação da entrada do usuário:
        out.println("Digite sua combinação de chaves: ");
        List<String> validacao = Arrays.asList("()","[]","{}");


        // Resultado:
        out.println(validacao.contains(scanner.nextLine()));


        /*
         * Se fossem caracteres com código ASCII sequencial
         * seria possível fazer da sequinte maneira:
         *
         *
         * // Pegando uma entrada do usuário e convertendo no código ASCII de cada carácter:
         * out.println("Digite sua combinação de chaves: ");
         * List<Integer> listaCaracteres = scanner.nextLine().chars()
         *         .boxed()
         *         .collect(Collectors.toList());
         *
         *
         * // Imprimindo o resultado:
         * out.println(String.valueOf(listaCaracteres.get(0).equals((listaCaracteres.get(1)-1))));
         */

    }
}
