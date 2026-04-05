class Rocket {

    String name;
    String country;
    String type;
    double cost;
    double weight;

    Rocket() {
        System.out.println("Default constructor");
    }

    Rocket(String name){
        this.name = name;
    }

    Rocket(String name, String country){
        this.name = name;
        this.country = country;
    }

    Rocket(String name, String country, String type){
        this.name = name;
        this.country = country;
        this.type = type;
    }

    Rocket(String name, String country, String type, double cost){
        this.name = name;
        this.country = country;
        this.type = type;
        this.cost = cost;
    }

    Rocket(String name, String country, String type, double cost, double weight){
        this.name = name;
        this.country = country;
        this.type = type;
        this.cost = cost;
        this.weight = weight;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Type: " + type);
        System.out.println("Cost: " + cost);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------------");
    }
}