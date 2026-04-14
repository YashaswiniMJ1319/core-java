class AeroplaneRunner {
    public static void main(String[] args) {
        Aeroplane aeroplane = new Aeroplane();

        aeroplane.save("Boeing 747");
        aeroplane.save("Airbus A320");
        aeroplane.save("Boeing 777");
        aeroplane.save("Airbus A380");
        aeroplane.save("Concorde");

        aeroplane.store("Boeing 777");
        aeroplane.store("F-22");
    }
}