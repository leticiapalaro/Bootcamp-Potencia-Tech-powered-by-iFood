package estudandojava.bootcamp.desafios.modulo7;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;
public class FatorialDesajeitado {

    public static void main(String args[]) {

        //TODO: Cálculo do valor do Fatorial Desajeitado de "numero".


        int numero = new Scanner(System.in).nextInt();
        int temp = 0;
        int resultado = 0;


        //Lista que irá armazenar números para somar depois:
        List<Integer> listaNumeros = new ArrayList<>();


        //Quebrando o Fatorial Desajeitado em partes menores e armazenando na lista:
        while (numero >= 3) {
            temp = numero * (numero - 1) / (numero - 2);
            numero -= 3;

            if (listaNumeros.isEmpty()){
                listaNumeros.add(temp);
            }else{
                listaNumeros.add(temp*(-1)); // Nessa parte, se não for o primeiro ciclo do while, seguindo a ordem
            }                                // dos operadores, irá ter um sinal de negativo, por isso o (temp*(-1)).

            listaNumeros.add(numero);
            numero--;
        }

        if (numero == 2){
            temp = numero * (numero - 1);
            listaNumeros.add(temp*(-1)); /* Seguindo a ordem dos operadores,
             * aqui tem um sinal de negativo, por isso o (temp*(-1)). */
        }else if (numero == 1){
            listaNumeros.add(numero*(-1)); // Seguindo a ordem dos operadores,
        }                                  // aqui tem um sinal de negativo, por isso o (temp*(-1)).


        // Somando todos os números dentro da lista:
        for (int n : listaNumeros) resultado+= n;


        // Resultado:
        out.println(resultado);
    }
}