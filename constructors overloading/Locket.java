class Locket {
    String name;
    String brand;
    double price;
    double weight;
	int size;

    Locket() {
	   System.out.println("Default constructor");
	}
	   
	Locket(String name){
		this.name=name;
	}
	Locket(String name,String brand){
		this.name=name;
		this.brand=brand;
	}
	Locket(String name,String brand,double price){
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	Locket(String name,String brand,double price,double weight){
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.weight=weight;
	}
	Locket(String name,String brand,double price,double weight,int size){
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.weight=weight;
		this.size=size;
	}
	

        void display() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
		System.out.println("size: " + size);
		
		System.out.println("\n-----------------------\n");
		
       
    }
}  

