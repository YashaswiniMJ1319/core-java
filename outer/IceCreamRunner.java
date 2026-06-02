package com.exm.demo.outer;

import com.exm.demo.inner.IceCream;

public class IceCreamRunner {
    public static void main(String[] args) {
        IceCream iceCream1 = new IceCream("Chocolate", "Arun", 2, 120, true);

        IceCream iceCream2 = new IceCream("Chocolate", "Arun", 3, 150, false);

        IceCream iceCream3 = new IceCream("Vanilla", "Amul", 1, 100, true);

        System.out.println(iceCream1.equals(iceCream2));
        System.out.println(iceCream1.equals(iceCream3));
    }
}
