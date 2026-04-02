class ArtMaterialRunner {
    public static void main(String[] args) {

        ArtMaterial a1 = new ArtMaterial("Camlin", "Crayons", "Mixed", "Wax","Medium", "School", "India", "Box", 250.0, 300.0);
        ArtMaterial a2 = new ArtMaterial("FaberCastell", "Pencils", "Mixed", "Wood","Small", "Sketching", "Germany", "Set", 500.0, 400.0);
        ArtMaterial a3 = new ArtMaterial("Luxor", "Markers", "Mixed", "Plastic","Large", "Art Projects", "India", "Pack", 600.0, 350.0);
        a1.display();
        a2.display();
        a3.display();
    }
}