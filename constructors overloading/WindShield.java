class WindShield {

    String brand;
    String type;
    String material;
    double price;
    double thickness;

    WindShield() {
        System.out.println("Default constructor");
    }

    WindShield(String brand) {
        this.brand = brand;
    }

    WindShield(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    WindShield(String brand, String type, String material) {
        this.brand = brand;
        this.type = type;
        this.material = material;
    }

    WindShield(String brand, String type, String material, double price) {
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.price = price;
    }

    WindShield(String brand, String type, String material, double price, double thickness) {
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.price = price;
        this.thickness = thickness;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Thickness: " + thickness);
        System.out.println("----------------------------");
    }
}