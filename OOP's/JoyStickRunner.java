class JoyStickRunner {
    public static void main(String[] args) {
        JoyStick ref = new JoyStick();
        JoyStick btn = new JoyStick();
        JoyStick rate = new JoyStick();
        JoyStick type = new JoyStick();
        JoyStick price = new JoyStick();

        System.out.println("the brand is:"+ref.brand);
        System.out.println("the number of buttond:"+btn.buttons);
        System.out.println("the rating is :"+rate.rating);
        System.out.println("the type is :"+type.type);
        System.out.println("the price is :"+price.price);

        ref.brand = "Sony";
        btn.buttons = 12;
        rate.rating = 4.6f;
        type.type = 'W';
        price.price = 3500;

        System.out.println("the updated brand is:"+ref.brand);
        System.out.println("the updated number of buttond:"+btn.buttons);
        System.out.println("the updated  rating is :"+rate.rating);
        System.out.println("the updated type is :"+type.type);
        System.out.println("the updated  price is :"+price.price);
    }
}