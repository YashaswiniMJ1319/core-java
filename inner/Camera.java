package com.exm.demo.inner;

public class Camera {
    private String brand;
    private int megapixel;
    private double price;
    private String color;
    private boolean wireless;

    public Camera() {

    }

    public Camera(String brand, int megapixel, double price, String color, boolean wireless) {
        this.brand = brand;
        this.megapixel = megapixel;
        this.price = price;
        this.color = color;
        this.wireless = wireless;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            Camera camera1 = this;
            if(obj instanceof Camera) {
                Camera camera2 = (Camera) obj;
                if(camera1.brand.equals(camera2.brand) && camera1.megapixel == camera2.megapixel) {
                    return true;
                }
            }
        }
        return false;
    }
}
