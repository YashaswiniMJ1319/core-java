class ThinkPad {

    String brand;
    String model;
    String processor;
    double price;
    double weight;

    ThinkPad() {
        System.out.println("Default constructor");
    }

    ThinkPad(String brand) {
        this.brand = brand;
    }

    ThinkPad(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    ThinkPad(String brand, String model, String processor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
    }

    ThinkPad(String brand, String model, String processor, double price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.price = price;
    }

    ThinkPad(String brand, String model, String processor, double price, double weight) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}