class Silencer{
	String brand;
	double price;
	String material;
	double length;
	double weight;
	boolean isDetachable;
	String color;
	String type;
	boolean isUniversal;
	int warranty;

	Silencer(String brand,double price,String material,double length,double weight,
	boolean isDetachable,String color,String type,boolean isUniversal,int warranty){
		this.brand=brand;
		this.price=price;
		this.material=material;
		this.length=length;
		this.weight=weight;
		this.isDetachable=isDetachable;
		this.color=color;
		this.type=type;
		this.isUniversal=isUniversal;
		this.warranty=warranty;
	}

	void display(){
		System.out.println("displaying the properties of silencer");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("material:"+material);
		System.out.println("length:"+length);
		System.out.println("weight:"+weight);
		System.out.println("isDetachable:"+isDetachable);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("isUniversal:"+isUniversal);
		System.out.println("warranty:"+warranty);
	}
}

