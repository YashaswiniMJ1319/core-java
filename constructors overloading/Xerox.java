class Xerox {

    String brand;
    String type;
    String color;
    double price;
    double weight;

    Xerox() {
        System.out.println("Default constructor");
    }

    Xerox(String brand){
        this.brand = brand;
    }

    Xerox(String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    Xerox(String brand, String type, String color){
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    Xerox(String brand, String type, String color, double price){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    Xerox(String brand, String type, String color, double price, double weight){
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
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}