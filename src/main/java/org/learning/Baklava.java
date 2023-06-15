package org.learning;

import lombok.ToString;

@ToString
public class Baklava {
    int kg;
    String origin;

    Float priceAsEuro;

    String city;

    Baklava(int kg, String origin, String city) {
        this.kg = kg;
        this.origin = origin;
        this.city = city;
    }

    Baklava(int kg, String origin, Float priceAsEuro) {
        this.kg = kg;
        this.origin = origin;
        this.priceAsEuro = priceAsEuro;
    }
}
