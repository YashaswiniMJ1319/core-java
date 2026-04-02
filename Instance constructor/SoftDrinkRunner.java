class SoftDrinkRunner {
    public static void main(String[] args) {

        SoftDrink s1 = new SoftDrink("CocaCola", "Cola", "Dark Brown", "Carbonated","Bottle", "USA", "High", "High", 50.0, 0.5);
        SoftDrink s2 = new SoftDrink("Pepsi", "Cola", "Dark Brown", "Carbonated","Can", "USA", "High", "High", 40.0, 0.33);
        SoftDrink s3 = new SoftDrink("Fanta", "Orange", "Orange", "Carbonated","Bottle", "USA", "High", "Medium", 45.0, 0.5);

        s1.display();
        s2.display();
        s3.display();
    }
}