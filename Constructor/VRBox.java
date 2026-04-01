class VRBox {
    String brand;
    String model;
    double price;
    String compatibility;
    boolean hasController;
    int warranty;
    String color;
    double weight;
    String lensType;
    String usage;

    VRBox(String brand, String model, double price, String compatibility,
          boolean hasController, int warranty, String color,
          double weight, String lensType, String usage) {

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.compatibility = compatibility;
        this.hasController = hasController;
        this.warranty = warranty;
        this.color = color;
        this.weight = weight;
        this.lensType = lensType;
        this.usage = usage;
    }
}