package estudandojava.desafios.modulo7;
import java.util.LinkedHashSet;
import java.util.Scanner;
import static java.lang.System.out;

public class ClassificandoMatrizes {
    public static void main(String args[]) {

        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares


        // Criando o objeto scanner:
        Scanner scanner = new Scanner(System.in);


        // Criando o array inicial:
        int tamanhoArray = scanner.nextInt();
        int[] nums = new int[tamanhoArray];
        for ( int i = 0; i < tamanhoArray; i++) nums[i] = scanner.nextInt();


        // Organizando o array:
        LinkedHashSet<Integer> novoArray = new LinkedHashSet<>();


        // Colocando os números pares no ínicio:
        for (int num : nums) {
            if ((num % 2) == 0) novoArray.add(num);
        }


        // Mantendo os números ímpares no final:
        for (int num : nums) {
            if ((num % 2) != 0) novoArray.add(num);
        }


        // Resultado:
        for (int numero : novoArray) out.println(numero);

    }
}