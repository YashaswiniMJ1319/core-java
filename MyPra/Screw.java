class Screw {
static void details() {
String type = "Wood Screw";
String material = "Steel";
int length = 50;
int diameter = 5;
char grade='B';
double rating=24.35;
float weight = 2.5f;
int price = 20;

System.out.println(type);
System.out.println(material);
System.out.println(length);
System.out.println(diameter);
System.out.println(grade);
System.out.println(rating);
System.out.println(weight);
System.out.println(price);
    }
static void info(String type, int length, double weight, char grade) {
System.out.println(type);
System.out.println(length);
System.out.println(weight);
System.out.println(grade);
    }
}