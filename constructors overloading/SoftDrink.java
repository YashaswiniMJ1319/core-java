class SoftDrink {

    String brand;
    String flavor;
    String color;
    double price;
    double volume;

    SoftDrink() {
        System.out.println("Default constructor");
    }

    SoftDrink(String brand){
        this.brand = brand;
    }

    SoftDrink(String brand, String flavor){
        this.brand = brand;
        this.flavor = flavor;
    }

    SoftDrink(String brand, String flavor, String color){
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
    }

    SoftDrink(String brand, String flavor, String color, double price){
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
    }

    SoftDrink(String brand, String flavor, String color, double price, double volume){
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.volume = volume;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Volume: " + volume);
        System.out.println("----------------------------");
    }
}