package com.exm.demo.outer;
import com.exm.demo.inner.Animal;
import com.exm.demo.inner.DomAnimal;


public class AnimalRunner {
    public static void main(String[] args) {
        DomAnimal domAnimal=new DomAnimal("Tiger",3,60,true);
        domAnimal.show();
    }
}
