class Tyre {

    String brand;
    String type;
    String size;
    double price;
    double weight;

    Tyre() {
        System.out.println("Default constructor");
    }

    Tyre(String brand) {
        this.brand = brand;
    }

    Tyre(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    Tyre(String brand, String type, String size) {
        this.brand = brand;
        this.type = type;
        this.size = size;
    }

    Tyre(String brand, String type, String size, double price) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    Tyre(String brand, String type, String size, double price, double weight) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("----------------------------");
    }
}