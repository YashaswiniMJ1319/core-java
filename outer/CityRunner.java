package com.exm.demo.outer;

import com.exm.demo.inner.City;

public class CityRunner {
    public static void main(String[] args) {
        City city1 = new City("Bangalore", "Karnataka", 12000000, 741, true);

        City city2 = new City("Bangalore", "Karnataka", 13000000, 800, true);

        City city3 = new City("Mumbai", "Maharashtra", 20000000, 603, true);

        System.out.println(city1.equals(city2));
        System.out.println(city1.equals(city3));
    }
}
