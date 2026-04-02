class SoftDrink {

    String brand;
    String flavor;
    String color;
    String type;
    String packaging;
    String origin;
    String sugarContent;
    String carbonation;
    double price;
    double volume; 

    SoftDrink(String brand, String flavor, String color, String type,String packaging, String origin, String sugarContent, String carbonation,double price, double volume)
	{

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.type = type;
        this.packaging = packaging;
        this.origin = origin;
        this.sugarContent = sugarContent;
        this.carbonation = carbonation;
        this.price = price;
        this.volume = volume;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Packaging: " + packaging);
        System.out.println("Origin: " + origin);
        System.out.println("Sugar Content: " + sugarContent);
        System.out.println("Carbonation: " + carbonation);
        System.out.println("Price: " + price);
        System.out.println("Volume: " + volume);
        System.out.println("----------------------------");
    }
}

