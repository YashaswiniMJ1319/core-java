class LiftRunner {
    public static void main(String[] args) {
        Lift lift = new Lift();

        lift.save("Passenger Lift");
        lift.save("Goods Lift");
        lift.save("Hospital Lift");
        lift.save("Capsule Lift");
        lift.save("Hydraulic Lift");

        lift.store("Hospital Lift");
        lift.store("Space Lift");
    }
}