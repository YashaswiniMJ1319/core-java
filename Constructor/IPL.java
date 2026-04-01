class IPL {

    String leagueName;
    int seasonYear;
    int totalTeams;
    int totalMatches;
    String sponsor;
    String hostCountry;
    String currentChampion;
    String mostTitlesTeam;
    boolean isActive;
    String format;

    IPL(String leagueName, int seasonYear, int totalTeams, int totalMatches,
        String sponsor, String hostCountry, String currentChampion,
        String mostTitlesTeam, boolean isActive, String format) {

        this.leagueName = leagueName;
        this.seasonYear = seasonYear;
        this.totalTeams = totalTeams;
        this.totalMatches = totalMatches;
        this.sponsor = sponsor;
        this.hostCountry = hostCountry;
        this.currentChampion = currentChampion;
        this.mostTitlesTeam = mostTitlesTeam;
        this.isActive = isActive;
        this.format = format;
    }
}