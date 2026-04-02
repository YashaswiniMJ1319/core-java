class Chain{
String brand;
String material;
String color;
String type;
String design;
String lengthType;
String origin;
String usage;
double price;
double weight;

Chain(String brand, String material, String color, String type,String design, String lengthType, String origin, String usage,double price, double weight) {

    this.brand = brand;
    this.material = material;
    this.color = color;
    this.type = type;
    this.design = design;
    this.lengthType = lengthType;
    this.origin = origin;
    this.usage = usage;
    this.price = price;
    this.weight = weight;
}

void display(){
	System.out.println("the brand is:"+brand);
	System.out.println("the material is:"+material);
	System.out.println("the color is:"+color);
	System.out.println("the type is:"+type);
	System.out.println("the design is:"+design);
	System.out.println("the length type is:"+lengthType);
	System.out.println("the origin is:"+origin);
	System.out.println("the usage is:"+usage);
	System.out.println("the price is:"+price);
	System.out.println("the weight is:"+weight);
	System.out.println("\n------------------\n");
	
}	
}