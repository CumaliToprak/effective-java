package org.learning;

import java.math.BigDecimal;

class BaklavaBuilder {

    //static inner class
    //static inner classes can be directly accessed using new BaklavaBuilder.Greece()
/*
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
*/

}
