package com.core_java.design_pattern.creational.builder;

public class Payment {

    private final int id;
    private final String paymentMode;
    private final boolean isDone;

    public Payment(Builder builder) {

        this.id = builder.id;
        this.paymentMode = builder.paymentMode;
        this.isDone = builder.isDone;
    }


//    public Payment(int id, String paymentMode, boolean isDone) {
//        this.id = id;
//        this.paymentMode = paymentMode;
//        this.isDone = isDone;
//    }



    // inner class

    public static class Builder{
        private  int id;
        private String paymentMode;
        private boolean isDone;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPaymentMode(String paymentMode) {
            this.paymentMode = paymentMode;
            return this;
        }

        public Builder setIsDone(boolean done) {
            this.isDone = done;
            return this;
        }

        public Payment build(){

            return new Payment(this);
        }
    }

}
