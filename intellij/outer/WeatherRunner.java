package com.exm.pro.outer;

import com.exm.pro.inner.Weather;

public class WeatherRunner {
    public static void main(String[] args) {

        Weather weather1 = new Weather("Sunny", 30, "Bengaluru", 60, false);

        Weather weather2 = new Weather("Cloudy", 30, "Bengaluru", 70, true);

        Weather weather3 = new Weather("Rainy", 22, "Chennai", 80, true);

        System.out.println(weather1.equals(weather2));
        System.out.println(weather1.equals(weather3));
    }
}


