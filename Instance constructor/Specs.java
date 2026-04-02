class Specs{
    String brand;
    String color;
    String type;
    String frameMaterial;
    String lensType;
    String shape;
    String size;
    String origin;
    double price;
    double weight;

    Specs(String brand, String color, String type, String frameMaterial,
          String lensType, String shape, String size, String origin,
          double price, double weight) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.frameMaterial = frameMaterial;
        this.lensType = lensType;
        this.shape = shape;
        this.size = size;
        this.origin = origin;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Frame Material: " + frameMaterial);
        System.out.println("Lens Type: " + lensType);
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
        System.out.println("Origin: " + origin);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}

