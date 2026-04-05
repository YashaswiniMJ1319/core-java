class Boomer {
    String brand;
    String type;
    String material;
    double price;
    double weight;

    Boomer() {
        System.out.println("Default constructor");
    }

    Boomer(String brand){
        this.brand = brand;
    }

    Boomer(String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    Boomer(String brand, String type, String material){
        this.brand = brand;
        this.type = type;
        this.material = material;
    }

    Boomer(String brand, String type, String material, double price){
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.price = price;
    }

    Boomer(String brand, String type, String material, double price, double weight){
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}