public class Report {
    private String title;
    private int noOfPages;
    private double lineSpace;
    private int cost;

    public Report(){

    }

    public Report(String title, int noOfPages, double lineSpace, int cost) {

        this.title = title;
        this.noOfPages = noOfPages;
        this.lineSpace = lineSpace;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public double getLineSpace() {
        return lineSpace;
    }

    public void setLineSpace(double lineSpace) {
        this.lineSpace = lineSpace;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj !=null) {
            Report report1 = this;
            if (obj instanceof Report) {
                Report report2 = (Report) obj;
                if (report1.title.equals(report2.title) && report1.noOfPages == report2.noOfPages) {
                    return true;

                }
            }
        }
            return false;

        }

}
