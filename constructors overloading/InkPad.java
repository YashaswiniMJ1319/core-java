class InkPad {

    String brand;
    String color;
    String type;
    double price;
    double weight;

    InkPad() {
        System.out.println("Default constructor");
    }

    InkPad(String brand){
        this.brand = brand;
    }

    InkPad(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    InkPad(String brand, String color, String type){
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    InkPad(String brand, String color, String type, double price){
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    InkPad(String brand, String color, String type, double price, double weight){
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}