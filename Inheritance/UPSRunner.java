class UPSRunner {

    public static void main(String... args) {

        UPS ups = new UPS();
        ups.supplyPower();
        ups.chargeBattery();
        ups.switchMode();
        ups.checkStatus();
        ups.shutdownUPS();

        System.out.println("\n----------------------\n");

        UPS ups1 = new UPS();
        ups1.supplyPower();
        ups1.chargeBattery();
        ups1.switchMode();
    }
}