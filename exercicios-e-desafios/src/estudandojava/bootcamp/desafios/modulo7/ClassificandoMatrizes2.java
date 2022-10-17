package estudandojava.bootcamp.desafios.modulo7;

import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;

public class ClassificandoMatrizes2 {

    public static void main(String args[]) {

        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares


        // Criando o objeto scanner:
        Scanner input = new Scanner(in);


        int tamanhoArray = input.nextInt();
        int [] nums = new int[tamanhoArray];
        int primeiroDoIndex = 0;


        // Gerando o array inicial:
        for (int i = 0; i < tamanhoArray; i++) nums[i] = input.nextInt();


        // Lista que irá armazenar os números, sem repetição de itens, com pares no inicio:
        LinkedHashSet<Integer> listaFinal = new LinkedHashSet<>();


        // Estrutura de Repetição que ordena o array:
        for(int i = 0; i < tamanhoArray; i++) {
            if(nums[i] % 2 == 0) {
                int varAuxiliar = nums[primeiroDoIndex];
                nums[primeiroDoIndex] = nums[i];
                nums[i] = varAuxiliar;
                primeiroDoIndex++;
            }
        }


        // Colocando em um LinkedHashSet, assim elimina os números repetidos:
        for(int numero : nums) listaFinal.add(numero);


        // Resultado:
        for(int numero : listaFinal) out.println(numero);
    }
}


