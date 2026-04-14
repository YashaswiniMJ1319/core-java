class Alloy {
    String[] names = new String[5];
    int index = 0;

    void save(String name) {
        if (name != null) {
            if (this.index < this.names.length) {
                System.out.println("alloy name is within range");
                this.names[this.index] = name;
                System.out.println("stored alloy: " + name);
                System.out.println("position: " + this.index);
                this.index++;
            } else {
                System.out.println("storage is full");
            }
        } else {
            System.out.println("invalid alloy name");
        }
    }

    void store(String name) {
        int count = 0;
        if (name != null) {
            for (String temp : names) {
                if (name==temp) {  
                    System.out.println("alloy found: " + name);
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("alloy not found");
            }
        }
    }
}