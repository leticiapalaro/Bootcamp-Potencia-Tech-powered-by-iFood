package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;

import static java.lang.System.out;

public class Teste {

    public static void main(String[] args) {

        // Singleton - Testes

        SingletonLazy lazy = SingletonLazy.getInstancia();
        out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        out.println(lazyHolder);

    }

}