class TapeRunner {

    public static void main(String... args) {

        Tape tape = new Tape();
        tape.playTape();
        tape.stopTape();
        tape.rewindTape();
        tape.forwardTape();
        tape.ejectTape();

        System.out.println("\n----------------------\n");

        Tape tape1 = new Tape();
        tape1.playTape();
        tape1.stopTape();
        tape1.rewindTape();
    }
}