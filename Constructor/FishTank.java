class FishTank {
    String shape;
    String material;
    double capacity;
    String waterType;
    int numberOfFish;
    String fishType;
    String color;
    boolean hasFilter;
    double price;
    String location;

    FishTank(String shape, String material, double capacity, String waterType,
             int numberOfFish, String fishType, String color,
             boolean hasFilter, double price, String location) {

        this.shape = shape;
        this.material = material;
        this.capacity = capacity;
        this.waterType = waterType;
        this.numberOfFish = numberOfFish;
        this.fishType = fishType;
        this.color = color;
        this.hasFilter = hasFilter;
        this.price = price;
        this.location = location;
    }
}

