class InkPad {

    String brand;
    String color;
    String type;
    String size;
    String material;
    String usage;
    String origin;
    String shape;
    double price;
    double weight;

    InkPad(String brand, String color, String type, String size,String material, String usage, String origin, String shape,double price, double weight) 
	{

        this.brand = brand;
        this.color = color;
        this.type = type;
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
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Usage: " + usage);
        System.out.println("Origin: " + origin);
        System.out.println("Shape: " + shape);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}

