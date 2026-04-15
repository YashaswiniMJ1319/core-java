class Glove{
	String brand;
	double price;
	String material;
	String size;
	boolean isWaterproof;
	String type;
	boolean isReusable;
	String color;
	boolean isLatex;
	double weight;

	Glove(String brand,double price,String material,String size,boolean isWaterproof,
	String type,boolean isReusable,String color,boolean isLatex,double weight){
		this.brand=brand;
		this.price=price;
		this.material=material;
		this.size=size;
		this.isWaterproof=isWaterproof;
		this.type=type;
		this.isReusable=isReusable;
		this.color=color;
		this.isLatex=isLatex;
		this.weight=weight;
	}

	void display(){
		System.out.println("displaying the properties of glove");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("material:"+material);
		System.out.println("size:"+size);
		System.out.println("isWaterproof:"+isWaterproof);
		System.out.println("type:"+type);
		System.out.println("isReusable:"+isReusable);
		System.out.println("color:"+color);
		System.out.println("isLatex:"+isLatex);
		System.out.println("weight:"+weight);
	}
}

