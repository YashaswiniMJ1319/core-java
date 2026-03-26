class CupRunner {
    public static void main(String[] args) {
        Cup ref = new Cup();
        Cup cap = new Cup();
        Cup rate = new Cup();
        Cup type = new Cup();
        Cup price = new Cup();

        System.out.println("the materials is:"+ref.material);
        System.out.println("the capacity is:"+cap.capacity);
        System.out.println("the rating is :"+rate.rating);
        System.out.println("the type is :"+type.type);
        System.out.println("the price is :"+price.price);

        ref.material = "Glass";
        cap.capacity = 250;
        rate.rating = 4.0f;
        type.type = 'H';
        price.price = 150;

        System.out.println("the updated material is:"+ref.material);
        System.out.println("the update capacity is:"+cap.capacity);
        System.out.println("the update rating is :"+rate.rating);
        System.out.println("the update type is :"+type.type);
        System.out.println("the update price is :"+price.price);
    }
}