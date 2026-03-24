class CountryPresident {
    public static void main(String[] args) {

        String[] countries = {"India","USA","Russia","China","France","Germany","Brazil","Japan","South Korea","South Africa","Canada","UK","Australia","Italy","Spain","Mexico","Indonesia","Turkey","Saudi Arabia","Argentina","Pakistan","Sri Lanka","Bangladesh","Nepal","UAE",
        "Egypt","Iran","Iraq","Israel","Thailand","Vietnam","Philippines","Malaysia","Singapore","New Zealand","Norway","Sweden","Denmark","Finland","Poland",
        "Netherlands","Belgium","Switzerland","Austria","Greece","Portugal","Chile","Colombia","Peru","Venezuela","Qatar","Kuwait","Oman","Morocco","Algeria",
        "Kenya","Nigeria","Ethiopia","Ghana","Zimbabwe","Ireland","Iceland","Hungary","Czech Republic","Slovakia","Romania","Bulgaria","Croatia","Serbia","Slovenia"};

        System.out.println("Number of countries: " + countries.length);

        for (int start = 0; start < countries.length; start++) {

            String[] president = CountryDetails.getPresidentName(countries[start]);

            if (president != null) {
                for (int end=0;end<president.length;end++) {
                    System.out.println("President: " + president[end]);
                }
            }
        }
    }
}