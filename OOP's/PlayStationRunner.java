class PlayStationRunner {
    public static void main(String[] args) {

        PlayStation ref = new PlayStation();
        PlayStation storage = new PlayStation();
        PlayStation rate = new PlayStation();
        PlayStation ver = new PlayStation();
        PlayStation price = new PlayStation();

        System.out.println(ref.model + " " + ref.storage + " " + ref.rating + " " + ref.version + " " + ref.price);
        System.out.println(storage.model + " " + storage.storage + " " + storage.rating + " " + storage.version + " " + storage.price);
        System.out.println(rate.model + " " + rate.storage + " " + rate.rating + " " + rate.version + " " + rate.price);
        System.out.println(ver.model + " " + ver.storage + " " + ver.rating + " " + ver.version + " " + ver.price);
        System.out.println(price.model + " " + price.storage + " " + price.rating + " " + price.version + " " + price.price);

        ref.model = "PS5";
        ref.storage = 825;
        ref.rating = 4.9f;
        ref.version = 'V';
        ref.price = 50000;

        System.out.println("updated model:" + ref.model);
        System.out.println("updated storage:" + storage.storage);
        System.out.println("updated rating:" + rate.rating);
        System.out.println("updated version:" + ver.version);
        System.out.println("updated price:" + price.price);

        storage.model = "PS4";
        storage.storage = 500;
        storage.rating = 4.5f;
        storage.version = 'P';
        storage.price = 30000;

        rate.model = "PS4 Pro";
        rate.storage = 1000;
        rate.rating = 4.6f;
        rate.version = 'R';
        rate.price = 35000;

        ver.model = "PS3";
        ver.storage = 320;
        ver.rating = 4.2f;
        ver.version = 'S';
        ver.price = 20000;

        price.model = "PS2";
        price.storage = 160;
        price.rating = 4.0f;
        price.version = 'T';
        price.price = 15000;

        System.out.println(storage.model + " " + storage.storage + " " + storage.rating + " " + storage.version + " " + storage.price);
        System.out.println(rate.model + " " + rate.storage + " " + rate.rating + " " + rate.version + " " + rate.price);
        System.out.println(ver.model + " " + ver.storage + " " + ver.rating + " " + ver.version + " " + ver.price);
        System.out.println(price.model + " " + price.storage + " " + price.rating + " " + price.version + " " + price.price);
    }
}