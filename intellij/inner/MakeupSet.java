package com.exm.pro.inner;

public abstract class MakeupSet {

    String brand;
    String type;
    double price;
    boolean isWaterProof;

    public MakeupSet() {

    }

    public MakeupSet(String brand, String type, double price, boolean isWaterProof) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.isWaterProof = isWaterProof;
    }

    public void show() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Type : " + this.type);
        System.out.println("Price : " + this.price);
        System.out.println("WaterProof : " + this.isWaterProof);
    }
}