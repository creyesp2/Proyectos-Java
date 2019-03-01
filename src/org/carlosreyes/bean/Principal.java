/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.carlosreyes.bean;

import org.carlosreyes.view.Ventana;

public class Principal {

    public static void main(String args[]) {
        //  Singleton s1 = Singleton.getInstancia();
        /* Singleton s2 = Singleton.getInstancia();
        Singleton s3 = Singleton.getInstancia();
        Singleton s4 = Singleton.getInstancia();
        System.out.println("Instancia:" + s1);
        System.out.println("Instancia:" + s2);
        System.out.println("Instancia:" + s3);
        System.out.println("Instancia:" + s4);*/

        Ventana v = new Ventana();
    }
}
