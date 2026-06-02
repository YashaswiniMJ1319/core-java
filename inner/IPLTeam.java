package com.exm.demo.inner;

public class IPLTeam {
    private String teamName;
    private String city;
    private String owner;
    private String homeGround;

    public IPLTeam(){

    }

    public IPLTeam(String teamName, String city, String owner, String homeGround) {
        this.teamName = teamName;
        this.city = city;
        this.owner = owner;
        this.homeGround = homeGround;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getHomeGround() {
        return homeGround;
    }

    public void setHomeGround(String homeGround) {
        this.homeGround = homeGround;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
          IPLTeam IPLTeam1=this;
          if(obj instanceof IPLTeam){
              IPLTeam IPLTeam2=(IPLTeam) obj;
              if(IPLTeam1.teamName.equals(IPLTeam2.teamName) && IPLTeam1.city.equals(IPLTeam2.city)){
                  return true;
              }
          }
        }
        return false;
    }
}
