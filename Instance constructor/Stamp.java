class Stamp {

    String brand;
    String type;
    String color;
    String size;
    String material;
    String usage;
    String origin;
    String shape;
    double price;
    double weight;

    Stamp(String brand, String type, String color, String size,String material, String usage, String origin, String shape,double price, double weight) 
	{

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
        this.material = material;
        this.usage = usage;
        this.origin = origin;
        this.shape = shape;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Usage: " + usage);
        System.out.println("Origin: " + origin);
        System.out.println("Shape: " + shape);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight + "g");
        System.out.println("----------------------------");
    }
}

