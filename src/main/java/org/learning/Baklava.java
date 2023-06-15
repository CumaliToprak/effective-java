package org.learning;

import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class Baklava {
    int kg;
    String origin;

    BigDecimal priceAsEuro;
    BigDecimal exchangeRate;


    private Baklava(int kg, String origin, BigDecimal priceAsEuro) {
        this.kg = kg;
        this.origin = origin;
        this.priceAsEuro = priceAsEuro;
    }

    private Baklava(int kg, String origin, BigDecimal priceAsEuro, BigDecimal exchangeRate) {
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

    public static class Builder{
        //static inner class
        //static inner classes can be directly accessed using new BaklavaBuilder.Greece()
        public static class Greece{
            private int kg;
            private String origin;
            private BigDecimal priceAsEuro; //yunanistan

            public Greece setKg(int kg){
                this.kg = kg;
                return this;
            }

            public Greece setOrigin(String origin)
            {
                this.origin = origin;
                return this;
            }

            public Greece setPriceAsEuro(BigDecimal priceAsEuro)
            {
                this.priceAsEuro = priceAsEuro;
                return this;
            }

            public Baklava build(){
                return new Baklava(this.kg, this.origin, this.priceAsEuro);
            }
        }

        public static class Turkey{
            private int kg;
            private String origin;
            private BigDecimal priceAsEuro;
            private BigDecimal exchangeRate;

            public Turkey setKg(int kg){
                this.kg = kg;
                return this;
            }

            public Turkey setOrigin(String origin)
            {
                this.origin = origin;
                return this;
            }

            public Turkey setExchangeRate(BigDecimal exchangeRate)
            {
                this.exchangeRate = exchangeRate;
                return this;
            }

            public Turkey setPriceAsEuro(BigDecimal priceAsEuro)
            {
                this.priceAsEuro = priceAsEuro;
                return this;
            }

            public Baklava build(){
                return new Baklava(this.kg, this.origin, this.priceAsEuro, this.exchangeRate);
            }
        }
    }

}
