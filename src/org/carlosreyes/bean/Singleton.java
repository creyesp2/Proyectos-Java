package org.carlosreyes.bean;

/**
 *
 * @author carlo
 */
public class Singleton {

    private static Singleton instancia;

    private Singleton() {

    }

    public static  Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

}
