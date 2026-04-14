class Aeroplane {
    String[] names = new String[5];
    int index = 0;

    void save(String name) {
        if (name != null) {
            if (this.index < this.names.length) {
                System.out.println("aeroplane name is within range");
                this.names[this.index] = name;
                System.out.println("stored aeroplane: " + name);
                System.out.println("position: " + this.index);
                this.index++;
            } else {
                System.out.println("storage is full");
            }
        } else {
            System.out.println("invalid aeroplane name");
        }
    }

    void store(String name) {
        int count = 0;
        if (name != null) {
            for (String temp : names) {
                if (name==temp) {  
                    System.out.println("aeroplane found: " + name);
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("aeroplane not found");
            }
        }
    }
}