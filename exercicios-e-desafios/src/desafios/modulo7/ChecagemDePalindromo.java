package estudandojava.desafios.modulo7;
import java.util.Scanner;
import static java.lang.System.*;

public class ChecagemDePalindromo {
    public static void main(String[] args) {

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.


        // Criando o objeto scanner:
        Scanner scanner = new Scanner(in);


        // Entrada do usuário:
        out.println("Digite uma palavra: ");
        String palavraInicial = scanner.nextLine();


        // Separando as letras da palavraInicial:
        String[] splitPalavraInicial = palavraInicial.split("");


        // Criando a String para comparação:
        StringBuilder palavraInvertida = new StringBuilder();
        for (String letra : splitPalavraInicial) palavraInvertida.insert(0, letra);
        out.println(palavraInvertida);


        // Resultado da comparação:
        out.println(String.valueOf(palavraInicial.equals(palavraInvertida.toString())).toUpperCase());

    }
}
