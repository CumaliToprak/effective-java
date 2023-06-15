package org.learning;

import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

      /*Baklava baklava = new BaklavaBuilder().setKg(1).setOrigin("tr").build();
        System.out.println(baklava);*/

        /*Baklava greekBaklava = new BaklavaBuilder.Greece().setKg(1).setOrigin("GREECE").setPriceAsEuro(BigDecimal.valueOf(5.44234)).build();
        System.out.println(greekBaklava);

        Baklava turkishBaklava = new BaklavaBuilder.Turkey().setKg(2).setPriceAsEuro(BigDecimal.valueOf(10)).setOrigin("TR").setExchangeRate(BigDecimal.valueOf(25.3)).build();
        System.out.println(turkishBaklava);*/

        Baklava greeceBaklava = new Baklava.Builder.Greece().setKg(1).setOrigin("GR").setPriceAsEuro(BigDecimal.valueOf(12.21)).build();
        Baklava turkishBaklava = new Baklava.Builder.Turkey().setKg(1).setOrigin("GR").setPriceAsEuro(BigDecimal.valueOf(12.21)).
        setExchangeRate(BigDecimal.valueOf(25.2)).build();

        System.out.println(greeceBaklava);
        System.out.println(turkishBaklava);


    }
}