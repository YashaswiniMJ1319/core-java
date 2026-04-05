class ArtMaterialRunner {
    public static void main(String[] args) {

        ArtMaterial a1 = new ArtMaterial();
        ArtMaterial a2 = new ArtMaterial("Camlin");
        ArtMaterial a3 = new ArtMaterial("FaberCastell", "Pencils");
        ArtMaterial a4 = new ArtMaterial("Luxor", "Markers", "Mixed");
        ArtMaterial a5 = new ArtMaterial("Camlin", "Crayons", "Mixed", 250.0);
        ArtMaterial a6 = new ArtMaterial("Luxor", "Markers", "Mixed", 600.0, 350.0);

        a1.display();
        a2.display();
        a3.display();
        a4.display();
        a5.display();
        a6.display();
    }
}