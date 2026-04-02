class Locker {
    String brand;
    String material;
    String color;
    String type;
    String lockType;
    String size;
    String usage;
    String origin;
    double price;
    double weight;

    Locker(String brand, String material, String color, String type,
           String lockType, String size, String usage, String origin,
           double price, double weight) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.lockType = lockType;
        this.size = size;
        this.usage = usage;
        this.origin = origin;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("the brand is: " + brand);
        System.out.println("the material is: " + material);
        System.out.println("the color is: " + color);
        System.out.println("the type is: " + type);
        System.out.println("the lock type is: " + lockType);
        System.out.println("the size is: " + size);
        System.out.println("the usage is: " + usage);
        System.out.println("the origin is: " + origin);
        System.out.println("the price is: " + price);
        System.out.println("the weight is: " + weight);
        System.out.println("----------------------------");
    }
}

