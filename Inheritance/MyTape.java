class MyTape extends Tape {
	
	
	@Override
    void playTape() {
        System.out.println("playing tape in child");
    }

    void stopTape() {
        System.out.println("stopping tape in child");
    }

    void rewindTape() {
        System.out.println("rewinding tape in child");
    }
}