class StampRunner {
    public static void main(String[] args) {

        Stamp s1 = new Stamp("Camlin", "Rubber Stamp", "Blue", "Medium","Rubber", "Office", "India", "Rectangular", 100.0, 50.0);
        Stamp s2 = new Stamp("FaberCastell", "Self-Inking", "Black", "Small","Plastic", "School", "Germany", "Square", 150.0, 45.0);
        Stamp s3 = new Stamp("Luxor", "Embossing Stamp", "Red", "Large","Metal", "Home", "India", "Circular", 200.0, 70.0);

        s1.display();
        s2.display();
        s3.display();
    }
}