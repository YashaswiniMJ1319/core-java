class District {
static void run() {
System.out.println("It is district");
taxing();
}
static void taxing() {
System.out.println("It is taxing");
measure();
}
static void measure() {
System.out.println("It is measured");
collect();
    }
static void collect() {
System.out.println("I am collecting");
revenue();
    }
static void revenue() {
System.out.println("It is revenue");
budget();
    }
static void budget() {
System.out.println("It is budget");
    }
}