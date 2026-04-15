class Broccoli{
	String brand;
	double price;
	double weight;
	String type;
	boolean isOrganic;
	String color;
	boolean isFresh;
	String origin;
	boolean isPacked;
	int quantity;

	Broccoli(String brand,double price,double weight,String type,boolean isOrganic,
	String color,boolean isFresh,String origin,boolean isPacked,int quantity){
		this.brand=brand;
		this.price=price;
		this.weight=weight;
		this.type=type;
		this.isOrganic=isOrganic;
		this.color=color;
		this.isFresh=isFresh;
		this.origin=origin;
		this.isPacked=isPacked;
		this.quantity=quantity;
	}

	void display(){
		System.out.println("displaying the properties of broccoli");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("weight:"+weight);
		System.out.println("type:"+type);
		System.out.println("isOrganic:"+isOrganic);
		System.out.println("color:"+color);
		System.out.println("isFresh:"+isFresh);
		System.out.println("origin:"+origin);
		System.out.println("isPacked:"+isPacked);
		System.out.println("quantity:"+quantity);
	}
}

