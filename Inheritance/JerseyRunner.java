class JerseyRunner {

    public static void main(String... args) {

        Jersey jersey = new Jersey();
        jersey.wearJersey();
        jersey.washJersey();
        jersey.dryJersey();
        jersey.foldJersey();
        jersey.storeJersey();

        System.out.println("\n----------------------\n");

        Jersey jersey1 = new Jersey();
        jersey1.wearJersey();
        jersey1.washJersey();
        jersey1.dryJersey();
    }