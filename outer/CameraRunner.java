package com.exm.demo.outer;

import com.exm.demo.inner.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera1 = new Camera("Canon", 48, 45000, "Black", true);

        Camera camera2 = new Camera("Canon", 48, 50000, "Red", false);

        Camera camera3 = new Camera("Sony", 64, 70000, "Black", true);

        System.out.println(camera1.equals(camera2));
        System.out.println(camera1.equals(camera3));
    }
}
