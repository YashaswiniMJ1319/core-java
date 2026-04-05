class RocketRunner {
    public static void main(String[] args) {

        Rocket r1 = new Rocket();
        Rocket r2 = new Rocket("PSLV");
        Rocket r3 = new Rocket("Falcon 9", "USA");
        Rocket r4 = new Rocket("Soyuz", "Russia", "Crew Launch");
        Rocket r5 = new Rocket("PSLV", "India", "Satellite Launch", 150.0);
        Rocket r6 = new Rocket("Falcon 9", "USA", "Reusable", 500.0, 549000);

        r1.display();
        r2.display();
        r3.display();
        r4.display();
        r5.display();
        r6.display();
    }
}