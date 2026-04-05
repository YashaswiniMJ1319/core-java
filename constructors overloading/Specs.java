class Specs{
    String brand;
    String color;
    String type;
    double price;
    double weight;

    Specs() {
		System.out.println("Default constructor");
	}
	Specs(String brand){
		this.brand=brand;
	}
	Specs(String brand,String color){
		this.brand=brand;
		this.color=color;
	}
	Specs(String brand,String color,String type){
		this.brand=brand;
		this.color=color;
		this.type=type;
	}
	Specs(String brand,String color,String type,double price){
		this.brand=brand;
		this.color=color;
		this.type=type;
		this.price=price;
	}
	Specs(String brand,String color,String type,double price,double weight){
		this.brand=brand;
		this.color=color;
		this.type=type;
		this.price=price;
		this.weight=weight;
	}
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}   








