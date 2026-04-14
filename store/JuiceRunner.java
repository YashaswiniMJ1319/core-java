class JuiceRunner {
    public static void main(String[] args) {
        Juice juice = new Juice();

        juice.save("Orange");
        juice.save("Apple");
        juice.save("Mango");
        juice.save("Pineapple");
        juice.save("Grape");

        juice.store("Mango");
        juice.store("Banana");
    }
}