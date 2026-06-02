package com.exm.demo.outer;

import com.exm.demo.inner.IPLTeam;

public class IPLTeamRunner {
    public static void main(String[] args) {

        IPLTeam IPLTeam1=new IPLTeam("Royal Challengers Bengaluru", "Bengaluru", "United Spirits", "M. Chinnaswamy Stadium");

        IPLTeam IPLTeam2=new IPLTeam("CSK", "Chennai", "N. Srinivasan", "M. Chinnaswamy Stadium");

        IPLTeam IPLTeam3=new IPLTeam("CSK", "Chennai", "N. Srinivasan", "M. Chinnaswamy Stadium");

        boolean isSame=IPLTeam1.equals(IPLTeam2);
        System.out.println("is the team name and city is same:"+isSame);

        boolean isCorrect=IPLTeam2.equals(IPLTeam3);
        System.out.println("is the team name and city is same:"+isCorrect);


    }
}
