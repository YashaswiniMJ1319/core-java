class SpaceShip{
	String name;
	double price;
	int crewCapacity;
	String type;
	boolean isReusable;
	double speed;
	boolean isManned;
	String color;
	boolean isOperational;
	double weight;

	SpaceShip(String name,double price,int crewCapacity,String type,boolean isReusable,
	double speed,boolean isManned,String color,boolean isOperational,double weight){
		this.name=name;
		this.price=price;
		this.crewCapacity=crewCapacity;
		this.type=type;
		this.isReusable=isReusable;
		this.speed=speed;
		this.isManned=isManned;
		this.color=color;
		this.isOperational=isOperational;
		this.weight=weight;
	}

	void display(){
		System.out.println("displaying the properties of spaceship");
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("crewCapacity:"+crewCapacity);
		System.out.println("type:"+type);
		System.out.println("isReusable:"+isReusable);
		System.out.println("speed:"+speed);
		System.out.println("isManned:"+isManned);
		System.out.println("color:"+color);
		System.out.println("isOperational:"+isOperational);
		System.out.println("weight:"+weight);
	}
}

