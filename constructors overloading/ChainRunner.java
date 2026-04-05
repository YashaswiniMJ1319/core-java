class ChainRunner {
    public static void main(String[] args) {

        Chain c1 = new Chain();
        Chain c2 = new Chain("Tanishq");
        Chain c3 = new Chain("Malabar", "Gold");
        Chain c4 = new Chain("Kalyan", "Silver", "White");
        Chain c5 = new Chain("Tanishq", "Gold", "Yellow", 15000.0);
        Chain c6 = new Chain("Malabar", "Silver", "White", 8000.0, 15.2);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
    }
}