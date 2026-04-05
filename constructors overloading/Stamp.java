class Stamp {

    String brand;
    String type;
    String color;
    double price;
    double weight;

    Stamp() {
        System.out.println("Default constructor");
    }

    Stamp(String brand){
        this.brand = brand;
    }

    Stamp(String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    Stamp(String brand, String type, String color){
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    Stamp(String brand, String type, String color, double price){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    Stamp(String brand, String type, String color, double price, double weight){
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
        System.out.println("Weight: " + weight + "g");
        System.out.println("----------------------------");
    }
}