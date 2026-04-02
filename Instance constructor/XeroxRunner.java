class XeroxRunner {
    public static void main(String[] args) {
        Xerox x1 = new Xerox("Canon", "Printer", "White", "Medium","Fast", "Office", "Japan", "C123", 15000.0, 12.5);
        Xerox x2 = new Xerox("HP", "All-in-One", "Black", "Large","Very Fast", "Business", "USA", "H456", 20000.0, 15.0);
        Xerox x3 = new Xerox("Epson", "Scanner", "Grey", "Compact","Moderate", "Home", "Japan", "E789", 10000.0, 10.2);

        x1.display();
        x2.display();
        x3.display();
    }
}