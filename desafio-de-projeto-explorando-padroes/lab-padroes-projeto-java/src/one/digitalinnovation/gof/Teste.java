package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

import static java.lang.System.out;

public class Teste {

    public static void main(String[] args) {

        // Singleton - Testes
        out.println("\nTestes com Singleton: ");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        out.println(lazyHolder);

        // Strategy - Testes
        out.println("\nTestes com Strategy: ");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        // Facade - Testes
        out.println("\nTestes com Facade: ");

        Facade facade = new Facade();
        facade.migrarCliente("Letícia", "12123123");

    }

}