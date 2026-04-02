class Tyre {

    String brand;
    String type;
    String size;
    String material;
    String treadPattern;
    String vehicleType;
    String origin;
    String season;
    double price;
    double weight;

    Tyre(String brand, String type, String size, String material,String treadPattern, String vehicleType, String origin, String season,double price, double weight) 
	{

        this.brand = brand;
        this.type = type;
        this.size = size;
        this.material = material;
        this.treadPattern = treadPattern;
        this.vehicleType = vehicleType;
        this.origin = origin;
        this.season = season;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Tread Pattern: " + treadPattern);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Origin: " + origin);
        System.out.println("Season: " + season);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("----------------------------");
    }
}

