package one.digitalinnovation.gof.strategy;

import static java.lang.System.out;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover(){
        out.println("Movendo-se normalmente...");
    }

}
