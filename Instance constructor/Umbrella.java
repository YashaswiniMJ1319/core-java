class Umbrella {

    String brand;
    String type;
    String color;
    String material;
    String handleType;
    String size;
    String usage;
    String origin;
    double price;
    double weight;

    Umbrella(String brand, String type, String color, String material,String handleType, String size, String usage, String origin,double price, double weight) 
	{

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.material = material;
        this.handleType = handleType;
        this.size = size;
        this.usage = usage;
        this.origin = origin;
        this.price = price;
        this.weight = weight;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Handle Type: " + handleType);
        System.out.println("Size: " + size);
        System.out.println("Usage: " + usage);
        System.out.println("Origin: " + origin);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("----------------------------");
    }
}

