class DynamoRunner {
    public static void main(String[] args) {
        Dynamo dynamo = new Dynamo();

        dynamo.save("Bicycle Dynamo");
        dynamo.save("AC Dynamo");
        dynamo.save("DC Dynamo");
        dynamo.save("Car Dynamo");
        dynamo.save("Wind Dynamo");

        dynamo.store("DC Dynamo");
        dynamo.store("Solar Dynamo");
    }
}