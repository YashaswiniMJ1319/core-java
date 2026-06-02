package com.exm.demo.inner;

public abstract class Animal {

    String name;
    double height;
    double weight;
    boolean isVeg;
    public Animal(){

    }

    public Animal(String name,double height,double weight,boolean isVeg){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.isVeg=isVeg;
    }

    public void show(){
        System.out.println("the name is:"+this.name);
        System.out.println("the height is:"+this.height);
        System.out.println("the weight is:"+this.weight);
        System.out.println("the isVeg is:"+this.isVeg);

    }

}
