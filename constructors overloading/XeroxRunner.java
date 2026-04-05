class XeroxRunner {
    public static void main(String[] args) {

        Xerox x1 = new Xerox();
        Xerox x2 = new Xerox("Canon");
        Xerox x3 = new Xerox("HP", "All-in-One");
        Xerox x4 = new Xerox("Epson", "Scanner", "Grey");
        Xerox x5 = new Xerox("Canon", "Printer", "White", 15000.0);
        Xerox x6 = new Xerox("HP", "All-in-One", "Black", 20000.0, 15.0);

        x1.display();
        x2.display();
        x3.display();
        x4.display();
        x5.display();
        x6.display();
    }
}