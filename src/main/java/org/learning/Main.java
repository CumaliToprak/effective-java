package org.learning;

import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

      /*Baklava baklava = new BaklavaBuilder().setKg(1).setOrigin("tr").build();
        System.out.println(baklava);*/

        Baklava greekBaklava = new BaklavaBuilder.Greece().setKg(1).setOrigin("GREECE").setPriceAsEuro(BigDecimal.valueOf(5.44234)).build();
        System.out.println(greekBaklava);

        Baklava turkishBaklava = new BaklavaBuilder.Turkey().setKg(2).setPriceAsEuro(BigDecimal.valueOf(10)).setOrigin("TR").setExchangeRate(BigDecimal.valueOf(25.3)).build();
        System.out.println(turkishBaklava);

    }
}