class PodiumRunner {

    public static void main(String... args) {

        Podium podium = new Podium();
        podium.speak();
        podium.adjustHeight();
        podium.cleanPodium();
        podium.placeMic();
        podium.movePodium();

        System.out.println("\n----------------------\n");

        Podium podium1 = new Podium();
        podium1.speak();
        podium1.adjustHeight();
        podium1.cleanPodium();
    }
}