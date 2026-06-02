package com.exm.demo.outer;

import com.exm.demo.inner.Battery;

public class BatteryRunner {
    public static void main(String[] args) {

        Battery battery1 = new Battery("Duracell", 5000, "Lithium", 800, true);

        Battery battery2 = new Battery("Duracell", 5000, "Lithium", 900, false);

        Battery battery3 = new Battery("Amaron", 7000, "Acid", 1200, true);

        System.out.println(battery1.equals(battery3));
        System.out.println(battery1.equals(battery2));

    }
}
