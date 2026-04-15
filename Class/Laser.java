class Laser{
	String brand;
	double price;
	double power;
	String type;
	boolean isPortable;
	double wavelength;
	boolean isRechargeable;
	String color;
	boolean isWaterproof;
	double weight;

	Laser(String brand,double price,double power,String type,boolean isPortable,
	double wavelength,boolean isRechargeable,String color,boolean isWaterproof,double weight){
		this.brand=brand;
		this.price=price;
		this.power=power;
		this.type=type;
		this.isPortable=isPortable;
		this.wavelength=wavelength;
		this.isRechargeable=isRechargeable;
		this.color=color;
		this.isWaterproof=isWaterproof;
		this.weight=weight;
	}

	void display(){
		System.out.println("displaying the properties of laser");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("power:"+power);
		System.out.println("type:"+type);
		System.out.println("isPortable:"+isPortable);
		System.out.println("wavelength:"+wavelength);
		System.out.println("isRechargeable:"+isRechargeable);
		System.out.println("color:"+color);
		System.out.println("isWaterproof:"+isWaterproof);
		System.out.println("weight:"+weight);
	}
}

