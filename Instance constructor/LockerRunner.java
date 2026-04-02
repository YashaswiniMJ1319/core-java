class LockerRunner {
    public static void main(String[] args) {
        Locker l1 = new Locker("Godrej", "Steel", "Grey", "Home","Digital", "Large", "Jewelry Storage", "India", 25000.0, 45.5);
        Locker l2 = new Locker("Yale", "Alloy", "Black", "Office","Key Lock", "Medium", "Document Storage", "USA", 18000.0, 35.0);
        Locker l3 = new Locker("Samsung", "Metal", "Silver", "Bank","Biometric", "Large", "Cash Storage", "Korea", 40000.0, 50.0);
				
        l1.display();
        l2.display();
        l3.display();
    }
}