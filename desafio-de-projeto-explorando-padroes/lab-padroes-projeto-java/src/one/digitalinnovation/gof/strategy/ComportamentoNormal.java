package one.digitalinnovation.gof.strategy;

import static java.lang.System.out;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover(){
        out.println("Movendo-se normalmente...");
    }

}
