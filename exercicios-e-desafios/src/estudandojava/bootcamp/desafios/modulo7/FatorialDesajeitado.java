package estudandojava.bootcamp.desafios.modulo7;
import java.util.Scanner;
import static java.lang.System.out;

public class FatorialDesajeitado {

    public static void main(String[] args) {

        //TODO: Cálculo do valor do Fatorial Desajeitado de "numero".

        int numero = new Scanner(System.in).nextInt();
        int resultado = 0; // variável que irá armazenar o resultado
        int tmp = numero; // variável temporária para armazenar valores
        numero--;

        while (numero > 0) {

            tmp *= numero;
            numero--;

            if(numero != 0){ // evitando divisão por zero
                tmp /= numero;
                numero--;
            }

            tmp += numero;
            numero--;

            resultado += tmp;

            tmp = -numero;

            /*
             * Se sobrar apenas 1 na variável número,
             * como a próxima rotação é a multiplicação
             * o resultado será o mesmo até este ponto.
             * Então o resultado final já será vinculadado.
             */

            if (numero == 1 ){
                resultado += tmp;
                break;
            }

            numero--;
        }

        out.println(resultado);
    }
}