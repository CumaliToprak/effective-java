package org.learning;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

      /*  Baklava baklava = new BaklavaBuilder().setKg(1).setOrigin("tr").build();
        System.out.println(baklava);*/

        Baklava greece = new BaklavaBuilder.Greece().setKg(1).setOrigin("Tr").setPriceAsEuro(100f).build();
        System.out.println(greece);

        Baklava baklava = new Baklava(1,"","");
        System.out.println(baklava);


    }
}