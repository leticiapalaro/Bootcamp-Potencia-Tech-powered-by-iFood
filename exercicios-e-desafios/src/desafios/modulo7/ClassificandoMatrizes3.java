package desafios.modulo7;

import java.util.LinkedHashSet;
import java.util.Scanner;
import static java.lang.System.out;

public class ClassificandoMatrizes3 {
    public static void main(String args[]) {

        // Criando o objeto scanner:
        Scanner scanner = new Scanner(System.in);

        // Criando a lista de números:
        int tamanhoLista = scanner.nextInt();
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        for ( int i = 0; i < tamanhoLista; i++) nums.add(scanner.nextInt());

        // Resultado:
        for (int num : nums) if ((num % 2) == 0) out.println(num);
        for (int num : nums) if ((num % 2) != 0) out.println(num);

    }
}
