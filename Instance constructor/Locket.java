class Locket {
    String name;
    String brand;
    String color;
    String material;
    String type;
    String design;
    String shape;
    String origin;
    double price;
    double weight;

    Locket(String name, String brand, String color, String material, String type,
           String design, String shape, String origin, double price, double weight) {

        this.name = name;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.type = type;
        this.design = design;
        this.shape = shape;
        this.origin = origin;
        this.price = price;
        this.weight = weight;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Type: " + type);
        System.out.println("Design: " + design);
        System.out.println("Shape: " + shape);
        System.out.println("Origin: " + origin);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
		System.out.println("\n-----------------------\n");
		
       
    }
}

