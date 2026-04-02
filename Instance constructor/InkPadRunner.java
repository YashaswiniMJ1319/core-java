class InkPadRunner {
    public static void main(String[] args) {

        InkPad i1 = new InkPad("Camlin", "Blue", "Stamp Ink", "Medium","Foam", "Office", "India", "Rectangular", 120.0, 150.0);
        InkPad i2 = new InkPad("FaberCastell", "Black", "Stamp Ink", "Small","Rubber", "School", "Germany", "Square", 150.0, 100.0);
        InkPad i3 = new InkPad("Luxor", "Red", "Stamp Ink", "Large","Foam", "Home", "India", "Circular", 200.0, 200.0);

        i1.display();
        i2.display();
        i3.display();
    }
}