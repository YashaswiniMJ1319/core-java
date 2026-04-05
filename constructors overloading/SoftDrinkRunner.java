class SoftDrinkRunner {
    public static void main(String[] args) {

        SoftDrink s1 = new SoftDrink();
        SoftDrink s2 = new SoftDrink("CocaCola");
        SoftDrink s3 = new SoftDrink("Pepsi", "Cola");
        SoftDrink s4 = new SoftDrink("Fanta", "Orange", "Orange");
        SoftDrink s5 = new SoftDrink("CocaCola", "Cola", "Dark Brown", 50.0);
        SoftDrink s6 = new SoftDrink("Pepsi", "Cola", "Dark Brown", 40.0, 0.33);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
    }
}