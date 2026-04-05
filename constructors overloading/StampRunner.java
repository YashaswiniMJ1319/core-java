class StampRunner {
    public static void main(String[] args) {

        Stamp s1 = new Stamp();
        Stamp s2 = new Stamp("Camlin");
        Stamp s3 = new Stamp("FaberCastell", "Self-Inking");
        Stamp s4 = new Stamp("Luxor", "Embossing Stamp", "Red");
        Stamp s5 = new Stamp("Camlin", "Rubber Stamp", "Blue", 100.0);
        Stamp s6 = new Stamp("Luxor", "Embossing Stamp", "Red", 200.0, 70.0);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
    }
}