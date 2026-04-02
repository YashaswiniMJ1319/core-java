class ThinkPad {

    String brand;
    String model;
    String processor;
    String ram;
    String storage;
    String color;
    String operatingSystem;
    String graphics;
    double price;
    double weight; 

    ThinkPad(String brand, String model, String processor, String ram,String storage, String color, String operatingSystem, String graphics,double price, double weight)
	{

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.graphics = graphics;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Color: " + color);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Graphics: " + graphics);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}

