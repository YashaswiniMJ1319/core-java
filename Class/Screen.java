class Screen{
	String brand;
	double price;
	double size;
	String type;
	boolean isTouch;
	int resolution;
	boolean isSmart;
	String color;
	boolean isCurved;
	double weight;

	Screen(String brand,double price,double size,String type,boolean isTouch,int resolution,
	boolean isSmart,String color,boolean isCurved,double weight){
		this.brand=brand;
		this.price=price;
		this.size=size;
		this.type=type;
		this.isTouch=isTouch;
		this.resolution=resolution;
		this.isSmart=isSmart;
		this.color=color;
		this.isCurved=isCurved;
		this.weight=weight;
	}

	void display(){
		System.out.println("displaying the properties of screen");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("size:"+size);
		System.out.println("type:"+type);
		System.out.println("isTouch:"+isTouch);
		System.out.println("resolution:"+resolution);
		System.out.println("isSmart:"+isSmart);
		System.out.println("color:"+color);
		System.out.println("isCurved:"+isCurved);
		System.out.println("weight:"+weight);
	}
}