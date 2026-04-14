class SparkPlugRunner {
    public static void main(String[] args) {
        SparkPlug sparkPlug = new SparkPlug();

        sparkPlug.save("Copper Spark Plug");
        sparkPlug.save("Iridium Spark Plug");
        sparkPlug.save("Platinum Spark Plug");
        sparkPlug.save("Double Platinum");
        sparkPlug.save("Racing Spark Plug");

        sparkPlug.store("Iridium Spark Plug");
        sparkPlug.store("Diesel Plug");
    }
}