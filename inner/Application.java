package com.exm.demo.inner;

public class Application {
    private String appName;
    private String developer;
    private double size;
    private double rating;
    private boolean free;

    public Application() {

    }

    public Application(String appName, String developer, double size, double rating, boolean free) {
        this.appName = appName;
        this.developer = developer;
        this.size = size;
        this.rating = rating;
        this.free = free;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            Application app1 = this;
            if (obj instanceof Application) {
                Application app2 = (Application) obj;
                if (app1.appName.equals(app2.appName) && app1.developer.equals(app2.developer)) {
                    return true;
                }
            }
        }

        return false;
    }
}
