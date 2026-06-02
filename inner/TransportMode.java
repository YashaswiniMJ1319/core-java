package com.exm.demo.inner;

public class TransportMode {
    private String type;
    private int speed;
    private double fare;
    private String color;
    private boolean publicTransport;

    public TransportMode() {

    }

    public TransportMode(String type, int speed, double fare, String color, boolean publicTransport) {
        this.type = type;
        this.speed = speed;
        this.fare = fare;
        this.color = color;
        this.publicTransport = publicTransport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPublicTransport() {
        return publicTransport;
    }

    public void setPublicTransport(boolean publicTransport) {
        this.publicTransport = publicTransport;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            TransportMode mode1 = this;
            if(obj instanceof TransportMode) {
                TransportMode mode2 = (TransportMode) obj;
                if(mode1.type.equals(mode2.type) && mode1.speed == mode2.speed) {
                    return true;
                }
            }
        }
        return false;
    }
}
