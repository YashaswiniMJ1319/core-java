class BiometricRunner {
    public static void main(String[] args) {
        Biometric biometric = new Biometric();

        biometric.save("Fingerprint");
        biometric.save("Iris");
        biometric.save("Face");
        biometric.save("Voice");
        biometric.save("Palm");

        biometric.store("Face");
        biometric.store("DNA");
    }
}