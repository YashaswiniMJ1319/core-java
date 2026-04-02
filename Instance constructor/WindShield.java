class WindShield {

    String brand;
    String type;
    String material;
    String color;
    String shape;
    String vehicleType;
    String origin;
    String usage;
    double price;
    double thickness; 

    WindShield(String brand, String type, String material, String color,String shape, String vehicleType, String origin, String usage,double price, double thickness) 
	{

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.vehicleType = vehicleType;
        this.origin = origin;
        this.usage = usage;
        this.price = price;
        this.thickness = thickness;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Origin: " + origin);
        System.out.println("Usage: " + usage);
        System.out.println("Price: " + price);
        System.out.println("Thickness: " + thickness);
        System.out.println("----------------------------");
    }
}

