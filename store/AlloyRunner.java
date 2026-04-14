class AlloyRunner {
    public static void main(String[] args) {
        Alloy alloy = new Alloy();

        alloy.save("Steel");
        alloy.save("Brass");
        alloy.save("Bronze");
        alloy.save("Stainless Steel");
        alloy.save("Duralumin");

        alloy.store("Bronze");
        alloy.store("Gold");
    }
}