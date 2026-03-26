class PowerBankRunner {
    public static void main(String[] args) {
        PowerBank ref = new PowerBank();
        PowerBank cap = new PowerBank();
        PowerBank rate = new PowerBank();
        PowerBank type = new PowerBank();
        PowerBank price = new PowerBank();

        System.out.println("the brand is:"+ref.brand);
        System.out.println("the capacity is:"+cap.capacity);
        System.out.println("the rating is:"+rate.rating);
        System.out.println("the type is :"+type.type);
        System.out.println("the price is :"+price.price);

        ref.brand = "Mi";
        cap.capacity = 20000;
        rate.rating = 4.3f;
        type.type = 'C';
        price.price = 1999;

        System.out.println("the updated brand is:"+ref.brand);
        System.out.println("the updated capacity is :"+cap.capacity);
        System.out.println("the updated rating is :"+rate.rating);
        System.out.println("the updated type is :"+type.type);
        System.out.println("the updated price is:"+price.price);
    }
}