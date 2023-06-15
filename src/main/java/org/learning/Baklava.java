package org.learning;

import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class Baklava {
    int kg;
    String origin;

    BigDecimal priceAsEuro;
    BigDecimal exchangeRate;


    Baklava(int kg, String origin, BigDecimal priceAsEuro) {
        this.kg = kg;
        this.origin = origin;
        this.priceAsEuro = priceAsEuro;
    }

    Baklava(int kg, String origin, BigDecimal priceAsEuro, BigDecimal exchangeRate) {
        this.kg = kg;
        this.origin = origin;
        this.priceAsEuro = priceAsEuro.multiply(exchangeRate);
    }


    @Override
    public String toString() {
        return "Baklava{" +
                "kg=" + kg +
                ", origin='" + origin + '\'' +
                ", priceAsEuro=" + priceAsEuro +
                '}';
    }
}
