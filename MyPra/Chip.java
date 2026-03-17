class Chip {
static void details() {
String name = "Intel";
String type = "Processor";
String material = "Silicon";
byte cores = 8;
double speed = 3.5;
char grade = 'B';
float voltage = 1.2f;
int price = 15000;

System.out.println(name);
System.out.println(type);
System.out.println(material);
System.out.println(cores);
System.out.println(speed);
System.out.println(grade);
System.out.println(voltage);
System.out.println(price);
    }

static void info(String name, byte cores, double speed, char grade) {
System.out.println(name);
System.out.println(cores);
System.out.println(speed);
System.out.println(grade);
    }
}
