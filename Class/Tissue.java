class Tissue{
	String brand;
	double price;
	int quantity;
	String type;
	boolean isSoft;
	int layers;
	boolean isRecycled;
	String color;
	boolean isScented;
	double weight;

	Tissue(String brand,double price,int quantity,String type,boolean isSoft,int layers,
	boolean isRecycled,String color,boolean isScented,double weight){
		this.brand=brand;
		this.price=price;
		this.quantity=quantity;
		this.type=type;
		this.isSoft=isSoft;
		this.layers=layers;
		this.isRecycled=isRecycled;
		this.color=color;
		this.isScented=isScented;
		this.weight=weight;
	}

	void display(){
		System.out.println("displaying the properties of tissue");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
		System.out.println("type:"+type);
		System.out.println("isSoft:"+isSoft);
		System.out.println("layers:"+layers);
		System.out.println("isRecycled:"+isRecycled);
		System.out.println("color:"+color);
		System.out.println("isScented:"+isScented);
		System.out.println("weight:"+weight);
	}
}

