package estudandojava.desafios.modulo7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class QuadradosPerfeitos {

    /**
     * @param valor receberá um valor e irá calcular a Raiz Quadrada dele.
     * @return retorná um Boolean que indicará se o número é um Quadrado Perfeito.
     */

    public static boolean verificaQuadradoPerfeito(int valor) {
        double raizQuadrada = Math.sqrt(valor);
        return ((int) raizQuadrada == raizQuadrada);
    }

    public static void main(String args[]) {

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.

        // Criando o objeto scanner:
        Scanner scanner = new Scanner(in);


        // Lista que irá armazenar os quadrados perfeitos encontrados:
        List<Integer> quadradosPerfeitos = new ArrayList<>();


        // Entrada do usuário:
        out.println("Digite um número: ");
        int entradaUsuario = scanner.nextInt();


        // Verificador de quadrados perfeitos:
        for (int i = 1; i < entradaUsuario; i++) {
            if (verificaQuadradoPerfeito(i)) quadradosPerfeitos.add(0, i);
        }

        /*
         * Estrutura que, dentre os números encontratos e armazenados na Lista quadradosPerfeitos,
         * retorna o menor número de Quadrados Perfeitos necessários para efetuar uma soma
         * onde o resultado seja a entradaUsuario.
         */

        int sizeLista = quadradosPerfeitos.size();
        int resultado = entradaUsuario;

        for (int i = 0; i < sizeLista; i++) {

            int varAuxiliar = entradaUsuario;
            int contAuxiliar = 0;

            for (int x = i; x < sizeLista; x++) {
                while((varAuxiliar - quadradosPerfeitos.get(x)) >= 0){
                    varAuxiliar -= quadradosPerfeitos.get(x);
                    contAuxiliar ++;
                }
            }

            if (contAuxiliar < resultado) resultado = contAuxiliar;
        }

        // Resultado:
        out.println(resultado);

    }
}
