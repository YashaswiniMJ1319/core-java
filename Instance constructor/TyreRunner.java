class TyreRunner {
    public static void main(String[] args) {

        Tyre t1 = new Tyre("MRF", "Tubeless", "205/55R16", "Rubber","All-Season", "Car", "India", "All-Season", 6000.0, 12.5);
        Tyre t2 = new Tyre("Michelin", "Radial", "225/50R17", "Rubber","Winter", "Car", "France", "Winter", 8000.0, 14.0);
        Tyre t3 = new Tyre("Bridgestone", "Tubeless", "245/45R18", "Rubber","Summer", "SUV", "Japan", "Summer", 10000.0, 16.0);

        t1.display();
        t2.display();
        t3.display();
    }
}