class Boomer {
    String brand;
    String type;
    String material;
    String color;
    String shape;
    String usage;
    String origin;
    String design;
    double price;
    double weight;

    Boomer(String brand, String type, String material, String color,
           String shape, String usage, String origin, String design,
           double price, double weight) {

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.usage = usage;
        this.origin = origin;
        this.design = design;
        this.price = price;
        this.weight = weight;
    }
    void display() {
        System.out.println("the brand is: " + brand);
        System.out.println("the type is: " + type);
        System.out.println("the material is: " + material);
        System.out.println("the color is: " + color);
        System.out.println("the shape is: " + shape);
        System.out.println("the usage is: " + usage);
        System.out.println("the origin is: " + origin);
        System.out.println("the design is: " + design);
        System.out.println("the price is: " + price);
        System.out.println("the weight is: " + weight);
        System.out.println("----------------------------");
    }
}

