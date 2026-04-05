class LockerRunner {
    public static void main(String[] args) {

        Locker l1 = new Locker();
        Locker l2 = new Locker("Godrej");
        Locker l3 = new Locker("Yale", "Steel");
        Locker l4 = new Locker("Samsung", "Metal", "Silver");
        Locker l5 = new Locker("Godrej", "Steel", "Grey", 25000.0);
        Locker l6 = new Locker("Yale", "Alloy", "Black", 18000.0, 35.0);

        l1.display();
        l2.display();
        l3.display();
        l4.display();
        l5.display();
        l6.display();
    }
}