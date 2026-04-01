class Stump{
	String type;
    String material;
    double height;
    double diameter;
    String color;
    double weight;
    String location;
    boolean isDry;
    int age;
    String condition;
	
	Stump(String type, String material, double height, double diameter, String color,
          double weight, String location, boolean isDry, int age, String condition) {

		this.type=type;
		this.material=material;
		this.height=height;
		this.diameter=diameter;
		this.color=color;
		this.weight=weight;
		this.location=location;
		this.isDry=isDry;
		this.age=age;
		this.condition=condition;
	}
}