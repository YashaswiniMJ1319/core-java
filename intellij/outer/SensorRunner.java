package com.exm.pro.outer;

import com.exm.pro.inner.Sensor;

public class SensorRunner {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor("Temperature Sensor", "Digital", "Bosch", 100, true);

        Sensor sensor2 = new Sensor("Temperature Sensor", "Digital", "Bosch", 150, false);

        Sensor sensor3 = new Sensor("Pressure Sensor", "Analog", "Sony", 200, true);

        System.out.println(sensor1.equals(sensor2));
        System.out.println(sensor1.equals(sensor3));
    }
}
