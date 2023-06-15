package org.learning;

class BaklavaBuilder {


    //static inner class
    //static inner classes can be directly accessed using new BaklavaBuilder.Greece()
    public static class Greece{
        private int kg;
        private String origin;
        private Float priceAsEuro; //yunanistan

        public Greece setKg(int kg){
            this.kg = kg;
            return this;
        }

        public Greece setOrigin(String origin)
        {
            this.origin = origin;
            return this;
        }

        public Greece setPriceAsEuro(Float price)
        {
            this.priceAsEuro = price;
            return this;
        }

        public Baklava build(){
            return new Baklava(this.kg, this.origin, this.priceAsEuro);
        }
    }

}
