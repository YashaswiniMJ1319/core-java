class TyreRunner {
    public static void main(String[] args) {

        Tyre t1 = new Tyre();
        Tyre t2 = new Tyre("MRF");
        Tyre t3 = new Tyre("Michelin", "Radial");
        Tyre t4 = new Tyre("Bridgestone", "Tubeless", "245/45R18");
        Tyre t5 = new Tyre("MRF", "Tubeless", "205/55R16", 6000.0);
        Tyre t6 = new Tyre("Michelin", "Radial", "225/50R17", 8000.0, 14.0);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
    }
}