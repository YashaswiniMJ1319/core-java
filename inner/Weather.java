package com.exm.demo.inner;

public class Weather {

    private String climate;
    private int temperature;
    private String city;
    private int humidity;
    private boolean raining;

    public Weather() {

    }

    public Weather(String climate, int temperature, String city, int humidity, boolean raining) {
        this.climate = climate;
        this.temperature = temperature;
        this.city = city;
        this.humidity = humidity;
        this.raining = raining;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public boolean isRaining() {
        return raining;
    }

    public void setRaining(boolean raining) {
        this.raining = raining;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            Weather weather1 = this;
            if(obj instanceof Weather) {
                Weather weather2 = (Weather) obj;
                if(weather1.city.equals(weather2.city) && weather1.temperature == weather2.temperature) {
                    return true;
                }
            }
        }
        return false;
    }
}


