class Rocket {

    String name;
    String country;
    String type;
    String fuelType;
    String mission;
    String launchSite;
    String status;
    String agency;
    double cost;
    double weight;

    Rocket(String name, String country, String type, String fuelType,String mission, String launchSite, String status, String agency,double cost, double weight) 
	{

        this.name = name;
        this.country = country;
        this.type = type;
        this.fuelType = fuelType;
        this.mission = mission;
        this.launchSite = launchSite;
        this.status = status;
        this.agency = agency;
        this.cost = cost;
        this.weight = weight;
    }

    void display() {
        System.out.println("the name is: " + name);
        System.out.println("the country is: " + country);
        System.out.println("the type is: " + type);
        System.out.println("the fuel type is: " + fuelType);
        System.out.println("the mission is: " + mission);
        System.out.println("the launch site is: " + launchSite);
        System.out.println("the status is: " + status);
        System.out.println("the agency is: " + agency);
        System.out.println("the cost is: " + cost);
        System.out.println("the weight is: " + weight);
        System.out.println("----------------------------");
    }
}

