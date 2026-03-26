class PlayStationRunner {
    public static void main(String[] args) {
        PlayStation ref = new PlayStation();
        PlayStation storage = new PlayStation();
        PlayStation rate = new PlayStation();
        PlayStation ver = new PlayStation();
        PlayStation price = new PlayStation();

        System.out.println("the model is:"+ref.model);
        System.out.println("the storage is:"+storage.storage);
        System.out.println("the rating is :"+rate.rating);
        System.out.println("the version is :"+ver.version);
        System.out.println("the price is :"+price.price);

        ref.model = "PS5";
        storage.storage = 825;
        rate.rating = 4.9f;
        ver.version = 'V';
        price.price = 50000;

        System.out.println("the update model is:"+ref.model);
        System.out.println("the update storage is:"+storage.storage);
        System.out.println("the update rating is :"+rate.rating);
        System.out.println("the update version is :"+ver.version);
        System.out.println("the update price is :"+price.price);
    }
}
