class IpodRunner {

    public static void main(String... args) {

        Ipod iPod = new Ipod();
        iPod.playMusic();
        iPod.pauseMusic();
        iPod.nextSong();
        iPod.previousSong();
        iPod.chargeIpod();

        System.out.println("\n----------------------\n");

        Ipod iPod1 = new Ipod();
        iPod1.playMusic();
        iPod1.pauseMusic();
        iPod1.nextSong();
    }
}