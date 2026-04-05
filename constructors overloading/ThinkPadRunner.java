class ThinkPadRunner {
    public static void main(String[] args) {

        ThinkPad t1 = new ThinkPad();
        ThinkPad t2 = new ThinkPad("Lenovo");
        ThinkPad t3 = new ThinkPad("Lenovo", "T14");
        ThinkPad t4 = new ThinkPad("Lenovo", "X1 Carbon", "Intel i7");
        ThinkPad t5 = new ThinkPad("Lenovo", "T14", "Intel i5", 120000.0);
        ThinkPad t6 = new ThinkPad("Lenovo", "P1", "Intel i9", 250000.0, 1.8);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
    }
}