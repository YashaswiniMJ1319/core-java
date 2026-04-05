class Umbrella {

    String brand;
    String type;
    String color;
    double price;
    double weight;

    Umbrella() {
        System.out.println("Default constructor");
    }

    Umbrella(String brand){
        this.brand = brand;
    }

    Umbrella(String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    Umbrella(String brand, String type, String color){
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    Umbrella(String brand, String type, String color, double price){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    Umbrella(String brand, String type, String color, double price, double weight){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("----------------------------");
    }
}