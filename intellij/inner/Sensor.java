package com.exm.pro.inner;

public class Sensor {
    private String sensorName;
    private String type;
    private String brand;
    private double range;
    private boolean active;

    public Sensor() {

    }

    public Sensor(String sensorName, String type, String brand, double range, boolean active) {
        this.sensorName = sensorName;
        this.type = type;
        this.brand = brand;
        this.range = range;
        this.active = active;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            Sensor sensor1 = this;
            if (obj instanceof Sensor) {
                Sensor sensor2 = (Sensor) obj;
                if (sensor1.sensorName.equals(sensor2.sensorName) && sensor1.type.equals(sensor2.type)) {

                    return true;
                }
            }
        }

        return false;
    }
}
