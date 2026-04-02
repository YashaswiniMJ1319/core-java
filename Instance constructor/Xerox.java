class Xerox {

    String brand;
    String type;
    String color;
    String size;
    String speed;
    String usage;
    String origin;
    String model;
    double price;
    double weight;

    Xerox(String brand, String type, String color, String size,
          String speed, String usage, String origin, String model,
          double price, double weight) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
        this.speed = speed;
        this.usage = usage;
        this.origin = origin;
        this.model = model;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("the brand is: " + brand);
        System.out.println("the type is: " + type);
        System.out.println("the color is: " + color);
        System.out.println("the size is: " + size);
        System.out.println("the speed is: " + speed);
        System.out.println("the usage is: " + usage);
        System.out.println("the origin is: " + origin);
        System.out.println("the model is: " + model);
        System.out.println("the price is: " + price);
        System.out.println("the weight is: " + weight);
        System.out.println("----------------------------");
    }
}

