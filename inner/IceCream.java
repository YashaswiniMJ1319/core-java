package com.exm.demo.inner;

public class IceCream {
    private String flavor;
    private String brand;
    private int quantity;
    private double price;
    private boolean cone;

    public IceCream() {

    }

    public IceCream(String flavor, String brand, int quantity, double price, boolean cone) {
        this.flavor = flavor;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.cone = cone;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCone() {
        return cone;
    }

    public void setCone(boolean cone) {
        this.cone = cone;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            IceCream iceCream1 = this;
            if(obj instanceof IceCream) {
                IceCream iceCream2 = (IceCream) obj;
                if(iceCream1.flavor.equals(iceCream2.flavor) && iceCream1.brand.equals(iceCream2.brand)) {
                    return true;
                }
            }
        }
        return false;
    }
}
