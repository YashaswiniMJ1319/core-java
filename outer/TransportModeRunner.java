package com.exm.demo.outer;

import com.exm.demo.inner.TransportMode;

public class TransportModeRunner {
    public static void main(String[] args) {
        TransportMode mode1 = new TransportMode("Bus", 80, 25, "Blue", true);

        TransportMode mode2 = new TransportMode("Bus", 80, 30, "Red", false);

        TransportMode mode3 = new TransportMode("Train", 120, 50, "White", true);

        System.out.println(mode1.equals(mode2));
        System.out.println(mode1.equals(mode3));
    }
}
