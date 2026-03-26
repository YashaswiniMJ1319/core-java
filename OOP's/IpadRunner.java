class IpadRunner {
    public static void main(String[] args) {
        Ipad ref = new Ipad();
        Ipad storage = new Ipad();
        Ipad rate = new Ipad();
        Ipad ver = new Ipad();
        Ipad price = new Ipad();

        System.out.println("the model is:"+ref.model);
        System.out.println("the storage is:"+storage.storage);
        System.out.println("the rating is:"+rate.rating);
        System.out.println("the version is :"+ver.version);
        System.out.println("the price is :"+price.price);

        ref.model = "Air";
        storage.storage = 128;
        rate.rating = 4.7f;
        ver.version = 'M';
        price.price = 60000;

        System.out.println("the updated model:"+ref.model);
        System.out.println("the updated storage is :"+storage.storage);
        System.out.println("the updated rating is :"+rate.rating);
        System.out.println("the updated version is :"+ver.version);
        System.out.println("the updated price is :"+price.price);
    }
}