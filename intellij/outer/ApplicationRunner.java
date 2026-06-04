package com.exm.pro.outer;

import com.exm.pro.inner.Application;

public class ApplicationRunner {
    public static void main(String[] args) {
        Application app1 = new Application("WhatsApp", "Meta", 120, 4.5, true);

        Application app2 = new Application("WhatsApp", "Meta", 140, 4.7, true);

        Application app3 = new Application("Instagram", "Meta", 200, 4.3, true);

        System.out.println(app1.equals(app2));
        System.out.println(app1.equals(app3));
    }
}
