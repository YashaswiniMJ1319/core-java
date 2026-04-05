class Locker {
    String brand;
    String material;
    String color;
    double price;
    double weight;

    Locker() {
        System.out.println("Default constructor");
    }

    Locker(String brand){
        this.brand = brand;
    }

    Locker(String brand, String material){
        this.brand = brand;
        this.material = material;
    }

    Locker(String brand, String material, String color){
        this.brand = brand;
        this.material = material;
        this.color = color;
    }

    Locker(String brand, String material, String color, double price){
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    Locker(String brand, String material, String color, double price, double weight){
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}