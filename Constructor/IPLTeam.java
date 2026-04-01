class IPLTeam {

    String teamName;
    String captain;
    String coach;
    int titlesWon;
    String homeGround;
    int foundedYear;
    String owner;
    String primaryColor;
    int squadSize;
    boolean isActive;

    IPLTeam(String teamName, String captain, String coach, int titlesWon,
            String homeGround, int foundedYear, String owner,
            String primaryColor, int squadSize, boolean isActive) {

        this.teamName = teamName;
        this.captain = captain;
        this.coach = coach;
        this.titlesWon = titlesWon;
        this.homeGround = homeGround;
        this.foundedYear = foundedYear;
        this.owner = owner;
        this.primaryColor = primaryColor;
        this.squadSize = squadSize;
        this.isActive = isActive;
    }
}