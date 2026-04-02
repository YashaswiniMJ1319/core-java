class RocketRunner {
    public static void main(String[] args) {
        Rocket r1 = new Rocket("PSLV", "India", "Satellite Launch", "Solid","Earth Observation", "Sriharikota", "Active", "ISRO", 150.0, 320000);
        Rocket r2 = new Rocket("Falcon 9", "USA", "Reusable", "Liquid","Satellite & Cargo", "Cape Canaveral", "Active", "SpaceX", 500.0, 549000);
        Rocket r3 = new Rocket("Soyuz", "Russia", "Crew Launch","Liquid","Human Spaceflight", "Baikonur", "Active", "Roscosmos", 300.0, 305000);

        r1.display();
        r2.display();
        r3.display();
    }
}