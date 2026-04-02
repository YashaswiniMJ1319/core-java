class ThinkPadRunner {
    public static void main(String[] args) {

        ThinkPad t1 = new ThinkPad("Lenovo", "X1 Carbon", "Intel i7", "16GB","512GB SSD", "Black", "Windows 11", "Intel Iris Xe", 180000.0, 1.2);
        ThinkPad t2 = new ThinkPad("Lenovo", "T14", "Intel i5", "8GB","256GB SSD", "Black", "Windows 11", "Integrated", 120000.0, 1.5);
        ThinkPad t3 = new ThinkPad("Lenovo", "P1", "Intel i9", "32GB","1TB SSD", "Silver", "Windows 11", "NVIDIA RTX", 250000.0, 1.8);

        t1.display();
        t2.display();
        t3.display();
    }
}