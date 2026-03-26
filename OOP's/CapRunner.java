class CapRunner{
	public static void main(String[] args) {
        Cap ref = new Cap();
        Cap price = new Cap();
        Cap rate = new Cap();
        Cap size = new Cap();
        Cap weight = new Cap();

        System.out.println("brand:" + ref.brand);
        System.out.println("price:" + price.price);
        System.out.println("rating:" + rate.rating);
        System.out.println("size:" + size.size);
        System.out.println("weight:" + weight.weight);

        ref.brand = "Nike";
        price.price = 500;
        rate.rating = 4.5f;
        size.size = 'M';
        weight.weight = 0.25;

        System.out.println("updated brand:" + ref.brand);
        System.out.println("updated price:" + price.price);
        System.out.println("updated rating:" + rate.rating);
        System.out.println("updated size:" + size.size);
        System.out.println("updated weight:" + weight.weight);
    }
}
