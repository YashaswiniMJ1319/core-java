class StopWatchRunner {

    public static void main(String... args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.stop();
        stopWatch.reset();
        stopWatch.pause();
        stopWatch.showTime();

        System.out.println("\n----------------------\n");

        StopWatch stopWatch1 = new StopWatch();
        stopWatch1.start();
        stopWatch1.stop();
        stopWatch1.reset();
    }
}