class PhotoFrameRunner {
    public static void main(String[] args) {
        PhotoFrame ref = new PhotoFrame();
        PhotoFrame size = new PhotoFrame();
        PhotoFrame rate = new PhotoFrame();
        PhotoFrame type = new PhotoFrame();
        PhotoFrame price = new PhotoFrame();

        System.out.println("the materials is:"+ref.material);
        System.out.println("the size is:"+size.size);
        System.out.println("the rating is :"+rate.rating);
        System.out.println("the type is :"+type.type);
        System.out.println("the price is :"+price.price);

        ref.material = "Wood";
        size.size = 12;
        rate.rating = 4.2f;
        type.type = 'D';
        price.price = 800;

        System.out.println("the updated material is:"+ref.material);
        System.out.println("the update size is:"+size.size);
        System.out.println("the update rating is :"+rate.rating);
        System.out.println("the update type is :"+type.type);
        System.out.println("the update price is :"+price.price);
    }
}
