class ArtMaterial {

    String brand;
    String type;
    String color;
    String material;
    String size;
    String usage;
    String origin;
    String packType;
    double price;
    double weight;

    ArtMaterial(String brand, String type, String color, String material,String size, String usage, String origin, String packType,double price, double weight)
	{

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
        this.usage = usage;
        this.origin = origin;
        this.packType = packType;
        this.price = price;
        this.weight = weight;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Usage: " + usage);
        System.out.println("Origin: " + origin);
        System.out.println("Pack Type: " + packType);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}

