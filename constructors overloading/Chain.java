class Chain {
    String brand;
    String material;
    String color;
    double price;
    double weight;

    Chain() {
        System.out.println("Default constructor");
    }

    Chain(String brand){
        this.brand = brand;
    }

    Chain(String brand, String material){
        this.brand = brand;
        this.material = material;
    }

    Chain(String brand, String material, String color){
        this.brand = brand;
        this.material = material;
        this.color = color;
    }

    Chain(String brand, String material, String color, double price){
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    Chain(String brand, String material, String color, double price, double weight){
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}