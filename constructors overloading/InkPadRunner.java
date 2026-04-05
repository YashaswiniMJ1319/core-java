class InkPadRunner {
    public static void main(String[] args) {

        InkPad i1 = new InkPad();
        InkPad i2 = new InkPad("Camlin");
        InkPad i3 = new InkPad("FaberCastell", "Black");
        InkPad i4 = new InkPad("Luxor", "Red", "Stamp Ink");
        InkPad i5 = new InkPad("Camlin", "Blue", "Stamp Ink", 120.0);
        InkPad i6 = new InkPad("Luxor", "Red", "Stamp Ink", 200.0, 200.0);

        i1.display();
        i2.display();
        i3.display();
        i4.display();
        i5.display();
        i6.display();
    }
}